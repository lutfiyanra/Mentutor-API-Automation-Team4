package starter.Mentutor.adminStepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.Mentutor.loginAdmin.AdminAPI;

public class GetAllUsers {
    @Steps
    AdminAPI adminAPI;

    @Given("Get all users with authorization")
    public void getAllUsersWithAuthorization(){
        adminAPI.getAllUserWithAuthorization();
    }

    @When("Send get all users request")
    public void sendGetAllSectionRequest() {
        SerenityRest.when().get(AdminAPI.GET_ALL_USER);
    }

    @Then("Status code should be {int} OK")
    public void statusCodeShouldBeOK(int OK) {
        SerenityRest.then().statusCode(OK);
    }

    @Given("Get all users without authorization")
    public void getAllUsersWithoutAuthorization() {
        adminAPI.getAllUserWithoutAuthorization();
    }

    @Then("Status code should be {int} Bad Request")
    public void statusCodeShouldBeBadRequest(int badRequest) {
        SerenityRest.then().statusCode(badRequest);
    }
}
