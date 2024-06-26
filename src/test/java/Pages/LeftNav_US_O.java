package Pages;

import Utilities.GWD;
import Utilities.ParentPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav_US_O extends ParentPage {

    public LeftNav_US_O() {
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
    public WebElement assignmentsButton;
    @FindBy(xpath = "//span[text()='Grading']")
    public WebElement gradingButton;
    @FindBy(css = "[class='mat-mdc-menu-trigger mat-mdc-button-wrapper mdc-button mat-mdc-button mat-mdc-button-unchecked mat-unthemed mat-mdc-button-base']")
    public WebElement moreButton;
    @FindBy(xpath = "(//span[@class='mat-mdc-focus-indicator'])[7]")
    public WebElement chatButtonOpen;
    @FindBy(xpath = "(//simple-dialog-title//* [@class='mat-mdc-focus-indicator'])[2]")
    public WebElement closeButton;
    @FindBy(css = "user-message-bell div+span")
    public WebElement newMessageButtonOpen;
    @FindBy(css = "[class='svg-inline--fa fa-angle-down fa-fw']")
    public WebElement profileSettingsButton;
    @FindBy(xpath = "//div[@class='cdk-overlay-container']/div")
    public WebElement assignmentsNumbers;





}
