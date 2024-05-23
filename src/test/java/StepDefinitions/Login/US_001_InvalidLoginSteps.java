package StepDefinitions.Login;

import Pages.DialogContent_US_001;
import Pages.LeftNav_US_001;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US_001_InvalidLoginSteps {

    DialogContent_US_001 dcm=new DialogContent_US_001();
    LeftNav_US_001 lfm=new LeftNav_US_001();
    @When("Enter invalid username as {string} or invalid password as {string} and click login button")
    public void enterInvalidUsernameAsOrInvalidPasswordAsAndClickLoginButton(String username, String password) {
        dcm.mySendKeys(dcm.username,username);
        dcm.mySendKeys(dcm.password,password);
        dcm.myClick(dcm.loginButton);

    }

    @Then("User should see Invalid username or password message")
    public void userShouldSeeInvalidUsernameOrPasswordMessage() {
        dcm.verifyContainsText(dcm.invalidLoginMessage, "Invalid username or password");

    }
}
