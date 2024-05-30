package StepDefinitions.Grading;

import Pages.DialogContent_US_Z;
import Utilities.ParentPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.apache.commons.math3.analysis.function.Exp;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.awt.*;
import java.awt.event.KeyEvent;

public class US_17_Grading extends ParentPage {
    DialogContent_US_Z dcz= new DialogContent_US_Z();


    @When("Click the grading transcript and print buttons")
    public void clickTheGradingTranscriptAndPrintButtons() {
        wait.until(ExpectedConditions.elementToBeClickable(dcz.grading));
        dcz.myClick(dcz.grading);
        dcz.myClick(dcz.transcript);
        dcz.myClick(dcz.print);

    }

    @And("Click on the download button on the new tab")
    public void clickOnTheDownloadButtonOnTheNewTab() throws AWTException {
        Robot robot=new Robot();
        robot.delay(2000);
        for (int i = 0; i < 8; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
            robot.delay(500);

        }
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.delay(2000);
        myUploadFile("D:\\TECHNO STUDY\\campus");

        robot.delay(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

    }
}
