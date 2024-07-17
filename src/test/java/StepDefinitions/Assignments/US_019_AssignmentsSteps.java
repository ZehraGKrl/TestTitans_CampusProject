package StepDefinitions.Assignments;

import Pages.DialogContent_US_M;
import Utilities.ParentPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.awt.*;
import java.awt.event.KeyEvent;

public class US_019_AssignmentsSteps extends ParentPage {
    DialogContent_US_M dcm = new DialogContent_US_M();
    String message = "Whats up mate";

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
    public void userShouldBeAbleToClickTheAttachFilesButton() throws AWTException {
        wait.until(ExpectedConditions.visibilityOf(dcm.attachFilesButton));
        dcm.myClick(dcm.attachFilesButton);

        Robot myRobot = new Robot();
        myRobot.delay(1000);
        myRobot.keyPress(KeyEvent.VK_ESCAPE);
        myRobot.keyRelease(KeyEvent.VK_ESCAPE);


    }

    @Then("User should be able to open a new discussion")
    public void userShouldBeAbleToOpenANewDiscussion() {
        wait.until(ExpectedConditions.visibilityOf(dcm.newContacts));
        dcm.myClick(dcm.newContacts);
    }

    @And("When the user sends their message, the message text \\(attach file name if available) and send message should also be able to see the date and time in a stream")
    public void whenTheUserSendsTheirMessageTheMessageTextAttachFileNameIfAvailableAndSendMessageShouldAlsoBeAbleToSeeTheDateAndTimeInAStream() {
        dcm.mySendKeys(dcm.messageInput,message);
        dcm.myJSClick(dcm.sendMessageButton);

        Assert.assertEquals(dcm.messageLocator.getText(),message);
        dcm.verifyContainsText(dcm.confirmDateText,"2024"); // tarih doğrulaması
        dcm.verifyContainsText(dcm.confirmDateText,":"); // saat doğrulaması : saatlerde var.
    }
}
