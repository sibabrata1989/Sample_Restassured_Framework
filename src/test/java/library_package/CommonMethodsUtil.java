package library_package;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CommonMethodsUtil implements ConstantVariables {

    public static Response postMethod(String payload, String resourcePath) {

        RestAssured.baseURI = base_url;

        Response response = RestAssured.

                given().contentType(ContentType.JSON).accept(ContentType.JSON).body(payload).

                when().post(resourcePath);

        return response;

    }

    public static Response getMethod(String userName, String resourcePath) {

        RestAssured.baseURI = base_url;

        Response response = RestAssured.

                given().pathParam("username", userName).

                when().get(resourcePath);

        return response;

    }

    public static Response putMethod(String userName, String payload, String resourcePath) {

        RestAssured.baseURI = base_url;

        Response response = RestAssured.

                given().contentType(ContentType.JSON).accept(ContentType.JSON).

                pathParam("username", userName).body(payload).

                when().put(resourcePath);

        return response;

    }

    public static Response deleteMethod(String userName, String resourcePath) {

        RestAssured.baseURI = base_url;

        Response response = RestAssured.

                given().pathParam("username", userName).

                when().delete(resourcePath);

        return response;

    }
}
