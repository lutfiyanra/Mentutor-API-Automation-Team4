package starter.Mentutor.menteeStepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.Mentutor.loginMentee.MenteeAPI;

public class TaskMenteeStepDef {
    @Steps
    MenteeAPI menteeAPI;
    @Given("Get all task with authorization")
    public void getAllTaskWithAuthorization() {
        menteeAPI.getAllTaskWithAuthorization();
    }
    @When("Send get all task request")
    public void sendGetAllTaskRequest() {
        SerenityRest.when().get(MenteeAPI.MENTEE_GET_ALL_TASK);
    }
    @Given("Get all task without authorization")
    public void getAllTaskWithoutToken() {
        menteeAPI.getAllTaskWithoutAuthorization();
    }
    @Given("Post task file PDF with id_task {int}")
    public void postTaskFilePDFWithId_task(int id_task) {
        menteeAPI.postTaskWithFilePDF(id_task);
    }
    @When("send post task mentee")
    public void sendPostTaskMentee() {
        SerenityRest.when().post(MenteeAPI.MENTEE_POST_SUBMIT_TASK);
    }
    @Given("Post input task file DOCX with id_task {int}")
    public void postInputTaskFileDOCXWithId_task(int id_task) {
        menteeAPI.postTaskWithFileDOCX(id_task);
    }
    @Given("Post input task file XLSX with id_task {int}")
    public void postInputTaskFileXLSXWithId_task(int id_task) {
        menteeAPI.postTaskWithFileXLSX(id_task);
    }
    @Given("Post input task file PPTX with id_task {int}")
    public void postInputTaskFilePPTXWithId_task(int id_task) {
        menteeAPI.postTaskWithFilePPTX(id_task);
    }

    @Given("Post input task file PNG with id_task {int}")
    public void postInputTaskFilePNGWithId_taskId_task(int id_task) {
        menteeAPI.postTaskWithFilePNG(id_task);
    }

}
