package StepDefinitions.Assignments;

import Pages.DialogContent_US_M;
import Utilities.ParentPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class US_019_AssignmentsSteps extends ParentPage {
    DialogContent_US_M dcm = new DialogContent_US_M();

    @And("Click on the search button")
    public void clickOnTheSearchButton() {
        dcm.wait.until(ExpectedConditions.elementToBeClickable(dcm.searchButton));
        dcm.myJSClick(dcm.searchButton);

    }

    @Then("Click on the lesson in assignments page")
    public void clickOnTheLessonInAssignmentsPage() {
        dcm.wait.until(ExpectedConditions.elementToBeClickable(dcm.lesson));
        dcm.myJSClick(dcm.lesson);
    }

    @Then("User should be able to start a discussion")
    public void userShouldBeAbleToStartADiscussion() {
        dcm.wait.until(ExpectedConditions.elementToBeClickable(dcm.discussionButton));
        dcm.myJSClick(dcm.discussionButton);
    }

    @Then("User should be able to click the chat button")
    public void userShouldBeAbleToClickTheChatButton() {
        wait.until(ExpectedConditions.visibilityOf(dcm.chatButton));
        dcm.myClick(dcm.chatButton);
    }

    @Then("User should be able to click the contacts button")
    public void userShouldBeAbleToClickTheContactsButton() {
        wait.until(ExpectedConditions.visibilityOf(dcm.contactsButton));
        dcm.myClick(dcm.contactsButton);
    }

    @Then("User should be able to click the attach files button")
    public void userShouldBeAbleToClickTheAttachFilesButton() {
        wait.until(ExpectedConditions.visibilityOf(dcm.attachFilesButton));
        dcm.myClick(dcm.attachFilesButton);
    }
}
