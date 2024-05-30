package Pages;

import Utilities.GWD;
import Utilities.ParentPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent_US_E extends ParentPage {

    public DialogContent_US_E() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//span[contains(@class, 'username') and contains(@class, 'mr-12')]")
    public WebElement profileButton;

    @FindBy(xpath = "//span[text()='Settings']")
    public WebElement settingsButton;

    @FindBy(xpath = "//span[text()='Default Theme']")
    public WebElement defaultTheme;

    @FindBy(xpath = "//mat-option[.//span[text()=' Purple Theme ']]")
    public WebElement purpleTheme;

    @FindBy(xpath = "//span[text()='Save' and @style='visibility: visible;']")
    public WebElement saveButton;

    @FindBy(xpath = "//div[text()='Profile successfully updated']")
    public WebElement successMessage;

    @FindBy(xpath = "//span[text()='Calendar']")
    public WebElement calendar;

    @FindBy(xpath = "//span[@class='mat-mdc-focus-indicator']")
    public WebElement previousButton;

    @FindBy(xpath = "//*[@id=\"mat-tab-content-0-0\"]/div[1]/ms-course-schedule-board[1]/ms-browse[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/div[2]/div[1]/div[1]/div[1]/span[1]")
    public WebElement lesson;

    @FindBy(xpath = "//span[@class='ng-star-inserted' and @style='visibility: visible;' and text()='Recording']")
    public WebElement recordingButton;

    @FindBy(xpath = "//td[contains(@class, 'cdk-column-createdDate') and text()='05/27/2024']")
    public WebElement studentName;

    @FindBy(xpath = "//label[@class='mdc-label']")
    public WebElement stripeButton;

    @FindBy(css = "[class='w-50-p discount-class']")
    public WebElement allPayment;

    @FindBy(xpath = "(//span[@class='w-50-p'])[2]")
    public WebElement payButton;

    @FindBy(xpath = "//ms-currency-field[@formcontrolname='customAmountField']//input")
    public WebElement amountButton;

    @FindBy(xpath = "(//span[@class='ng-star-inserted'])[9]")
    public WebElement paymentButton;

    @FindBy(css = "[class='__PrivateStripeElement']>iframe")
    public WebElement iframe;

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

    @FindBy(xpath = "//span[text()='Fee/Balance Detail']\n")
    public WebElement feeBalanceDetail;

    @FindBy(css = "html > body > app > student-layout > div > student-toolbar-horizontal > mat-toolbar > div > div:nth-of-type(2) > user-message-bell > button > span:nth-of-type(2)\n")
    public WebElement messageButton;

    @FindBy(xpath = "//td[contains(text(), 'Thu May 30, 2024 22:51')]\n")
    public WebElement firstMessage;


}

