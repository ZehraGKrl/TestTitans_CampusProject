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
    @FindBy(css = "[class='mdc-label']")
    public WebElement stripeButton;
    @FindBy(css = "[class='wrap-mat-radio-label']")
    public WebElement payAmountDueButton;
    @FindBy(xpath = "(//span[@class='w-50-p'])[2]")
    public WebElement payButton;
    @FindBy(css = "[id='ms-currency-field-0']>input")
    public WebElement amountButton;
    @FindBy(xpath = "(//span[@class='ng-star-inserted'])[9]")
    public WebElement paymentButton;
    @FindBy(xpath = "//iframe[@style='border: 0px !important; margin: -4px; padding: 0px !important; width: calc(100% + 8px); min-width: 100% !important; overflow: hidden !important; display: block !important; user-select: none !important; transform: translate(0px) !important; color-scheme: light only !important; height: 228.453px; opacity: 1; transition: height 0.35s ease 0s, opacity 0.4s ease 0.1s;']")
    public WebElement iframe1;
    @FindBy(css = "[class='p-PaymentElement de7zKgf4__p-Root p-Locale-en p-Animatable p-LTR'] div>:nth-child(2)>div>div>input")
    public WebElement cardNumberButton;
    @FindBy(xpath = "(//span[@class='ng-star-inserted'])[9]")
    public WebElement expirationButton;
    @FindBy(xpath = "(//span[@class='ng-star-inserted'])[9]")
    public WebElement cvcButton;
    @FindBy(xpath = "(//span[@class='ng-star-inserted'])[9]")
    public WebElement stripePaymentsButton;
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
        case "payButton":
            return this.payButton;
        case "payAmountDueButton":
            return this.payAmountDueButton;
        case "amountButton":
            return this.amountButton;
        case "cardNumberButton":
            return this.cardNumberButton;
        case "expirationButton":
            return this.expirationButton;
        case "cvcButton":
            return this.cvcButton;
        case "stripePaymentsButton":
            return this.stripePaymentsButton;
        case "paymentButton":
            return this.paymentButton;
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
