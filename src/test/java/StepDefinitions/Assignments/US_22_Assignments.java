package StepDefinitions.Assignments;

import Pages.DialogContent_US_Z;
import Utilities.ParentPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class US_22_Assignments extends ParentPage {
    DialogContent_US_Z dcz=new DialogContent_US_Z();

    @When("Click the assignments button")
    public void clickTheAssignmentsButton() {
        dcz.myClick(dcz.assignments);
    }

    @And("Search button should be visible and clickable")
    public void searchButtonShouldBeVisibleAndClickable() {
        wait.until(ExpectedConditions.urlContains("assignment"));
        Assert.assertTrue(dcz.search.isDisplayed());
        dcz.myClick(dcz.search);
    }
}
