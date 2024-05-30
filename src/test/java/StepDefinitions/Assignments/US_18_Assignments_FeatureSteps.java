package StepDefinitions.Assignments;

import Pages.DialogContent_US_O;
import Pages.LeftNav_US_O;
import Utilities.GWD;
import Utilities.ParentPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class US_18_Assignments_FeatureSteps extends ParentPage {

    LeftNav_US_O ln = new LeftNav_US_O();
    DialogContent_US_O dc = new DialogContent_US_O();

    @Given("Hover-over the Assignments button")
    public void hoverOverTheAssignmentsButton() {
        ln.hoverOver(ln.assignmentsButton);
    }

    @When("Verify that the number of assigned tasks appears")
    public void verifyThatTheNumberOfAssignedTasksAppears() {
        WebElement number = wait.until(ExpectedConditions.visibilityOf(ln.assignmentsNumbers));
        System.out.println("number.getText() = " + number.getText());
        ln.myClick(ln.assignmentsButton);

    }

    @Then("Click on Assignments and verify the existence of assigned tasks in the sheet.")
    public void clickOnAssignmentsAndVerifyTheExistenceOfAssignedTasksInTheSheet() {
        dc.myClick(dc.assignmentsCalendarButton);
        wait.until(ExpectedConditions.visibilityOf(dc.thisYearButton));
        dc.myClick(dc.thisYearButton);
        wait.until(ExpectedConditions.visibilityOf(dc.searchButton));
        dc.myJSClick(dc.searchButton);
        dc.myJSClick(dc.semesterSelectButton);
        dc.myJSClick(dc.semesterAllButton);

        List<String> assignmentslist = new ArrayList<>();
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("[style='padding-top: 2px; font-size: 16px;']")));

        for (WebElement e : dc.assignmentsList)
            assignmentslist.add(e.getText());
        System.out.println("assignmentslist = " + assignmentslist);


        











    }


}
