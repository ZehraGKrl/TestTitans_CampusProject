package Pages;

import Utilities.GWD;
import Utilities.ParentPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent_US_3 extends ParentPage {

    public DialogContent_US_3() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(css = "[id='mat-input-0']")
    public WebElement username;
    @FindBy(id = "mat-input-1")
    public WebElement password;
    @FindBy(css = "[class='mdc-button__label']")
    public WebElement loginButton;
    @FindBy(xpath = "//span[text()='Courses']")
    public WebElement coursesButton;
    @FindBy(xpath = "//span[text()='Calendar']")
    public WebElement calendarButton;
    @FindBy(xpath = "//span[text()='Attendance']")
    public WebElement attendanceButton;
    @FindBy(xpath = "//span[text()='Assignments']")
    public WebElement assignmentButton;
    @FindBy(xpath = "//span[text()='Grading']")
    public WebElement gradingButton;
    @FindBy(css = "[class='svg-inline--fa fa-bars fa-fw']")
    public WebElement moreButton;
    @FindBy(css = "[class='mat-mdc-tooltip-trigger mdc-icon-button mat-mdc-icon-button mat-unthemed mat-mdc-button-base mat-mdc-tooltip-disabled']>:nth-child(3)")
    public WebElement chatButton;
    @FindBy(xpath = "(//span[@class='mat-ripple mat-mdc-button-ripple'])[2]")
    public WebElement newMessageButton;
    @FindBy(css = "[class='username mr-12']")
    public WebElement profileSetingsButton;

    public WebElement getWebelement(String element){

        switch (element){

            case "coursesButton":
                return this.coursesButton;
            case "calendarButton":
                return this.calendarButton;
            case "attendanceButton":
                return this.attendanceButton;
            case "assignmentButton":
                return this.assignmentButton;
            case "gradingButton":
                return this.gradingButton;
            case "moreButton":
                return this.moreButton;
            case "chatButton":
                return this.chatButton;
            case "newMessageButton":
                return this.newMessageButton;
            case "profileSetingsButton":
                return this.profileSetingsButton;

        }
        return null;
    }





}
