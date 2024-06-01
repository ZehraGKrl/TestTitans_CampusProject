package StepDefinitions.HamburgerMenu;

import Pages.DialogContent_US_E;
import Utilities.GWD;
import Utilities.ParentPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.awt.*;
import java.awt.event.KeyEvent;
import static org.testng.AssertJUnit.assertTrue;

public class US_020_Assignments extends ParentPage {

    DialogContent_US_E dc = new DialogContent_US_E();

    @When("the user clicks the assignments button")
    public void theUserClicksTheAssignmentsButton() throws AWTException {
        wait.until(ExpectedConditions.urlToBe("https://test.mersys.io/user-courses"));

        Robot robot = new Robot();

        for (int i = 0; i < 4; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
        }
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }

    @Then("the user selects a homework and clicks the information button, submit button, and favorite button")
    public void theUserSelectsAHomeworkAndClicksTheInformationButtonSubmitButtonAndFavoriteButton() throws AWTException, InterruptedException {

        Robot robot = new Robot();

        dc.myClick(dc.biologyAssigmentInformation);
        wait(4);
        dc.myClick(dc.backButton);
        dc.myClick(dc.sendButton);
        wait(5);
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);
        wait(5);
        dc.myClick(dc.favoriButton);

    }

    @And("the user selects and clicks a homework and sees the homework information")
    public void theUserSelectsAndClicksAHomeworkAndSeesTheHomeworkInformation() throws InterruptedException {

        dc.myClick(dc.biologyLesson);
        wait(5);
        wait.until(ExpectedConditions.visibilityOf(dc.lessonConfirmation));

        // WebElement'in varlığını doğrula
        assertTrue("Lesson confirmation message is not present", dc.lessonConfirmation.isDisplayed());
    }

    @And("the user clicks the discuss button")
    public void theUserClicksTheDiscussButton() throws AWTException, InterruptedException {

        Robot robot = new Robot();
        dc.myClick(dc.discussButton);
        wait(5);
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);
        dc.myClick(dc.backButton);

        GWD.quitDriver();

    }
}
