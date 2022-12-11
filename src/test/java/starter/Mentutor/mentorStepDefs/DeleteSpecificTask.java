package starter.Mentutor.mentorStepDefs;

import groovy.lang.AdaptingMetaClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.Mentutor.loginAdmin.AdminAPI;
import starter.Mentutor.loginMentor.MentorAPI;

public class DeleteSpecificTask {
    @Steps
    MentorAPI mentorAPI;

    @Given("Delete specific task with id_task {int}")
    public void deleteSpecificTaskWithId(int id_task){
        mentorAPI
                .deleteSpecificTaskWithValidId(id_task);
    }

    @When("Send delete specific task request")
    public void sendDeleteSpecificTaskRequest() {
        SerenityRest.when()
                .delete(AdminAPI.MANAGE_SPECIFIC_TASK_ID);
    }

    @Then("Status delete specific task code should be {int} OK")
    public void statusDeleteSpecificTaskCodeShouldBeOK(int ok) {
        SerenityRest.then().statusCode(ok);
    }

    @Given("Delete specific task without id_task")
    public void deleteSpecificTaskWithoutId() {
        mentorAPI.deleteSpecificTaskWithoutId();
    }

    @When("Send delete specific task without id request")
    public void sendDeleteSpecificTaskWithoutIdRequest() {
        SerenityRest.when().delete(MentorAPI.MANAGE_SPECIFIC_TASK_WITHOUT_ID);
    }

    @Then("Status delete specific task code should be {int} Method Not Allowed")
    public void statusDeleteSpecificTaskCodeShouldBeMethodNotAllowed(int notAllowed) {
        SerenityRest.then().statusCode(notAllowed);
    }
    @Then("Status delete specific task code should be {int} Not Found")
    public void statusDeleteSpecificTaskCodeShouldBeNotFound(int notFound) {
        SerenityRest.then().statusCode(notFound);
    }

    @Given("Delete specific task with id_task {int} and invalid path")
    public void deleteClassWithId_task(int id_task) {
        mentorAPI.deleteSpecificTaskWithInvalidPath(id_task);
    }

    @When("Send delete specific task with invalid path request")
    public void sendDeleteSpecificTaskWithInvalidPathRequest() {
        SerenityRest.when().delete(MentorAPI.MANAGE_SPECIFIC_TASK_INVALID_PATH);
    }
}
