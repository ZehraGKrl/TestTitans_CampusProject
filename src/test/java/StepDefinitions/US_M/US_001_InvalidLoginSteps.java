package StepDefinitions.US_M;

import Pages.DialogContent_US_M;
import Utilities.GWD;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

    public class US_001_InvalidLoginSteps {

        DialogContent_US_M dcm = new DialogContent_US_M();

        @When("Enter invalid username as {string} or invalid password as {string} and click login button")
        public void enterInvalidUsernameAsOrInvalidPasswordAsAndClickLoginButton(String username, String password) {
            dcm.mySendKeys(dcm.username, username);
            dcm.mySendKeys(dcm.password, password);
            dcm.myClick(dcm.loginButton);

        }

        @Then("User should see Invalid username or password message")
        public void userShouldSeeInvalidUsernameOrPasswordMessage() {
            dcm.verifyContainsText(dcm.invalidLoginMessage, "Invalid username or password");

            GWD.quitDriver();

        }
    }


