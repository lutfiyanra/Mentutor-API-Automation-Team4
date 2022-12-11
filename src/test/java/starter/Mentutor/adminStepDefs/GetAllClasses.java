package starter.Mentutor.adminStepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.Mentutor.loginAdmin.AdminAPI;

public class GetAllClasses {
    @Steps
    AdminAPI adminAPI;

    @Given("Get all class with authorization")
    public void getAllClassWithAuthorization(){
        adminAPI.getAllClassesWithAuthorization();
    }
    @When("Send get all class request")
    public void sendGetAllClassRequest(){
        SerenityRest.when().get(AdminAPI.ADMIN_MANAGE_CLASSES);
    }

    @Given("Get all class without authorization")
    public void getAllClassWithoutAuthorization() {
        adminAPI.getAllClassessWithoutAuthorization();
    }
}
