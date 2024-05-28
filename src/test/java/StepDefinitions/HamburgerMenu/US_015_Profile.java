package StepDefinitions.HamburgerMenu;

import Pages.DialogContent_US_E;
import Utilities.ParentPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;


import static org.testng.Assert.assertTrue;

public class US_015_Profile extends ParentPage {

    DialogContent_US_E dc = new DialogContent_US_E();

    @When("the user clicks the profile button and the settings button")
    public void theUserClicksTheProfileButtonAndTheSettingsButton() {
        dc.myClick(dc.profileButton);
        dc.myClick(dc.settingsButton);

    }

    @Then("the user selects a theme")
    public void theUserSelectsATheme() {
        dc.myClick(dc.defaultTheme);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option[.//span[text()=' Purple Theme ']]")));
        dc.myClick(dc.purpleTheme);

    }

    @And("the user clicks the save button")
    public void theUserClicksTheSaveButton() {
        dc.myClick(dc.saveButton);
    }

    @And("the user should see a success message")
    public void theUserShouldSeeASuccessMessage() {
        wait.until(ExpectedConditions.visibilityOf(dc.successMessage));
        assertTrue(dc.successMessage.isDisplayed(), "Success message is not displayed!");


    }
}
