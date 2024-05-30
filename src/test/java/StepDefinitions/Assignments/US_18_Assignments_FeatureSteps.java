package StepDefinitions.Assignments;

import Pages.LeftNav_US_O;
import Utilities.GWD;
import Utilities.ParentPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class US_18_Assignments_FeatureSteps extends ParentPage {

    LeftNav_US_O ln=new LeftNav_US_O();
    @Given("Hover-over the Assignments button")
    public void hoverOverTheAssignmentsButton() {
      ln.hoverOver(ln.assignmentsButton);
    }

    @When("Verify that the number of assigned tasks appears")
    public void verifyThatTheNumberOfAssignedTasksAppears() {
        ln.verifyContainsText(ln.assignmentsNumbers,"9");
    }

    @Then("Click on Assignments and verify the existence of assigned tasks in the sheet.")
    public void clickOnAssignmentsAndVerifyTheExistenceOfAssignedTasksInTheSheet() {

    }
}
