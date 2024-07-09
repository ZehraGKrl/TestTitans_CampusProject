package StepDefinitions.HamburgerMenu;

import Pages.DialogContent_US_M;
import Pages.LeftNav_US_M;
import Utilities.ParentPage;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class US_004_MessagingSteps extends ParentPage {

    DialogContent_US_M dcm = new DialogContent_US_M();

    @Then("User should be able to see related buttons")
    public void userShouldBeAbleToSeeRelatedButtons() {
        Assert.assertTrue(dcm.messageButton.isDisplayed());
    }
}
