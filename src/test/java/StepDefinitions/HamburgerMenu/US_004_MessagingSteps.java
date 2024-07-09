package StepDefinitions.HamburgerMenu;

import Pages.LeftNav_US_M;
import Utilities.ParentPage;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class US_004_MessagingSteps extends ParentPage {

    LeftNav_US_M lfm=new LeftNav_US_M();

    @Then("User should be able to see related buttons")
    public void userShouldBeAbleToSeeRelatedButtons() {
        Assert.assertTrue(lfm.messaging.isDisplayed());
    }
}
