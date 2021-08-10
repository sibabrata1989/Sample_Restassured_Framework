package test_package;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import library_package.ConstantVariables;
import library_package.ReusableMethodsUtil;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import static io.restassured.RestAssured.given;

public class DataSetTest implements ConstantVariables {
    Properties prp;
    String payload;
    JsonPath json = null;
    String token;
    Random rnd = new Random();


    private void preConditionSet(String host, String payLoadPath) throws IOException {
        payload = ReusableMethodsUtil.generateStringFromResources(payLoadPath);
        prp = ReusableMethodsUtil.getPropertyFile();
        RestAssured.baseURI = prp.getProperty(host);
    }


    @BeforeClass
    public void commonService() throws IOException {
        try {
            preConditionSet("HOST", "src/test/resources/Dataset/createDataset.json");
            Response res = given()
                    .header("Content-Type", "application/json")
                    .body(payload)

                    .when()
                    .post("/oauth/token")

                    .then()
                    .assertThat().statusCode(SUCCESS_OK)
                    .extract().response();
            String responseString = res.asString();
            JsonPath js = new JsonPath(responseString);
            token = js.get("access_token");
            System.out.println("token is :" + token);
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("Token generate precondition failed!");
        }
    }

    @Test(priority = 1)
    public void CreateProject() {

        try {

            preConditionSet("HOST", "./Resources/CareerBuilder/searchCompany.json");
            Response res = given()
                    .header("Content-Type", "application/json")
                    .header("Authorization", token)
                    .body(payload)
                    .when()
                    .post("/core/smartrecognition/company/search")
                    .then()
                    .assertThat().statusCode(SUCCESS_OK)
                    .extract().response();
            String responseString = res.asString();
            JsonPath js = new JsonPath(responseString);

            Assert.assertEquals(json.get("data.companies[0].company_name"), "CVS Health Corporation");
            Assert.assertEquals(json.get("data.companies[0].address"), "11670 Plaza America Drive");
            Assert.assertEquals(json.get("data.companies[0].city"), "Reston");
            Assert.assertEquals(json.get("data.companies[0].admin_area"), "VA");

            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("The verify User Exist failed!");
        }

    }


}

