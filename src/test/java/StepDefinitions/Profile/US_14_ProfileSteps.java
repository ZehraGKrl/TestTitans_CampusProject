package StepDefinitions.Profile;

import Pages.DialogContent_US_O;
import Pages.LeftNav_US_O;
import Utilities.ParentPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class US_14_ProfileSteps extends ParentPage {

    DialogContent_US_O dc =new DialogContent_US_O();
    LeftNav_US_O ln =new LeftNav_US_O();
    @Given("Click on the profile and click on the Settings")
    public void clickOnTheProfileAndClickOnTheSettings() {
        ln.myClick(ln.profileSettingsButton);
        dc.myClick(dc.settingsButton);
    }

    @Then("Verification that you are on the settings page")
    public void verificationThatYouAreOnTheSettingsPage() {
        wait.until(ExpectedConditions.elementToBeClickable(dc.profilePicture));
        Assert.assertTrue(dc.profilePicture.isDisplayed());
    }

    @When("Click on the profile picture and upload button")
    public void clickOnTheProfilePictureAndUploadButton() {
    }

    @And("Select the photo to upload from the files")
    public void selectThePhotoToUploadFromTheFiles() {
    }

    @And("After taking the photo, click the Upload button and save button")
    public void afterTakingThePhotoClickTheUploadButtonAndSaveButton() {
    }

    @Then("Receive a Success message when they successfully upload or change their profile picture.")
    public void receiveASuccessMessageWhenTheySuccessfullyUploadOrChangeTheirProfilePicture() {
    }
}
