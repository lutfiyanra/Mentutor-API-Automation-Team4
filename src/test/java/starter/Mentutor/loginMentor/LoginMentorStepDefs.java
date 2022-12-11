package starter.Mentutor.loginMentor;

import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Steps;

import java.io.File;

public class LoginMentorStepDefs {
    @Steps
    MentorAPI mentorAPI;

    @Given("Post login with all valid value as mentor")
    public void postLoginWithAllValidValueAsMentor(){
        File json = new File(MentorAPI.JSON_REQ_BODY+"/PostLoginMentor.json");
        mentorAPI.postLoginMentor(json);
        }
    }

