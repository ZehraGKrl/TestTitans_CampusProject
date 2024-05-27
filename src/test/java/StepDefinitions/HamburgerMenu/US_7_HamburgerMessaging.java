package StepDefinitions.HamburgerMenu;

import Pages.DialogContent_US_Z;
import Utilities.GWD;
import Utilities.ParentPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class US_7_HamburgerMessaging extends ParentPage {
    DialogContent_US_Z dcz=new DialogContent_US_Z();


    @And("Click on the trash button in hamburger menu {string}")
    public void clickOnTheTrashButtonInHamburgerMenu(String button) {

        dcz.myJSClick(dcz.trashButton);
    }

    @Then("The trash and restore icon should be visible")
    public void theTrashAndRestoreIconShouldBeVisible() {
        wait.until(ExpectedConditions.elementToBeClickable(dcz.restoreIcon));
        Assert.assertTrue(dcz.restoreIcon.isDisplayed());
        Assert.assertTrue(dcz.trashIcon.isDisplayed());
    }

    @And("Click on the restore button and see the success message")
    public void clickOnTheRestoreButtonAndSeeTheSuccessMessage() {
        dcz.myClick(dcz.restoreIcon);
        wait.until(ExpectedConditions.visibilityOf(dcz.successMessage));
        Assert.assertTrue(dcz.successMessage.isDisplayed());

    }
}
