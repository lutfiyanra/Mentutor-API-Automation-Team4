package starter.Mentutor.loginAdmin;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;

import java.io.File;

public class LoginAdminStepDefs {

    @Steps
    AdminAPI adminAPI;

    @Given("Post login with all valid value as admin")
    public void postLoginWithAllValidValueAsAdmin(){
        File json = new File(AdminAPI.JSON_REQ_BODY+"/PostLoginAdmin.json");
        adminAPI.postLoginUser(json);
    }

    @When("Send request post login")
    public void sendRequestPostLogin() {
        SerenityRest.when().post(AdminAPI.LOGIN);
    }

    @Then("Should return {int} OK")
    public void shouldReturnOK(int OK) {
        SerenityRest.then().statusCode(OK);
    }



    @Given("Post login with invalid email as admin")
    public void postLoginWithInvalidEmailAsAdmin() {
        File json = new File(AdminAPI.JSON_REQ_BODY+"/PostLoginAdminInvalidEmail.json");
        adminAPI.postLoginUser(json);
    }

    @Given("Post login as admin with invalid password")
    public void postLoginAsAdminWithInvalidPassword() {
        File json = new File(AdminAPI.JSON_REQ_BODY+"/PostLoginAdminInvalidPassword.json");
        adminAPI.postLoginUser(json);
    }

    @Then("Should return respons body code {int} bad request")
    public void shouldReturnResponsBodyCodeBadRequest(int badRequest) {
        SerenityRest.then().statusCode(badRequest);
    }

    @Given("Post login as admin with invalid all data")
    public void postLoginAsAdminWithInvalidAllData() {
        File json = new File(AdminAPI.JSON_REQ_BODY+"/PostLoginInvalidAllData.json");
        adminAPI.postLoginUser(json);
    }

    @Then("Should return respons body code {int} not found")
    public void shouldReturnResponsBodyCodeNotFound(int notFound) {
        SerenityRest.then().statusCode(notFound);
    }

    @Given("Post login as admin with empty email")
    public void postLoginAsAdminWithEmptyEmail() {
        File json = new File(AdminAPI.JSON_REQ_BODY+"/PostLoginEmptyEmail.json");
        adminAPI.postLoginUser(json);
    }

    @Given("Post login as admin with empty password")
    public void postLoginAsAdminWithEmptyPassword() {
        File json = new File(AdminAPI.JSON_REQ_BODY+"/PostLoginEmptyPassword.json");
        adminAPI.postLoginUser(json);
    }

    @Given("Post login as admin with empty data")
    public void postLoginAsAdminWithEmptyData() {
        File json = new File(AdminAPI.JSON_REQ_BODY+"/PostLoginEmptyData.json");
        adminAPI.postLoginUser(json);
    }

    @And("Validate post login valid value json schema")
    public void validatePostLoginValidValueJsonSchema() {
        File json = new File(AdminAPI.JSON_SCHEMA+"/PostLoginJsonSchema.json");
        SerenityRest.then().body(JsonSchemaValidator.matchesJsonSchema(json));
    }
    // no code here

}
