package starter.Mentutor.loginMentor;

import com.gargoylesoftware.htmlunit.attachment.Attachment;
import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import java.io.File;

public class MentorAPI {
    public static final String URL = "https://ecommerce-alta.online";
    public static final String DIR = System.getProperty("user.dir");
    public static final String JSON_REQ_BODY = DIR + "/src/test/resources/JSON/RequestBody";
    public static final String JSON_SCHEMA = DIR+"/src/test/resources/JSON/JsonSchema";
    public static String ATTACHMENTS = DIR+"/src/test/resources/Attachment";
    public static final String BEARER_TOKEN = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJJZENsYXNzIjoyNSwiYXV0aG9yaXplZCI6dHJ1ZSwiZXhwIjoxNjcwMDY0MTMzLCJyb2xlIjoibWVudGVlIiwidXNlcklkIjo2Mn0.FOF3OBrC0gtNjfdf6kD0g23EAjrpBt0tqx71MF8TWmE";
    public static final String BEARER_MENTOR = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJJZENsYXNzIjozLCJhdXRob3JpemVkIjp0cnVlLCJleHAiOjE2NzAyNzIyMDcsInJvbGUiOiJtZW50b3IiLCJ1c2VySWQiOjEwMDN9.MzjCgeV7MUC74HnSI3pJFx-bQ_p42eFGlkm1PvLIo3o";
    public static String LOGIN = URL + "/login";

    public static String GET_ALL_USER = URL +"/admin/users";
    //    public static String ID = "data.id";
    public static String ADMIN_MANAGE_USERS = URL+"/admin/users";
    public static String ADMIN_MANAGE_CLASSES = URL+"/admin/classes";
    public static String ADMIN_MANAGE_USERS_PROFILE = URL + "/admin/users/{id_user}";
    public static String ADMIN_MANAGE_CLASS = URL + "/admin/classes/{id_class}";

    public static String MENTOR_UPDATE_USER = URL + "/users";
    public static String MANAGE_TASK=URL+"/mentors/tasks";
    public static String MANAGE_SPECIFIC_TASK_ID = URL+"/mentors/tasks/{id_task}";
    public static String MENTOR_MANAGE_TASK_SCORE = URL+"/mentors/submission/{id_submission}";
    public static String MENTOR_ADD_COMMENT=URL+"/forum/{id_status}";
    public static String MANAGE_SPECIFIC_TASK_WITHOUT_ID = URL+"/mentors/tasks";
    public static String MANAGE_SPECIFIC_TASK_INVALID_PATH = URL+"/mentors/taskz/{id_task}";
    // Rimasya
    public static String ATTACHMENT = DIR + "/src/test/resources/Attachment";
    public static String MANAGE_TASK_INVALID = URL + "/mentors/taskssz";
    public static String MENTOR_UPDATE_USER_INVALID = URL + "/userssq";

    public static String MENTEE_UPDATE_PROFILE = URL+"/users";
    public static String MENTEE_GET_ALL_TASK = URL+"/mentees/tasks";
    public static String MENTEE_POST_SUBMIT_TASK = URL+"/mentees/submission/{id_task}";
    public static String MENTEE_POST_COMMENT_FORUM = URL+"/forum/{id_status}";


    public static String MANAGE_FORUM = URL+"/forum";

    @Step("Post Login Mentor")
    public void postLoginMentor(File json){
        SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(json);
    }

    @Step("Get Task Detail by task id")
    public void getTaskDetail(int id_task){
        SerenityRest.given()
                .headers("Authorization",BEARER_MENTOR)
                .pathParam("id_task", id_task);
    }

    // Rimasya
    @Step("Get mentor tasks authorization")
    public void getMentorTasksWithAuthorization() {
        SerenityRest.given().headers("Authorization", BEARER_MENTOR);
    }

    @Step("Get task detail without token")
    public void getTaskDetailWithoutToken(int id_task){
        SerenityRest.given().log().all().pathParam("id_task", id_task);
    }
    @Step("Get mentor tasks without authorization")
    public void getMentorTasksWithoutAuthorization(){
        SerenityRest.given().log().all();
    }
    @Step("Put update user mentor")
    public void putUpdateUserMentor() {
        SerenityRest.given()
                .multiPart("id_tasks", "102")
                .multiPart("title", "test")
                .multiPart("description", "test11")
                .headers("Authorization", BEARER_MENTOR);
    }
    @Step("Put update user mentor without data")
    public void putUpdateUserMentorWithoutData() {
        SerenityRest.given().headers("Authorization", BEARER_MENTOR);
    }
    @Step("Post mentor tasks with valid data")
    public void setMentorTasksWithValidData() {
        SerenityRest.given().multiPart("title", "testing title")
                .multiPart("description", "isi apa ajalah")
                .multiPart("images", new File(ATTACHMENT + "/download.png"))
                .multiPart("due_date", "2022-12-09")
                .multiPart("file", new File(ATTACHMENT + "/testfile.pdf"))
                .headers("Authorization", BEARER_MENTOR);
    }
    @Step("Post mentor tasks without authorization")
    public void postMentorWithoutAuthorization(){
        SerenityRest.given().log().all();
    }

    @Step("Delete specific task with valid id")
    public void deleteSpecificTaskWithValidId(int id_task){
        SerenityRest.given()
                .headers("Authorization", BEARER_MENTOR)
                .pathParam("id_task", id_task);
    }
    @Step("Delete specific task without id")
    public void deleteSpecificTaskWithoutId(){
        SerenityRest.given()
                .headers("Authorization", BEARER_MENTOR);
    }

    @Step("Delete specific task with invalid path")
    public void deleteSpecificTaskWithInvalidPath(int id_task){
        SerenityRest.given().headers("Authorization", BEARER_MENTOR)
                .pathParam("id_task", id_task);
    }

}
