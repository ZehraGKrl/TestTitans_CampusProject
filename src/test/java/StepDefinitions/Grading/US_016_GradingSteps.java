package StepDefinitions.Grading;

import Pages.DialogContent_US_M;
import Utilities.ParentPage;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class US_016_GradingSteps extends ParentPage{
    DialogContent_US_M dcm = new DialogContent_US_M();

    @Then("List the names of courses in the Course Grade button")
    public void listTheNamesOfCoursesInTheCourseGradeButton() {
        wait.until(ExpectedConditions.urlToBe("https://test.mersys.io/student-grading"));

        System.out.println("dcm.courseGradeList.size() = " + dcm.courseGradeList.size());

        for (WebElement e: dcm.courseGradeList){
            System.out.println("e.getText() = " + e.getText());
            
            
        }
    }

    @Then("Click on the transcript by subject button")
    public void clickOnTheTranscriptBySubjectButton() {
    }
}
