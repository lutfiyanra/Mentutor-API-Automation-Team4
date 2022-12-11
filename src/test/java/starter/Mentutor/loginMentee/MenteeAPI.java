package starter.Mentutor.loginMentee;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import java.io.File;

public class MenteeAPI {

    public static final String URL = "https://ecommerce-alta.online";
    public static final String DIR = System.getProperty("user.dir");
    public static final String JSON_REQ_BODY = DIR + "/src/test/resources/JSON/RequestBody";
    public static final String JSON_SCHEMA = DIR+"/src/test/resources/JSON/JsonSchema";
    public static String ATTACHMENTS = DIR+"/src/test/resources/Attachment";

    public static final String BEARER_TOKEN_MENTEE = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJJZENsYXNzIjoyLCJhdXRob3JpemVkIjp0cnVlLCJleHAiOjE2NzAyNTA2NjksInJvbGUiOiJtZW50ZWUiLCJ1c2VySWQiOjYzfQ.VtNloLkWT1okux9TWsKe92CA0Cv0q68vI2zKYpILSMU";
    public static final String WITHOUT_BEARER_TOKEN ="";
    public static String LOGIN = URL + "/login";

    public static String GET_ALL_USER = URL +"/admin/users";
    //    public static String ID = "data.id";
    public static String ADMIN_MANAGE_USERS = URL+"/admin/users";
    public static String ADMIN_MANAGE_CLASSES = URL+"/admin/classes";
    public static String ADMIN_MANAGE_USERS_PROFILE = URL + "/admin/users/{id_user}";
    public static String ADMIN_MANAGE_CLASS = URL + "/admin/classes/{id_class}";

    public static String MENTOR_UPDATE_USER = URL + "/users";
    public static String MANAGE_TASK=URL+"/mentors/task";
    public static String MANAGE_SPECIFIC_TASK_ID = URL+"/mentors/task/{id_task}";
    public static String MENTOR_MANAGE_TASK_SCORE = URL+"/mentors/submission/{id_submission}";
    public static String MENTOR_ADD_COMMENT=URL+"/forum/{id_status}";

    public static String MENTEE_UPDATE_PROFILE = URL+"/users";
    public static String MENTEE_GET_ALL_TASK = URL+"/mentees/tasks";
    public static String MENTEE_POST_SUBMIT_TASK = URL+"/mentees/submission/{id_task}";
    public static String MENTEE_POST_COMMENT_FORUM = URL+"/forum/{id_status}";
    public static String MENTEE_POST_COMMENT_FORUM_INVALID = URL+"/forumzsfh!@#5/{id_status}";

    public static String MANAGE_FORUM = URL+"/forum";

