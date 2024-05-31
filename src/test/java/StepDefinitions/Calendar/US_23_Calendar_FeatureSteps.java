package StepDefinitions.Calendar;

import Pages.DialogContent_US_O;
import Pages.LeftNav_US_O;
import Utilities.ParentPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class US_23_Calendar_FeatureSteps extends ParentPage {

    LeftNav_US_O ln = new LeftNav_US_O();
    DialogContent_US_O dc = new DialogContent_US_O();

    @Given("Click on the Calendar Button")
    public void clickOnTheCalendarButton() {
        ln.myClick(ln.calendarButton);
    }

    @When("Verify that the icons P=Published, S=Started, E=Ended, C=Cancelled are present.")
    public void verifyThatTheIconsPPublishedSStartedEEndedCCancelledArePresent() {
        List<String> calendarIconList = new ArrayList<>();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("[class='mat-accent-700-bg']")));
        for (WebElement e : dc.calendarIcons) {
            calendarIconList.add(e.getText());
        }

        Assert.assertTrue(calendarIconList.get(0).trim().equalsIgnoreCase("P"));
        Assert.assertTrue(calendarIconList.get(1).trim().equalsIgnoreCase("S"));
        Assert.assertTrue(calendarIconList.get(2).trim().equalsIgnoreCase("E"));
        Assert.assertTrue(calendarIconList.get(3).trim().equalsIgnoreCase("C"));

        List<String> calendarIconMeaningsList = new ArrayList<>();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("[class='mat-accent-700-bg']+span")));
        for (WebElement e : dc.calendarIconMeanings) {
            calendarIconMeaningsList.add(e.getText());
        }

        Assert.assertTrue(calendarIconMeaningsList.get(0).trim().equalsIgnoreCase("Published"));
        Assert.assertTrue(calendarIconMeaningsList.get(1).trim().equalsIgnoreCase("Started"));
        Assert.assertTrue(calendarIconMeaningsList.get(2).trim().equalsIgnoreCase("Ended"));
        Assert.assertTrue(calendarIconMeaningsList.get(3).trim().equalsIgnoreCase("Cancelled"));

    }

    @Then("Click on the Weekly Course Plan button. and check and verify the required functions")
    public void clickOnTheWeeklyCoursePlanButtonAndCheckAndVerifyTheRequiredFunctions() {
      dc.verifyContainsText(dc.weeklyCoursePlanDateRange, "27 May : Monday - 31 May : Friday ");



    }

    @And("Click on the calendar button inside the calendar. and check and verify the required functions")
    public void clickOnTheCalendarButtonInsideTheCalendarAndCheckAndVerifyTheRequiredFunctions() {

    }
}
