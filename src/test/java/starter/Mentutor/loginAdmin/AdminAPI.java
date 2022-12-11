package starter.Mentutor.loginAdmin;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import java.io.File;

public class AdminAPI {

    public static final String URL = "https://ecommerce-alta.online";
    public static final String DIR = System.getProperty("user.dir");
    public static final String JSON_REQ_BODY = DIR + "/src/test/resources/JSON/RequestBody";
    public static final String JSON_SCHEMA = DIR + "/src/test/resources/JSON/JsonSchema";
    public static String ATTACHMENTS = DIR + "/src/test/resources/Attachment";

    public static final String BEARER_ADMIN = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJJZENsYXNzIjowLCJhdXRob3JpemVkIjp0cnVlLCJleHAiOjE2NzAyNzIxODAsInJvbGUiOiJhZG1pbiIsInVzZXJJZCI6MTAwMH0.eWUvfz9pM-FDn84xwYMO88XnDzSosWts1LGoBVoacsI";
    public static String LOGIN = URL + "/login";
    public static String GET_ALL_USER = URL + "/admin/users";
    //    public static String ID = "data.id";
    public static String ADMIN_MANAGE_USERS = URL + "/admin/users";
    public static String ADMIN_MANAGE_CLASSES = URL + "/admin/classes";
    public static String ADMIN_MANAGE_USERS_PROFILE = URL + "/admin/users/{id_user}";
    public static String ADMIN_MANAGE_CLASS = URL + "/admin/classes/{id}";

    //Rimasya
    // DELETE CLASS
    public static String ADMIN_DELETE_CLASS = URL+"/admin/classes/{id_class}";
    public static String ADMIN_DELETE_CLASS_WITHOUTID = URL+"/admin/classes/";
    public static String ADMIN_DELETE_CLASS_INVALID = URL+"/admin/classesqa/{id_class}";
    public static String ADMIN_UPDATE_CLASS = URL+"/admin/classes/{id_class}";
    // DELETE USER
    public static String ADMIN_DELETE_USER =URL+"/admin/users/{id_user}";
    public static String DELETE_USER_INVALID_PARAM =URL+"/admin/usersdew/{id_user}";
    public static String ADMIN_MANAGE_USERS_INVALID = URL+"/admin/userssz/{id_user}";


    public static String MENTOR_UPDATE_USER = URL + "/users";
    public static String MANAGE_TASK = URL + "/mentors/task";
    public static String MANAGE_SPECIFIC_TASK_ID = URL + "/mentors/task/{id_task}";
    public static String MENTOR_MANAGE_TASK_SCORE = URL + "/mentors/submission/{id_submission}";
    public static String MENTOR_ADD_COMMENT = URL + "/forum/{id_status}";

    public static String MENTEE_UPDATE_PROFILE = URL + "/users";
    public static String MENTEE_GET_ALL_TASK = URL + "/mentees/tasks";
    public static String MENTEE_POST_SUBMIT_TASK = URL + "/mentees/submission/{id_task}";
    public static String MENTEE_POST_COMMENT_FORUM = URL + "/forum/{id_status}";

    public static String MANAGE_FORUM = URL + "/forum";

    @Step("Post Login User")
    public void postLoginUser(File json) {
        SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(json);
    }

    @Step("Get all users with authorization")
    public void getAllUserWithAuthorization() {
        SerenityRest
                .given()
                .headers("Authorization", BEARER_ADMIN);
    }

    @Step("Get all users without authorization")
    public void getAllUserWithoutAuthorization(){
        SerenityRest.given().log().all();
    }

    @Step("Register new user with valid data")
    public void registerNewUserWithValidData(File json) {
        SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(json).headers("Authorization", BEARER_ADMIN);
    }

    @Step("Register new user with valid data without authorization")
    public void registerNewUserWithValidDataWithoutAuthorization(){
        SerenityRest.given().log().all();
    }

