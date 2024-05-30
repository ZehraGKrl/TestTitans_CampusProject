package Pages;

import Utilities.GWD;
import Utilities.ParentPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent_US_M extends ParentPage {
    public DialogContent_US_M() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css = "[id='mat-input-0']")
    public WebElement username;

    @FindBy(css = "[formcontrolname='password']")
    public WebElement password;

    @FindBy(css = "[class='mdc-button__label']")
    public WebElement loginButton;

    @FindBy(css = "[class='mat-expansion-panel-header-description ng-star-inserted']")
    public WebElement invalidLoginMessage;

    @FindBy(xpath = "(//span[text()='Courses'])[1]")
    public WebElement courses;

    @FindBy(xpath = "//span[text()='Outbox']")
    public WebElement outboxButton;

    @FindBy(xpath = "((//tbody/tr/td)[6])/div/ms-confirm-button")
    public WebElement trashButton;

    @FindBy(xpath = "//span[text()=' Yes ']")
    public WebElement confirmButton;

    @FindBy(css = "[class='mat-expansion-panel-header-description ng-star-inserted'] div")
    public WebElement confirmMessage;

    @FindBy(xpath = "//span[text()='My Finance']")
    public WebElement MyFinanceButton;

    @FindBy(xpath = "(//tbody/tr/td)[10]/div")
    public WebElement viewButton;

    @FindBy(css = "[class='mdc-label']")
    public WebElement stripeButton;

    @FindBy(css = "[class='w-50-p discount-class']")
    public WebElement payAmountDue;

    @FindBy(xpath = "(//span[@class='w-50-p'])[2]")
    public WebElement payButton;

    @FindBy(xpath = "//ms-currency-field[@formcontrolname='customAmountField']//input")
    public WebElement InputAmount;

    @FindBy(xpath = "//ms-button")
    public WebElement PayButton1;

    @FindBy(css = "[name='number']")
    public WebElement cardNumber;

    @FindBy(xpath = "(//div[@class='p-Input'])[2]//input")
    public WebElement expirationNumber;

    @FindBy(xpath = "(//div[@class='p-Input'])[3]//input")
    public WebElement cvcNumber;

    @FindBy(xpath = "((//span[@class='mdc-button__label'])[15]//following-sibling::span)[1]")
    public WebElement StripePayments;

    @FindBy(css = "[class='mat-expansion-panel-header-description ng-star-inserted']")
    public WebElement confirmMessagePay;


    public WebElement getWebElement(String strElement) {
        switch (strElement) {
            case "usernameInput":
                return this.username;
            case "passwordInput":
                return this.password;
            case "loginButton":
                return this.loginButton;
            case "outboxButton":
                return this.outboxButton;
            case "trashButton":
                return this.trashButton;
            case "confirmButton":
                return this.confirmButton;
            case "MyFinanceButton":
                return this.MyFinanceButton;
            case "viewButton":
                return this.viewButton;
            case "payAmountDue":
                return this.payAmountDue;
            case "payButton":
                return this.payButton;


        }
        return null;
    }
}
