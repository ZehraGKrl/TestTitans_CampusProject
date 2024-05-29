package StepDefinitions.Calendar;
import Pages.DialogContent_US_E;
import Utilities.ParentPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;

import static Utilities.GWD.getDriver;

public class US_025_Calendar extends ParentPage {
    DialogContent_US_E dc = new DialogContent_US_E();

    @When("the user clicks the completed lesson and recording button")
    public void theUserClicksTheCompletedLessonAndRecordingButton() throws InterruptedException, AWTException {

        dc.myClick(dc.calendar);
        Thread.sleep(5000);

        Robot robot = new Robot();

        for (int i = 0; i < 12; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
        }
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);


        WebDriver driver = getDriver();
        Duration timeout = Duration.ofSeconds(80);
        WebDriverWait wait = new WebDriverWait(driver, timeout);


        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//th[text()=' Friday, May 24 ']")));

        if (element.isDisplayed()) {
            System.out.println("Element görünür.");
        } else {
            System.out.println("Element görünür değil.");
        }
        WebElement lessonElement = wait.until(ExpectedConditions.elementToBeClickable(dc.lesson));
        lessonElement.click();

        dc.myClick(dc.recordingButton);

        Thread.sleep(10000);

    }

    @Then("the user see the lesson video and play button")
    public void theUserSeeTheLessonVideoAndPlayButton() throws AWTException {

        try {

            Robot robot = new Robot();

            for (int i = 0; i < 6; i++) {
                robot.keyPress(KeyEvent.VK_TAB);
                robot.keyRelease(KeyEvent.VK_TAB);
                Thread.sleep(100);
            }

            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);

        } catch (AWTException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
