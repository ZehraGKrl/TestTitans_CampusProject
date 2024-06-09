package StepDefinitions.HamburgerMenu;

import Pages.DialogContent_US_E;
import Utilities.GWD;
import Utilities.ParentPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class US_005_Hamburger_Messaging extends ParentPage {
    @When("the user clicks the messaging button and the new message button")
    public void theUserClicksTheMessagingButtonAndTheNewMessageButton() {

        WebDriver driver = GWD.getDriver();

        WebElement element = driver.findElement(By.xpath("//button[contains(@class, 'mat-mdc-menu-trigger')]"));
        element.click();


    }



    @Then("the user clicks the add receivers button")
    public void theUserClicksTheAddReceiversButton() {
    }

    @And("the user enters the receiver's name and selects the receiver")
    public void theUserEntersTheReceiverSNameAndSelectsTheReceiver() {
    }

    @Then("the user enters the subject")
    public void theUserEntersTheSubject() {
    }

    @And("the user writes a message and adds a table or picture")
    public void theUserWritesAMessageAndAddsATableOrPicture() {
    }

    @And("the user adds a document")
    public void theUserAddsADocument() {
    }

    @And("the user clicks the send button")
    public void theUserClicksTheSendButton() {
    }

    @Then("the success page should be displayed")
    public void theSuccessPageShouldBeDisplayed() {
    }

    @And("the user clicks the hamburger menu, messaging button, and outbox button")
    public void theUserClicksTheHamburgerMenuMessagingButtonAndOutboxButton() {
    }

    @Then("the user should see the outbox list")
    public void theUserShouldSeeTheOutboxList() {
    }
}
