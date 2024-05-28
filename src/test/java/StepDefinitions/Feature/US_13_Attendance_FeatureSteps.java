package StepDefinitions.Feature;

import Pages.DialogContent_US_O;
import Pages.LeftNav_US_O;
import Utilities.ParentPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class US_13_Attendance_FeatureSteps extends ParentPage {

    DialogContent_US_O dc=new DialogContent_US_O();
    LeftNav_US_O ln=new LeftNav_US_O();
    @Given("Click on the attendance button")
    public void clickOnTheAttendanceButtonAndAttendanceExcuseButton(DataTable attendanceButtons) {
        List<String> attendanceButtonlist = attendanceButtons.asList(String.class);

        for (int i = 0; i < attendanceButtonlist.size(); i++) {
            WebElement webElement =dc.getWebelement(attendanceButtonlist.get(i));
            dc.myClick(webElement);

        }
    }

    @When("Click on the attendance excuse button")
    public void clickOnTheAttendanceExcuseButton() {

        wait.until(ExpectedConditions.urlToBe("https://test.mersys.io/student-attendance"));
        dc.myJSClick(dc.attendanceExcuseButton);
    }

    @When("Enter an excuse")
    public void enterAnExcuse(DataTable excuseButtons) {
        List<String> excuseButtonList = excuseButtons.asList(String.class);

        for (int i = 0; i < excuseButtonList.size(); i++) {
            WebElement webElement =dc.getWebelement(excuseButtonList.get(i));
            dc.myClick(webElement);

        }

    }



}