    @Step("Get all classes with authorization")
    public void getAllClassesWithAuthorization() {
        SerenityRest.given()
                .headers("Authorization", BEARER_ADMIN);
    }
    @Step("Get all classes without authorization")
    public void getAllClassessWithoutAuthorization(){
        SerenityRest.given().log().all();
    }

    @Step("Register new user empty name")
    public void registerNewUserEmptyName(File json) {
        SerenityRest.given().contentType(ContentType.JSON)
                .body(json).headers("Authorization", BEARER_ADMIN);
    }

    @Step("Register new user empty email")
    public void registerNewUserEmptyEmail(File json) {
        SerenityRest.given().contentType(ContentType.JSON)
                .body(json).headers("Authorization", BEARER_ADMIN);
    }

    @Step("Register new user empty password")
    public void registerNewUserEmptyPassword(File json) {
        SerenityRest.given().contentType(ContentType.JSON)
                .body(json).headers("Authorization", BEARER_ADMIN);
    }

    @Step("Register new user empty id class")
    public void registerNewUserEmptyIdClass(File json) {
        SerenityRest.given().contentType(ContentType.JSON)
                .body(json).headers("Authorization", BEARER_ADMIN);
    }

    @Step("Register new user empty role")
    public void registerNewUserEmptyRole(File json) {
        SerenityRest.given().contentType(ContentType.JSON)
                .body(json).headers("Authorization", BEARER_ADMIN);
    }

    @Step("Register new user with alpha numeric name input")
    public void registerNewUserAlphaNumInNameInput(File json) {
        SerenityRest.given().contentType(ContentType.JSON)
                .body(json).headers("Authorization", BEARER_ADMIN);
    }

    @Step("Register new user with alphabet and special char name input")
    public void registerNewUserAlphabetSpecialCharInNameInput(File json) {
        SerenityRest.given().contentType(ContentType.JSON)
                .body(json).headers("Authorization", BEARER_ADMIN);
    }

    @Step("Register new user with numeric name input")
    public void registerNewUserNumericNameInput(File json) {
        SerenityRest.given().contentType(ContentType.JSON)
                .body(json).headers("Authorization", BEARER_ADMIN);
    }

    @Step("Register new user with special char name input")
    public void registerNewUserSpecialCharNameInput(File json) {
        SerenityRest.given().contentType(ContentType.JSON)
                .body(json).headers("Authorization", BEARER_ADMIN);
    }

    @Step("Register new user without email suffix")
    public void registerNewUserWithoutEmailSuffix(File json) {
        SerenityRest.given().contentType(ContentType.JSON)
                .body(json).headers("Authorization", BEARER_ADMIN);
    }

    @Step("Register new user without uppercase in password")
    public void registerNewUserWithoutUppercaseInPassword(File json) {
        SerenityRest.given().contentType(ContentType.JSON)
                .body(json).headers("Authorization", BEARER_ADMIN);
    }

    @Step("Register new user without numeric in password")
    public void registerNewUserWithoutNumericInPassword(File json) {
        SerenityRest.given().contentType(ContentType.JSON)
                .body(json).headers("Authorization", BEARER_ADMIN);
    }

    @Step("Register new user without special char in password")
    public void registerNewUserWithoutSpecialCharInPassword(File json) {
        SerenityRest.given().contentType(ContentType.JSON)
                .body(json).headers("Authorization", BEARER_ADMIN);
    }

    @Step("Register new user with alphabet in id class")
    public void registerNewUserWithAlphabetInIdClass(File json) {
        SerenityRest.given().contentType(ContentType.JSON)
                .body(json).headers("Authorization", BEARER_ADMIN);
    }

    @Step("Register new user with special char in id class")
    public void registerNewUserWithSpecialCharInIdClass(File json) {
        SerenityRest.given().contentType(ContentType.JSON).body(json).headers("Authorization", BEARER_ADMIN);
    }

    @Step("Register new user with numeric in role")
    public void registerNewUserWithNumericInRole(File json) {
        SerenityRest.given().contentType(ContentType.JSON)
                .body(json).headers("Authorization", BEARER_ADMIN);
    }

