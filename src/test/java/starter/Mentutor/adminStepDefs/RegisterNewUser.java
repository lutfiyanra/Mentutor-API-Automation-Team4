package starter.Mentutor.adminStepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.Mentutor.loginAdmin.AdminAPI;

import java.io.File;

public class RegisterNewUser {
    @Steps
    AdminAPI adminAPI;

    @Given("Post create new user with valid data")
    public void postCreateNewUserWithValidData() {
        File json = new File(AdminAPI.JSON_REQ_BODY+"/CreateNewUser.json");
        adminAPI.registerNewUserWithValidData(json);
    }
    @When("Send post create new user request using authorization")
    public void sendPostCreateNewUserRequestUsingAuthorization() {
        SerenityRest.when().post(AdminAPI.ADMIN_MANAGE_USERS);
    }

    @Then("Respons body code should be {int} created")
    public void responsBodyCodeShouldBeCreated(int created) {
        SerenityRest.then().statusCode(created);
    }


    @Given("Post create new user with valid data not using authorization")
    public void postCreateNewUserWithValidDataNotUsingAuthorization() {
        adminAPI.registerNewUserWithValidDataWithoutAuthorization();
    }
    @When("Send post create new user request without authorization")
    public void sendPostCreateNewUserRequestWithoutAuthorization() {
        SerenityRest.when().post(AdminAPI.ADMIN_MANAGE_USERS);
    }

    @Then("Status code should be {int} unauthorized")
    public void statusCodeShouldBeUnauthorized(int unauthorized) {
        SerenityRest.then().statusCode(unauthorized);
    }

    @Given("Post create new user with empty name input")
    public void postCreateNewUserWithEmptyNameInput() {
        File json = new File(AdminAPI.JSON_REQ_BODY+"/CreateNewUserEmptyName.json");
        adminAPI.registerNewUserEmptyName(json);
    }

    @Given("Post create new user with empty email input")
    public void postCreateNewUserWithEmptyEmailInput() {
        File json = new File(AdminAPI.JSON_REQ_BODY+"/CreateNewUserEmptyEmail.json");
        adminAPI.registerNewUserEmptyEmail(json);
    }

    @Given("Post create new user with empty password input")
    public void postCreateNewUserWithEmptyPasswordInput() {
        File json = new File(AdminAPI.JSON_REQ_BODY+"/CreateNewUserEmptyPassword.json");
        adminAPI.registerNewUserEmptyPassword(json);
    }

    @Given("Post create new user with empty id class input")
    public void postCreateNewUserWithEmptyIdClassInput() {
        File json = new File(AdminAPI.JSON_REQ_BODY+"/CreateNewUserEmptyIDClass.json");
        adminAPI.registerNewUserEmptyIdClass(json);
    }

    @Given("Post create new user with empty role input")
    public void postCreateNewUserWithEmptyRoleInput() {
        File json = new File(AdminAPI.JSON_REQ_BODY+"/CreateNewUserEmptyRole.json");
        adminAPI.registerNewUserEmptyRole(json);
    }

    @Given("Post create new user with alpha numeric in name input")
    public void postCreateNewUserWithAlphaNumericInNameInput() {
        File json = new File(AdminAPI.JSON_REQ_BODY+"/CreateNewUserAlphaNumName.json");
        adminAPI.registerNewUserAlphaNumInNameInput(json);
    }

    @Given("Post create new user with alphabet and special char in name input")
    public void postCreateNewUserWithAlphabetAndSpecialCharInNameInput() {
        File json = new File(AdminAPI.JSON_REQ_BODY+"/CreateNewUserAlphabetAndSpecialCharName.json");
        adminAPI.registerNewUserAlphabetSpecialCharInNameInput(json);
    }

    @Given("Post create new user with numeric in name input")
    public void postCreateNewUserWithNumericInNameInput() {
        File json = new File(AdminAPI.JSON_REQ_BODY+"/CreateNewUserNumericName.json");
        adminAPI.registerNewUserNumericNameInput(json);
    }

    @Given("Post create new user with special char in name input")
    public void postCreateNewUserWithSpecialCharInNameInput() {
        File json = new File(AdminAPI.JSON_REQ_BODY+"/CreateNewUserSpecialCharName.json");
        adminAPI.registerNewUserSpecialCharNameInput(json);
    }

    @Given("Post create new user without email suffix in email input")
    public void postCreateNewUserWithoutEmailSuffixInEmailInput() {
        File json = new File(AdminAPI.JSON_REQ_BODY+"/CreateNewUserEmptyEmailSuffix.json");
        adminAPI.registerNewUserWithoutEmailSuffix(json);
    }

    @Given("Post create new user without uppercase in password input")
    public void postCreateNewUserWithoutUppercaseInPasswordInput() {
        File json = new File(AdminAPI.JSON_REQ_BODY+"/CreateNewUserWithoutUppercasePassword.json");
        adminAPI.registerNewUserWithoutUppercaseInPassword(json);
    }

    @Given("Post create new user without numeric in password input")
    public void postCreateNewUserWithoutNumericInPasswordInput() {
        File json = new File(AdminAPI.JSON_REQ_BODY+"/CreateNewUserWithoutNumericPassword.json");
        adminAPI.registerNewUserWithoutNumericInPassword(json);
    }

    @Given("Post create new user without special char in password input")
    public void postCreateNewUserWithoutSpecialCharInPasswordInput() {
        File json = new File(AdminAPI.JSON_REQ_BODY+"/CreateNewUserWithoutSpecialCharPassword.json");
        adminAPI.registerNewUserWithoutSpecialCharInPassword(json);
    }

    @Given("Post create new user with alphabet in class id input")
    public void postCreateNewUserWithAlphabetInClassIdInput() {
        File json = new File(AdminAPI.JSON_REQ_BODY+"/CreateNewUserAlphabetClassId.json");
        adminAPI.registerNewUserWithAlphabetInIdClass(json);
    }

    @Given("Post create new user with special char in class id input")
    public void postCreateNewUserWithSpecialCharInClassIdInput() {
        File json = new File(AdminAPI.JSON_REQ_BODY+"/CreateNewUserSpecialCharClassId.json");
        adminAPI.registerNewUserWithSpecialCharInIdClass(json);
    }

    @Given("Post create new user with numeric in role input")
    public void postCreateNewUserWithNumericInRoleInput() {
        File json = new File(AdminAPI.JSON_REQ_BODY+"/CreateNewUserNumericRole.json");
        adminAPI.registerNewUserWithNumericInRole(json);
    }

    @Given("Post create new user with special char in role input")
    public void postCreateNewUserWithSpecialCharInRoleInput() {
        File json = new File(AdminAPI.JSON_REQ_BODY+"/CreateNewUserSpecialCharRole.json");
        adminAPI.registerNewUserWithSpecialCharInRole(json);
    }

// no code here
}
