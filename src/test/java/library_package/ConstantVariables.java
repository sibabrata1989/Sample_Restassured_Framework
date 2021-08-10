package library_package;

public interface ConstantVariables {
    //Status code...................................
    int SUCCESS_OK = 200;
    int CREATED = 201;
    int BAD_REQUEST = 400;
    int INTERNAL_SERVER_ERROR = 500;
    int UNAUTHORIZED = 401;

    //Resource Path
    String base_url = "http://localhost:8080";
    String create_dataset = "/dataset";
    String create_project = "/project";
    String get_dataset = "/get_dataset";
    String delete_dataset = "/delete_dataset";

}