    @Step("Register new user with special char in role")
    public void registerNewUserWithSpecialCharInRole(File json) {
        SerenityRest.given().contentType(ContentType.JSON)
                .body(json).headers("Authorization", BEARER_ADMIN);
    }

    @Step("Create new class with valid data")
    public void createNewClassWithValidData(File json) {
        SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(json).headers("Authorization", BEARER_ADMIN);
    }

    @Step("Create new class without authorization")
    public void createNewClassWithoutAuthorization(){
        SerenityRest.given().log().all();
    }

    @Step("Create new class with numeric input")
    public void createNewClassNumericInput(File json) {
        SerenityRest.given().contentType(ContentType.JSON)
                .body(json).headers("Authorization", BEARER_ADMIN);
    }

    @Step("Create new class with special char input")
    public void createNewClassSpecialCharInput(File json) {
        SerenityRest.given().contentType(ContentType.JSON)
                .body(json).headers("Authorization", BEARER_ADMIN);
    }

    @Step("Create new class with empty input")
    public void createNewClassEmptyInput(File json) {
        SerenityRest.given().contentType(ContentType.JSON)
                .body(json).headers("Authorization", BEARER_ADMIN);
    }

    @Step("Update user with valid data and authorization")
    public void updateUserWithValidDataAndAuthorization(int id_user) {
        SerenityRest.given()
                .multiPart("name", "Jalan Ahmad Lutfi acbde")
                .multiPart("email", "jalanahmad.mentee@gmail.com")
                .multiPart("password", "Riza123$")
                .multiPart("images", new File(ATTACHMENTS + "/download.png"))
                .multiPart("id_class", 25)
                .pathParam("id_user", id_user)
                .headers("Authorization", BEARER_ADMIN);
    }
    @Step("Update user with valid data without authorization")
    public void updateUserWithValidDataWithoutAuthorization(int id_user) {
        SerenityRest.given()
                .multiPart("name", "Ahmad Lutfi acbde")
                .multiPart("email", "ahmad.mentee@gmail.com")
                .multiPart("password", "Riza123$")
                .multiPart("images", new File(ATTACHMENTS + "/download.png"))
                .multiPart("id_class", 25)
                .pathParam("id_user", id_user);
    }

    // Rimasya
    // DELETE CLASS
    @Step("Delete class with valid id")
    public void deleteClassWithId ( int id_class) {
        SerenityRest.given().headers("Authorization", BEARER_ADMIN)
                .pathParam("id_class", id_class);
    }
    @Step("Delete class with without id")
    public void deleteClassWithoutId ( ) {
        SerenityRest.given().headers("Authorization", BEARER_ADMIN);
    }

    // DELETE USER
    @Step("Delete user with valid id")
    public void deleteUserWithId ( int id_user){
        SerenityRest.given().headers("Authorization", BEARER_ADMIN)
                .pathParam("id_user", id_user);
    }
    @Step("Delete user without id")
    public void deleteUserWithoutId () {
        SerenityRest.given().headers("Authorization", BEARER_ADMIN);
    }

    // GET SINGLE USER
    @Step("Get user profile with id")
    public void getUserProfileWithId(int id_user){
        SerenityRest.given().log().all()
                .headers("Authorization",BEARER_ADMIN)
                .pathParam("id_user",id_user);
    }
    @Step("Get single user without id")
    public void getUserProfileWithoutId() {
        SerenityRest.given().log().all()
                .headers("Authorization", BEARER_ADMIN);
    }

    // UPDATE CLASS
    @Step("Put update class")
    public void putUpdateClass ( int id_class){
        SerenityRest.given().multiPart("id_class", "14")
                .multiPart("class_name", "bahasa alien")
                .multiPart("status", "active")
                .multiPart("total_student", "1")
                .pathParam("id_class", id_class)
                .headers("Authorization", BEARER_ADMIN);
    }
    @Step("Update class without data")
    public void putUpdateClassWithOutData (int id_class){
        SerenityRest.given().headers("Authorization",BEARER_ADMIN)
                .pathParam("id_class",id_class);
    }
// no code here
}