package Pages;

import Utilities.GWD;
import Utilities.ParentPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent_US_O extends ParentPage {

    public DialogContent_US_O() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(xpath = "(//span[@class='mat-mdc-menu-item-text'])[2]")
    public WebElement financeButton;
    @FindBy(xpath = "//span[text()='My Finance']")
    public WebElement myFinanceButton;
    @FindBy(css = "ms-standard-button button fa-icon+span")
    public WebElement viewButton;
    @FindBy(css = "[class='mat-mdc-radio-group ng-untouched ng-pristine ng-valid']>div>mat-radio-button>div>div>div+input")
    public WebElement stripeButton;
    @FindBy(css = "[class='mat-mdc-menu-trigger mat-mdc-button-wrapper mdc-button mat-mdc-button mat-mdc-button-unchecked mat-unthemed mat-mdc-button-base']")
    public WebElement moreButton;
    @FindBy(xpath = "//span[text()='Attendance']")
    public WebElement attendanceButton;
    @FindBy(xpath = "(//div[@class='mat-mdc-tab-label-container']//div)[8]")
    public WebElement attendanceExcuseButton;
    @FindBy(css = "[class='mat-mdc-tooltip-trigger mat-badge mdc-icon-button mat-mdc-icon-button mat-badge-accent mat-unthemed mat-mdc-button-base mat-badge-below mat-badge-after mat-badge-small mat-badge-hidden ng-star-inserted']>:nth-child(2)+span")
    public WebElement addButon;
    @FindBy(xpath = "((//ms-date[@class='w-100-p floating ng-untouched ng-pristine ng-valid ng-star-inserted']//div)[9]//span)[2]")
    public WebElement attendanceCalendarButton;
    @FindBy(xpath = "(//tbody[@class='mat-calendar-body']//td)[33]")
    public WebElement dateButton;
    @FindBy(css = "[placeholder='Message']")
    public WebElement messageButton;
    @FindBy(css = "[class='mat-mdc-menu-item mat-mdc-focus-indicator mat-mdc-tooltip-trigger mat-badge mat-badge-accent mat-badge-above mat-badge-after mat-badge-small mat-badge-hidden ng-star-inserted']>span>fa-icon+span")
    public WebElement attachFilesButton;
    @FindBy(css = "[class='mat-mdc-menu-item mat-mdc-focus-indicator mat-badge mat-badge-accent mat-badge-below mat-badge-after mat-badge-small mat-badge-hidden ng-star-inserted']>span")
    public WebElement fromLocalButton;
    @FindBy(css = "[class='mat-badge mdc-button mat-mdc-button mat-badge-accent mat-mdc-button-base mat-accent mat-badge-above mat-badge-after mat-badge-small mat-badge-hidden ng-star-inserted mat-mdc-raised-button mdc-button--raised']>span>span")
    public WebElement sendButton;
    @FindBy(xpath = "//*[contains(text(),'Attendance Excuse successfully sent')]")
    public WebElement successMessage;


public WebElement getWebelement(String element){

    switch (element) {

        case "moreButton":
            return this.moreButton;
        case "financeButton":
            return this.financeButton;
        case "myFinanceButton":
            return this.myFinanceButton;
        case "viewButton":
            return this.viewButton;
        case "stripeButton":
            return this.stripeButton;
        case "attendanceButton":
            return this.attendanceButton;
        case "attendanceExcuseButton":
            return this.attendanceExcuseButton;
        case "addButon":
            return this.addButon;
        case "AttendanceCalendarButton":
            return this.attendanceCalendarButton;
        case "dateButton":
            return this.dateButton;
        case "messageButton":
            return this.messageButton;
        case "attachFilesButton":
            return this.attachFilesButton;

    }
    return null;
}



}
