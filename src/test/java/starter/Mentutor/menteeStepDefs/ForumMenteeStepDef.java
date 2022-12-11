package starter.Mentutor.menteeStepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.Mentutor.loginMentee.MenteeAPI;

import java.io.File;

public class ForumMenteeStepDef {
    @Steps
    MenteeAPI menteeAPI;

    @Given("Post comment status with input alphabet with {int}")
    public void postCommentStatusWithInputAlphabetWithId_status(int id_status) {
        File json = new File(MenteeAPI.JSON_REQ_BODY+"/CommentAlphabet.json");
        menteeAPI.postCommentAlphabet(json, id_status);
    }
    @When("send post comment mentee")
    public void sendPostCommentMentee() {
        SerenityRest.when().post(MenteeAPI.MENTEE_POST_COMMENT_FORUM);
    }

    @Then("Status code post comment should be {int} Created")
    public void statusCodePostCommentShouldBeCreated(int created) {
        SerenityRest.then().statusCode(created);
    }

    @Given("Post comment status with input numeric with {int}")
    public void postCommentStatusWithInputNumericWithId_status(int id_status) {
        File json = new File(MenteeAPI.JSON_REQ_BODY+"/CommentNumeric.json");
        menteeAPI.postCommentNumeric(json, id_status);
    }

    @Given("Post comment status with input special character with {int}")
    public void postCommentStatusWithInputSpecialCharacterWithId_status(int id_status) {
        File json = new File(MenteeAPI.JSON_REQ_BODY+"/CommentSpecialChar.json");
        menteeAPI.postCommentSpecialChar(json, id_status);
    }

    @Given("Post comment status with invalid {string}")
    public void postCommentStatusWithInvalidIdStatus(String id_status) {
        menteeAPI.postCommentWithInvalidIdStatus(id_status);
    }

    @Given("Post comment status with invalid path and valid {int}")
    public void postCommentStatusWithInvalidPathAndValidId_status(int id_status) {
        menteeAPI.postCommentStatusWithInvalidPath(id_status);
    }
    @When("send post comment mentee with invalid path")
    public void sendPostCommentMenteeWithInvalidPath() {
        SerenityRest.when().post(MenteeAPI.MENTEE_POST_COMMENT_FORUM_INVALID);
    }
    @Then("Status code should be {int} Not found")
    public void statusCodeShouldBeNotFound(int NotFound){
        SerenityRest.then().statusCode(NotFound);
    }

    @Given("Get all status with authorization")
    public void getAllStatusWithAuthorization() {
        menteeAPI.getAllStatusWithAuthorization();
    }
    @When("Send get all status request")
    public void sendGetAllStatusRequest() {
        SerenityRest.when().get(MenteeAPI.MANAGE_FORUM);
    }
    @Then("Status code get all status should be {int} OK")
    public void statusCodeGetAllStatusShouldBeOK(int OK){
        SerenityRest.then().statusCode(OK);
    }
    @Given("Get all status without authorization")
    public void getAllStatusWithoutAuthorization() {
        menteeAPI.getAllStatusWithoutAuthorization();
    }
    @Then("Status code get all status should be {int} Bad Request")
    public void statusCodeGetAllStatusShouldBeBadRequest(int BadRequest){
        SerenityRest.then().statusCode(BadRequest);}

    @Given("Post status with authorization")
    public void postStatusWithAuthorization() {
        menteeAPI.postStatusWithAuthorization();
    }

    @When("Send post status request")
    public void sendPostStatusRequest() {
        SerenityRest.when().post(MenteeAPI.MANAGE_FORUM);
    }

    @Then("Status code post status should be {int} Created")
    public void statusCodePostStatusShouldBeCreated(int created){
        SerenityRest.then().statusCode(created);
    }

    @Given("Post status without authorization")
    public void postStatusWithoutAuthorization() {
        menteeAPI.postStatusWithoutAuthorization();
    }

    @Then("Status code post status should be {int} Bad Request")
    public void statusCodePostStatusShouldBeBadRequest(int BadRequest){
        SerenityRest.then().statusCode(BadRequest);
    }
}
