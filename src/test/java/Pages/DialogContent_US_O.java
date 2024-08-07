package Pages;

import Utilities.GWD;
import Utilities.ParentPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

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
    @FindBy(css = "[class='mdc-label']")
    public WebElement stripeButton;
    @FindBy(css = "[class='w-50-p discount-class']")
    public WebElement payInFullButton;
    @FindBy(xpath = "(//span[@class='w-50-p'])[2]")
    public WebElement payButton;
    @FindBy(xpath = "//ms-currency-field[@formcontrolname='customAmountField']//input")
    public WebElement amountButton;
    @FindBy(xpath = "(//span[@class='ng-star-inserted'])[9]")
    public WebElement paymentButton;
    @FindBy(css = "[class='__PrivateStripeElement']>iframe")
    public WebElement iframe1;
    @FindBy(css = "[name='number']")
    public WebElement cardNumberButton;
    @FindBy(css = "[id='Field-expiryInput']")
    public WebElement expirationButton;
    @FindBy(css = "[id='Field-cvcInput']")
    public WebElement cvcButton;
    @FindBy(xpath = "((//span[@class='mdc-button__label'])[15]//following-sibling::span)[1]")
    public WebElement stripePaymentsButton;
    @FindBy(css = "[class='mat-expansion-panel-header-description ng-star-inserted']")
    public WebElement paymentSuccessMessage;
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
    @FindBy(xpath = "(//tbody[@class='mat-calendar-body']//span)[5]")
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
    @FindBy(css = "[aria-label='Open calendar']>span+svg+span")
    public WebElement assignmentsCalendarButton;
    @FindBy(xpath = "(//button[@class='mdc-button mat-mdc-button mat-primary mat-mdc-button-base ng-star-inserted'])[5]/span[2]")
    public WebElement thisYearButton;
    @FindBy(xpath = "(//button[@class='mdc-button mat-mdc-button mdc-button--unelevated mat-mdc-unelevated-button mat-primary mat-mdc-button-base']//span)[3]")
    public WebElement searchButton;
    @FindBy(xpath = "(//body[@class='ng-tns-0-0']//div)[71]")
    public WebElement semesterSelectButton;
    @FindBy(xpath = "(//body[@class='ng-tns-0-0']//mat-option)[1]")
    public WebElement semesterAllButton;
    @FindBy(css = "[style='padding-top: 2px; font-size: 16px;']")
    public List<WebElement> assignmentsList;
    @FindBy(css = "[class='mat-accent-700-bg']")
    public List<WebElement> calendarIcons;
    @FindBy(css = "[class='mat-accent-700-bg']+span")
    public List<WebElement> calendarIconMeanings;
    @FindBy(css = "div[role='tab']:nth-child(1)")
    public WebElement weeklyCoursePlanButton;
    @FindBy(css = "[class='mat-badge mat-badge-primary mat-badge-overlap mat-badge-below mat-badge-after mat-badge-small mat-badge-hidden']>div>span")
    public List<WebElement> weeklyCoursePlanLesson;
    @FindBy(xpath = "(//body[@class='ng-tns-0-0']//h4)/strong")
    public WebElement weeklyCoursePlanDateRange;
    @FindBy(css = "#mat-tab-content-0-0 > div > ms-course-schedule-board > ms-browse > div > div > div:nth-child(2) > div:nth-child(4) > button:nth-child(1) > span.mat-mdc-focus-indicator")
    public WebElement previousButton;
    @FindBy(css = "#mat-tab-content-0-0 > div > ms-course-schedule-board > ms-browse > div > div > div:nth-child(2) > div:nth-child(4) > button:nth-child(2) > span.mat-mdc-focus-indicator")
    public WebElement todayButton;
    @FindBy(css = "#mat-tab-content-0-0 > div > ms-course-schedule-board > ms-browse > div > div > div:nth-child(2) > div:nth-child(4) > button:nth-child(3) > span.mat-mdc-focus-indicator")
    public WebElement nextButton;
    @FindBy(css = "div[role='tab']:nth-child(2)")
    public WebElement calendarButton;
    @FindBy(css = "[class='fc-prevCalendar-button fc-button fc-button-primary']>span")
    public WebElement calendarLeftButton;
    @FindBy(css = "[class='fc-nextCalendar-button fc-button fc-button-primary']>span")
    public WebElement calendarRightButton;
    @FindBy(css = "[class='fc-todayCalendar-button fc-button fc-button-primary']")
    public WebElement calendarTodayButton;
    @FindBy(css = "[class='fc-weekCalendar-button fc-button fc-button-primary']")
    public WebElement weekButton;
    @FindBy(xpath = "(//div[@class='fc-button-group']//button)[4]")
    public WebElement mounthButton;
    @FindBy(css = "[class='fc-dayCalendar-button fc-button fc-button-primary']")
    public WebElement dayButton;
    @FindBy(css = "[class='mat-badge mat-badge-primary mat-badge-overlap mat-badge-below mat-badge-after mat-badge-small mat-badge-hidden']>div>span")
    public WebElement biologyLesson;
    @FindBy(xpath = "//span[contains(text(),'Settings')]")
    public WebElement settingsButton;
    @FindBy(css = "[class= 'profile-image avatar huge ng-star-inserted']")
    public WebElement profilePicture;
    @FindBy(css = "[data-icon='upload']")
    public WebElement uploadButton;
    @FindBy(xpath = "//*[text()=' Upload ']")
    public WebElement uploadButton2;
    @FindBy(css = "ms-save-button fa-icon+span")
    public WebElement saveButton;
    @FindBy(xpath = "//*[text()='Profile successfully updated']")
    public WebElement verifyPhoto;





    public WebElement getWebelement(String element){

    switch (element) {

        case "moreButton":
            return this.moreButton;
        case "financeButton":
            return this.financeButton;

    }
    return null;
}



}
