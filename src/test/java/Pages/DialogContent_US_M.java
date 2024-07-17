package Pages;

import Utilities.GWD;
import Utilities.ParentPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.cert.X509Certificate;
import java.util.List;

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

    @FindBy(xpath = "(//span[@class='mdc-tab__content'])[1]//span")
    public WebElement CourseGradeButton;

    @FindBy(css = "[class='mat-mdc-header-row mdc-data-table__header-row cdk-header-row ng-star-inserted']>th")
    public List<WebElement> elementsInCourseGrade;

    @FindBy(xpath = "(//tbody/tr/td)[1]")
    public WebElement subject;

    @FindBy(xpath = "//thead/tr/th")
    public List<WebElement> items;

    @FindBy(xpath = "(//span[@class='mat-mdc-button-persistent-ripple mdc-icon-button__ripple'])[6]//following-sibling::fa-icon")
    public WebElement submitButton;

    @FindBy(id = "tinymce")
    public WebElement editorTextScreen;

    @FindBy(xpath = "(//tbody/tr/td)[1]")
    public WebElement row1Column1;

    @FindBy(xpath = "(//tbody/tr/td)[2]")
    public WebElement row1Column2;

    @FindBy(xpath = "(//tbody/tr/td)[3]")
    public WebElement row2Column1;

    @FindBy(css = "[class='tox-notification__body']")
    public WebElement errorMessage;

    @FindBy(xpath = "//span[text()='From Local']")
    public WebElement fromLocal;

    @FindBy(xpath = "//span[text()='Save as Draft']")
    public WebElement saveAsDraft;

    @FindBy(xpath = "(//mat-select)[4]")
    public WebElement file;

    @FindBy(xpath = "//span[text()=' Image ']")
    public WebElement image;

    @FindBy(xpath = "//span[text()='Edit']")
    public WebElement edit;

    @FindBy(xpath = "//div[text()='Paste']")
    public WebElement paste;

    @FindBy(xpath = "//div[text()='Successfully saved as a draft']")
    public WebElement confirmMessage2;

    @FindBy(xpath = "//span[text()='Submit']")
    public WebElement submitButton1;

    @FindBy(xpath = "((//span[@class='mat-mdc-button-persistent-ripple mdc-button__ripple'])[20]//following-sibling::span)[1]")
    public WebElement yesButton;

    @FindBy(xpath = "//div[text()='Successfully submitted to review']")
    public WebElement confirmSubmit;

    @FindBy(xpath = "//span[text()='New Message']")
    public WebElement messageButton;

    @FindBy(xpath = "//span[text()='Inbox']")
    public WebElement inboxButton;

    @FindBy(xpath = "//span[text()='Trash']")
    public WebElement trashButton1;

    @FindBy(xpath = "//span[text()='Fee/Balance Detail']")
    public WebElement feeBalanceDetailButton;

    @FindBy(xpath = "//div[text()=' Date ']")
    public WebElement dateText;

    @FindBy(xpath = "//div[text()=' Debit ']")
    public WebElement debitText;

    @FindBy(css = "[class='mat-datepicker-toggle-default-icon ng-star-inserted']+span")
    public WebElement dateButton;

    @FindBy(xpath = "//span[text()=' This year ']")
    public WebElement thisYearButton;

    @FindBy(xpath = "(//button[@class='mdc-button mat-mdc-button mdc-button--unelevated mat-mdc-unelevated-button mat-primary mat-mdc-button-base']//span)[3]")
    public WebElement searchButton;

    @FindBy(xpath = "(//div[@class='assignment ng-star-inserted']//following::strong)[1]")
    public WebElement lesson;

    @FindBy(xpath = "(//div[@class='mat-badge mat-badge-accent mat-badge-above mat-badge-after mat-badge-small mat-badge-hidden'])[2]")
    public WebElement discussionButton;

    @FindBy(xpath = "(//span[@class='mat-mdc-focus-indicator'])[45]")
    public WebElement chatButton;

    @FindBy(xpath = "(//span[@class='mat-mdc-focus-indicator'])[46]")
    public WebElement contactsButton;

    @FindBy(xpath = "(//span[@class='mat-mdc-focus-indicator'])[49]")
    public WebElement attachFilesButton;

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
            case "messageButton" :
                return this.messageButton;
            case "inboxButton":
                return  this.inboxButton;
            case "trashButton1":
                return this.trashButton1;
            case "feeBalanceDetailButton":
                return this.feeBalanceDetailButton;
            case "dateButton":
                return this.dateButton;
            case "thisYearButton":
                return this.thisYearButton;
            case "searchButton":
                return this.searchButton;
            case "lesson":
                return this.lesson;



        }
        return null;
    }
}
