package starter.Mentutor.loginMentee;

import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Steps;

import java.io.File;

public class LoginMenteeStepDefs {
    @Steps
    MenteeAPI menteeAPI;
    @Given("Post login with all valid value as mentee")
    public void postLoginWithAllValidValueAsMentee(){
        File json = new File(MenteeAPI.JSON_REQ_BODY+"/PostLoginMentor.json");
        menteeAPI.postLoginMentee(json);
    }
}
