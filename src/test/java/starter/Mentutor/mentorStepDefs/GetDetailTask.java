package starter.Mentutor.mentorStepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.Mentutor.loginMentor.MentorAPI;

public class GetDetailTask {
    @Steps
    MentorAPI mentorAPI;

    @Given("Get task detail from id task {int}")
    public void getTaskDetailFromId(int id_task){
        mentorAPI.getTaskDetail(id_task);
    }

    @When("User send request get task detail")
    public void userSendRequestGetTaskDetail() {
        SerenityRest.when()
                .get(MentorAPI.MANAGE_SPECIFIC_TASK_ID);
    }

    @Given("Get task detail from id task {int} without token")
    public void getTaskDetailFromIdTaskWithoutToken(int id_task){
        mentorAPI.getTaskDetailWithoutToken(id_task);
    }
}
