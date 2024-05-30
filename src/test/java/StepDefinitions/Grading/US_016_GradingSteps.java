package StepDefinitions.Grading;

import Pages.DialogContent_US_M;
import Pages.LeftNav_US_M;
import Utilities.ParentPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class US_016_GradingSteps extends ParentPage {
    DialogContent_US_M dcm = new DialogContent_US_M();
    LeftNav_US_M lfm = new LeftNav_US_M();

    @Then("List the names of courses in the Course Grade button")
    public void listTheNamesOfCoursesInTheCourseGradeButton() {

        System.out.println("dcm.courseGradeList.size() = " + dcm.courseGradeList.size());

        for (WebElement e : dcm.courseGradeList) {
            System.out.println("e.getText() = " + e.getText());


        }
    }
    @Then("Click on the transcript by subject button")
    public void clickOnTheTranscriptBySubjectButton() {
        wait.until(ExpectedConditions.elementToBeClickable(lfm.transcriptBySubject));
        lfm.myClick(lfm.transcriptBySubject);
    }

    @And("Transcript by course should be appeared")
    public void transcriptByCourseShouldBeAppeared() {
        dcm.verifyContainsText(dcm.subject, "Subject");
    }

    @Then("Click on the Student transcript button")
    public void clickOnTheStudentTranscriptButton() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(lfm.studentTranscript));
        dcm.myClick(lfm.studentTranscript);
    }


    @And("Verify elements in Student Transcript button")
    public void verifyElementsInStudentTranscriptButton() {
        List<String> listItems=new ArrayList<>();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//thead/tr/th")));

        for (WebElement e : dcm.items) {
            listItems.add(e.getText());
        }

        Assert.assertTrue(listItems.get(0).trim().equalsIgnoreCase("#"));
        Assert.assertTrue(listItems.get(1).trim().equalsIgnoreCase("Course Code"));
        Assert.assertTrue(listItems.get(2).trim().equalsIgnoreCase("Course Name"));
        Assert.assertTrue(listItems.get(3).trim().equalsIgnoreCase("Grade"));
        Assert.assertTrue(listItems.get(4).trim().equalsIgnoreCase("Letter Grade"));
        Assert.assertTrue(listItems.get(5).trim().equalsIgnoreCase("Description"));

    }
}
