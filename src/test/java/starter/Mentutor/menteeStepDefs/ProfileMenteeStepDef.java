package starter.Mentutor.menteeStepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.Mentutor.loginMentee.MenteeAPI;

public class ProfileMenteeStepDef {
    @Steps
    MenteeAPI menteeAPI;
    @Given("Put update profile mentee with authorization")
    public void putUpdateProfileMenteeWithAuthorization() {
        menteeAPI.putUpdateProfile();
    }
    @When("Send put update profile request")
    public void sendPutUpdateProfileRequest() {
        SerenityRest.when().put(MenteeAPI.MENTEE_UPDATE_PROFILE);
    }
    @Then("Status code put update profile should be {int} Created")
    public void statusCodePutUpdateProfileShouldBeCreated(int created) {
        SerenityRest.then().statusCode(created);
    }

    @Given("Put update profile mentee without authorization")
    public void putUpdateProfileMenteeWithoutAuthorization() {
        menteeAPI.putUpdateProfileWhitoutAutorization();
    }

    @Then("Status code put update profile should be {int} Bad Request")
    public void statusCodePutUpdateProfileShouldBeBaRequest(int BadRequest) {
        SerenityRest.then().statusCode(BadRequest);
    }
}
