package starter.Mentutor.adminStepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.Mentutor.loginAdmin.AdminAPI;

import java.io.File;

public class RegisterNewClass {
    @Steps
    AdminAPI adminAPI;

    @Given("Post create new class with valid data")
    public void postCreateNewClassWithValidData(){
        File json = new File(AdminAPI.JSON_REQ_BODY+"/CreateNewClass.json");
        adminAPI.createNewClassWithValidData(json);
    }

    @When("Send post create new class request using authorization")
    public void sendPostCreateNewClassRequestUsingAuthorization() {
        SerenityRest.when().post(AdminAPI.ADMIN_MANAGE_CLASSES);
    }
    @Given("Post create new class with valid data not using authentication")
    public void postCreateNewClassWithValidDataNotUsingAuthentication() {
        adminAPI.createNewClassWithoutAuthorization();
    }

    @When("Send post create new class request without authorization")
    public void sendPostCreateNewClassRequestWithoutAuthorization() {
        SerenityRest.when().post(AdminAPI.ADMIN_MANAGE_CLASSES);
    }

    @Given("Post create new class with invalid data by numeric input")
    public void postCreateNewClassWithInvalidDataByNumericInput() {
        File json = new File(AdminAPI.JSON_REQ_BODY+"/CreateNewClassNumericInput.json");
        adminAPI.createNewClassNumericInput(json);
    }


    @Given("Post create new class with invalid data by special char input")
    public void postCreateNewClassWithInvalidDataBySpecialCharInput() {
        File json = new File(AdminAPI.JSON_REQ_BODY+"/CreateNewClassSpecialCharInput.json");
        adminAPI.createNewClassSpecialCharInput(json);
    }

    @Given("Post create new class with invalid data by empty input")
    public void postCreateNewClassWithInvalidDataByEmptyInput() {
        File json = new File(AdminAPI.JSON_REQ_BODY+"/CreateNewClassEmptyInput.json");
        adminAPI.createNewClassEmptyInput(json);
    }

}
