package StepDefinitions.Feature;

import Pages.DialogContent_US_O;
import Pages.LeftNav_US_O;
import Utilities.ParentPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.List;

public class US_13_Attendance_FeatureSteps extends ParentPage {

    DialogContent_US_O dc=new DialogContent_US_O();
    LeftNav_US_O ln=new LeftNav_US_O();
    @Given("Click on the attendance button")
    public void clickOnTheAttendanceButtonAndAttendanceExcuseButton() {
        wait.until(ExpectedConditions.urlToBe("https://test.mersys.io/user-courses"));
        dc.myClick(dc.attendanceButton);

    }

    @When("Click on the attendance excuse button")
    public void clickOnTheAttendanceExcuseButton() {
        wait.until(ExpectedConditions.visibilityOf(dc.attendanceExcuseButton));
        dc.myJSClick(dc.attendanceExcuseButton);
    }

    @When("Enter an excuse")
    public void enterAnExcuse() {
        wait.until(ExpectedConditions.visibilityOf(dc.addButon));
        dc.myJSClick(dc.addButon);
        dc.myClick(dc.attendanceCalendarButton);
        dc.hoverOver(dc.dateButton);
        dc.myClick(dc.dateButton);
        dc.mySendKeys(dc.messageButton,"Cenazemiz var :D");

    }


    @And("The user uploads and sends a health report or a file upon request")
    public void theUserUploadsAndSendsAHealthReportOrAFileUponRequest() throws InterruptedException {
        dc.myClick(dc.attachFilesButton);
        dc.myClick(dc.fromLocalButton);
        dc.myUploadFile("C:\\Users\\ozi_9\\Süngerbob.jpg");
        dc.myClick(dc.sendButton);


    }

    @And("Check the accuracy of the received message.")
    public void checkTheAccuracyOfTheReceivedMessage() {

        wait.until(ExpectedConditions.visibilityOf(dc.successMessage));
            Assert.assertTrue(dc.successMessage.isDisplayed(), "No message is present!");
        }
    }

