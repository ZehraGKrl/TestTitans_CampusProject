package StepDefinitions.Assignments;

import Pages.DialogContent_US_M;
import Utilities.ParentPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class US_021_AssignmentsSteps extends ParentPage {
    DialogContent_US_M dcm = new DialogContent_US_M();
    @Then("user should be able to see submit button and click button")
    public void userShouldBeAbleToSeeSubmitButtonAndClickButton() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//span[@class='mat-mdc-button-persistent-ripple mdc-icon-button__ripple'])[6]//following-sibling::fa-icon")));
        dcm.myJSClick(dcm.submitButton);

    }

    @And("the user should be able to write in a text editor, insert images and create tables")
    public void theUserShouldBeAbleToWriteInATextEditorInsertImagesAndCreateTables() {
    }
}
