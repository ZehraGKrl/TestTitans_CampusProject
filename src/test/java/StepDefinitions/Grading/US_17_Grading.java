package StepDefinitions.Grading;

import Pages.DialogContent_US_Z;
import Utilities.ParentPage;
import io.cucumber.java.en.When;
import org.apache.commons.math3.analysis.function.Exp;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class US_17_Grading extends ParentPage {
    DialogContent_US_Z dcz= new DialogContent_US_Z();

    @When("Click the grading and student transcript button")
    public void clickTheGradingAndStudentTranscriptButton() {
        wait.until(ExpectedConditions.elementToBeClickable(dcz.grading));
        dcz.myClick(dcz.grading);
        dcz.myClick(dcz.transcript);
    }
}
