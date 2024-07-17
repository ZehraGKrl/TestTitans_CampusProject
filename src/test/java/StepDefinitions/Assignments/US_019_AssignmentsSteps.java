package StepDefinitions.Assignments;

import Pages.DialogContent_US_M;
import Utilities.GWD;
import Utilities.ParentPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

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
    public void userShouldBeAbleToClickTheAttachFilesButton() throws AWTException {
        wait.until(ExpectedConditions.visibilityOf(dcm.attachFilesButton));
        dcm.myClick(dcm.attachFilesButton);

        Robot myRobot=new Robot();
        myRobot.delay(1000);
        myRobot.keyPress(KeyEvent.VK_ESCAPE);
        myRobot.keyRelease(KeyEvent.VK_ESCAPE);


    }

    @Then("User should be able to open a new discussion")
    public void userShouldBeAbleToOpenANewDiscussion() {
        wait.until(ExpectedConditions.visibilityOf(dcm.newContacts));
        dcm.myClick(dcm.newContacts);
    }
}
