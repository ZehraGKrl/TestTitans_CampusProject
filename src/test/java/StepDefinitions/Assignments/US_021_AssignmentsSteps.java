package StepDefinitions.Assignments;

import Pages.DialogContent_US_M;
import Utilities.ParentPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class US_021_AssignmentsSteps extends ParentPage {
    DialogContent_US_M dcm = new DialogContent_US_M();

    @Then("user should be able to see submit button and click button")
    public void userShouldBeAbleToSeeSubmitButtonAndClickButton() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//span[@class='mat-mdc-button-persistent-ripple mdc-icon-button__ripple'])[6]//following-sibling::fa-icon")));
        dcm.myJSClick(dcm.submitButton);

    }

    @And("the user should be able to write in a text editor, insert images and create tables")
    public void theUserShouldBeAbleToWriteInATextEditorInsertImagesAndCreateTables() throws AWTException {
        String text = "Hello my World...";
        String insertTable = "Greetings from Test-Titans";
        String insertTable1 = "Have a nice day";
        String insertTable2 = "Bye";

        Robot myRobot = new Robot();
        myRobot.mouseMove(350, 350);
        myRobot.delay(1000);
        myRobot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        myRobot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        myRobot.delay(1000);

        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));
        dcm.mySendKeys(dcm.editorTextScreen, text);

        myRobot.delay(1000);
        myRobot.keyPress(KeyEvent.VK_ENTER);
        myRobot.keyRelease(KeyEvent.VK_ENTER);
        myRobot.delay(1000);
        myRobot.mouseMove(380, 380);
        myRobot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        myRobot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        dcm.mySendKeys(dcm.row1Column1, insertTable);

        myRobot.delay(1000);
        myRobot.keyPress(KeyEvent.VK_TAB);
        myRobot.keyRelease(KeyEvent.VK_TAB);

        dcm.mySendKeys(dcm.row1Column2, insertTable1);

        myRobot.keyPress(KeyEvent.VK_TAB);
        myRobot.keyRelease(KeyEvent.VK_TAB);

        dcm.mySendKeys(dcm.row2Column1,insertTable2);

        myRobot.mouseMove(440,420);
        myRobot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        myRobot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

    }
}