    @Step("Post Login Mentee")
    public void postLoginMentee(File json){
        SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(json);
    }
    @Step("Get all task with Authorization")
    public void getAllTaskWithAuthorization(){
        SerenityRest.given().headers("Authorization", BEARER_TOKEN_MENTEE);
    }
    @Step("Get all task without Authorization")
    public void getAllTaskWithoutAuthorization(){
        SerenityRest.given().headers("Authorization",WITHOUT_BEARER_TOKEN);
    }
    @Step("Post task with file pdf")
    public void postTaskWithFilePDF(int id_task) {
        SerenityRest.given().multiPart("file", new File(ATTACHMENTS + "/saya.pdf"))
                .pathParams("id_task", id_task)
                .multiPart("id_task", "137")
                .headers("Authorization", BEARER_TOKEN_MENTEE);
    }
    @Step("Post task with file docx")
    public void postTaskWithFileDOCX(int id_task) {
        SerenityRest.given().multiPart("file", new File(ATTACHMENTS + "/saya.docx"))
                .pathParams("id_task", id_task)
                .multiPart("id_task", "139")
                .headers("Authorization", BEARER_TOKEN_MENTEE);
    }
    @Step("Post task with file xlsx")
    public void postTaskWithFileXLSX(int id_task) {
        SerenityRest.given().multiPart("file", new File(ATTACHMENTS + "/coba.xlsx"))
                .pathParams("id_task", id_task)
                .multiPart("id_task", "140")
                .headers("Authorization", BEARER_TOKEN_MENTEE);
    }
    @Step("Post task with file pptx")
    public void postTaskWithFilePPTX(int id_task) {
        SerenityRest.given().multiPart("file", new File(ATTACHMENTS + "/saya.pptx"))
                .pathParams("id_task", id_task)
                .multiPart("id_task", "141")
                .headers("Authorization", BEARER_TOKEN_MENTEE);
    }
    @Step("Post task with file png")
    public void postTaskWithFilePNG(int id_task) {
        SerenityRest.given().multiPart("file", new File(ATTACHMENTS + "/download.png"))
                .pathParams("id_task", id_task)
                .multiPart("id_task", "142")
                .headers("Authorization", BEARER_TOKEN_MENTEE);
    }
    @Step("Post comment with alphabet")
    public void postCommentAlphabet(File json, int id_status){
        SerenityRest.given().contentType(ContentType.JSON)
                .body(json).pathParams("id_status", id_status)
                .headers("Authorization", BEARER_TOKEN_MENTEE);
    }
    @Step("Post comment with numeric")
    public void postCommentNumeric(File json, int id_status){
        SerenityRest.given().contentType(ContentType.JSON)
                .body(json).pathParams("id_status", id_status)
                .headers("Authorization", BEARER_TOKEN_MENTEE);
    }
    @Step("Post comment with special character")
    public void postCommentSpecialChar(File json, int id_status){
        SerenityRest.given().contentType(ContentType.JSON)
                .body(json).pathParams("id_status", id_status)
                .headers("Authorization", BEARER_TOKEN_MENTEE);
    }
    @Step("Post comment status with invalid id_status")
    public void postCommentWithInvalidIdStatus(String id_status){
        SerenityRest.given().pathParams("id_status", "id_status")
                .headers("Authorization", BEARER_TOKEN_MENTEE);
    }
    @Step("Post comment status with invalid path")
    public void postCommentStatusWithInvalidPath(int id_status){
        SerenityRest.given()
                .pathParams("id_status", id_status)
                .headers("Authorization", BEARER_TOKEN_MENTEE);
    }
    @Step("Get all status with authorization")
    public void getAllStatusWithAuthorization(){
        SerenityRest.given().headers("Authorization", BEARER_TOKEN_MENTEE);
    }
    @Step("Get all status without authorization")
    public void getAllStatusWithoutAuthorization(){
        SerenityRest.given().headers("Authorization", WITHOUT_BEARER_TOKEN);
    }
    @Step("Post status with authorization")
    public void postStatusWithAuthorization(){
        SerenityRest.given().headers("Authorization", BEARER_TOKEN_MENTEE)
                .multiPart("caption", "Belajar yuu!!")
                .multiPart("file", new File(ATTACHMENTS + "/download.png"));
    }
    @Step("Post status without authorization")
    public void postStatusWithoutAuthorization(){
        SerenityRest.given().headers("Authorization", WITHOUT_BEARER_TOKEN)
                .multiPart("caption", "Belajar yuu coba lagi!!");
    }
    @Step("Put update profile")
    public void putUpdateProfile(){
        SerenityRest.given().multiPart("file", new File(ATTACHMENTS + "/download.png"))
                .multiPart("name","Rezki Update")
                .multiPart("email","rezkiadina02@gmail.com")
                .multiPart("password","Saya1234!@#$")
                .headers("Authorization", BEARER_TOKEN_MENTEE);
    }
    @Step("Put update profile without authorization")
    public void putUpdateProfileWhitoutAutorization(){
        SerenityRest.given().multiPart("file", new File(ATTACHMENTS + "/bunga lengkeng.jpg"))
                .multiPart("name","Rezki Update Lagi Lagi")
                .multiPart("email","rezkiadina02@gmail.com")
                .multiPart("password","Saya1234!@#$");
    }
}
