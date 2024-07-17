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

    @FindBy(css = "div#container-3 > ms-assignment-panel-student > div > div > div > div:nth-of-type(2) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > div > div > div:nth-of-type(2) > ms-icon-button > button > span:nth-of-type(2)")
    public WebElement biologyAssigmentInformation;

    @FindBy(css = "html > body > app > student-layout > div > mat-drawer-container > mat-drawer-content > div > div:nth-of-type(2) > button > span:nth-of-type(2)")
    public WebElement backButton;

    @FindBy(css = "div#container-3 > ms-assignment-panel-student > div > div > div > div:nth-of-type(2) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > div > div > div:nth-of-type(2) > ms-icon-button:nth-of-type(2) > button > span:nth-of-type(2)\n")
    public WebElement sendButton;

    @FindBy(css = "div#container-3 > ms-assignment-panel-student > div > div > div > div:nth-of-type(2) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > div > div > div:nth-of-type(2) > ms-icon-button:nth-of-type(3) > button > span:nth-of-type(2)")
    public WebElement favoriButton;

    @FindBy(xpath = "//strong[contains(text(), '11A- Biology')]\n")
    public WebElement biologyLesson;

    @FindBy(css = "div#container-3 > my-assignments-form-page > my-assignments-form > div > div > div > div > div > div:nth-of-type(3) > user-chat-bell > button > span:nth-of-type(2)\n")
    public WebElement discussButton;

    @FindBy(xpath = "//div[contains(text(), 'Fri May 31, 2024 10:00')]\n")
    public WebElement lessonConfirmation;

    @FindBy(css = "div#container-3 > app-user-message-form > mat-card > div > div > ms-button > button > span:nth-of-type(2)\n")
    public WebElement addRecevier;

    @FindBy(css = "//input[@placeholder='Name, Username or E-mail']\n")
    public WebElement getAddRecevierText;

    @FindBy(xpath = "//td[contains(text(), 'Teacher_1 T1')]")
    public WebElement getAddRecevier1;

    @FindBy(xpath = "//td[contains(text(), 'Student_10 11A')]")
    public WebElement getAddRecevier2;

    @FindBy(xpath = "//span[contains(text(), 'Add & Close')]\n")
    public WebElement addAndClose;

    @FindBy(css = "input#ms-text-field-11\n")
    public WebElement subject;


    @FindBy(xpath = "//*[@id='mat-input-0']")
    public WebElement username;

    @FindBy(xpath = "//*[@id='mat-input-1']")
    public WebElement password;

    @FindBy(xpath = "//span[@class='mdc-button__label']")
    public WebElement login;

    @FindBy(xpath = "//div[@fxlayout='row']//div[@class='ng-star-inserted']//img")
    public WebElement logo;

    @FindBy(xpath = "/html/body/app/student-layout/div/student-toolbar-horizontal/mat-toolbar/div/div[1]/div/div[2]/div/ms-layout-menu-button[3]/button")
    public WebElement attendance;

    @FindBy(xpath = "/html/body/app/student-layout/div/student-toolbar-horizontal/mat-toolbar/div/div[1]/div/div[2]/div/ms-layout-menu-button[4]/button")
    public WebElement assignments;

    @FindBy(xpath = "/html/body/app/student-layout/div/student-toolbar-horizontal/mat-toolbar/div/div[1]/div/div[2]/div/ms-layout-menu-button[5]/button")
    public WebElement grading;

    @FindBy(xpath = "/html/body/app/student-layout/div/student-toolbar-horizontal/mat-toolbar/div/div[1]/div/div[2]/div/span[1]/span/button")
    public WebElement hamburgerMenu;

    @FindBy(xpath = "/html/body/app/student-layout/div/student-toolbar-horizontal/mat-toolbar/div/div[2]/user-chat-bell/button")
    public WebElement messages;

    @FindBy(xpath = "//button[@aria-label='Close dialog']//span[@class='mat-mdc-focus-indicator']")
    public WebElement messagesCloseButton;

    @FindBy(xpath = "/html/body/app/student-layout/div/student-toolbar-horizontal/mat-toolbar/div/div[2]/user-message-bell/button")
    public WebElement newMessages;

    @FindBy(xpath = "//button[@aria-label='Close dialog']//span[@class='mat-mdc-focus-indicator']")
    public WebElement newMessagesCloseButton;

    @FindBy(xpath = "/html/body/app/student-layout/div/student-toolbar-horizontal/mat-toolbar/div/div[2]/button")
    public WebElement profile;

    @FindBy(xpath = "//*[@id='mat-menu-panel-4']/div/button[1]")
    public WebElement messaging;

    @FindBy(xpath = "//*[@id='mat-menu-panel-5']/div/button[1]")
    public WebElement newMessage;

    @FindBy(xpath = "//*[@id='mat-menu-panel-5']/div/button[2]")
    public WebElement inbox;

    @FindBy(xpath = "//*[@id='mat-menu-panel-5']/div/button[3]")
    public WebElement outbox;

    @FindBy(xpath = "//*[@id='mat-menu-panel-5']/div/button[4]")
    public WebElement trash;

    @FindBy(xpath = "//*[@id=\"ms-table-1\"]/div/cdk-virtual-scroll-viewport/div[1]/table/tbody/tr[1]/td[3]/div/div")
    public WebElement outboxMessage;

    @FindBy(css = "#\\32  > div > div > subscribers-dialog > ms-dialog > ms-dialog-buttons > mat-dialog-actions > ms-button:nth-child(1) > button")
    public WebElement add;

    @FindBy(xpath = "//*[@id=\"mat-mdc-checkbox-23\"]")
    public WebElement teacher1;

    @FindBy(css = "#\\32  > div > div > subscribers-dialog > ms-dialog > ms-dialog-buttons > mat-dialog-actions > ms-button:nth-child(2) > button")
    public WebElement addAndExit;

    @FindBy(xpath = "//input[@id='ms-text-field-0']")
    public WebElement subjectTextField;

    @FindBy(xpath = "//*[@id=\"tinymce\"]")
    public WebElement messageTextField;

    @FindBy(xpath = "//*[@id=\"container-3\"]/app-user-message-form/mat-card/div/div[1]/ms-button/button")
    public WebElement addRecievers;

    @FindBy(xpath = "//*[@id=\"mat-input-3\"]")
    public WebElement recieverInput;

    @FindBy(xpath = "//*[@id=\"ms-table-0\"]/div/cdk-virtual-scroll-viewport/div[1]/table/tbody/tr[3]")
    public WebElement student1;

    @FindBy(xpath = "//*[@id=\"container-3\"]/app-user-message-form/mat-card/div/div[3]/file-upload/div/div[2]/ms-button/button")
    public WebElement attachFiles;

    @FindBy(xpath = "//*[@id=\"mat-menu-panel-19\"]/div/ms-standard-button[1]/button")
    public WebElement fromLocalButton;

    @FindBy(xpath = "/html/body/app/student-layout/div/footer/user-message-buttons/button-bar/div/div[1]/ms-button[2]/button")
    public WebElement sendButton2;

    @FindBy(xpath = "//div[contains(text(),'Message Successfully sent')]")
    public WebElement successMessage2;

    public WebElement getWebElement(String strElement) {

        switch (strElement) {
            case "username":
                return this.username;
            case "password":
                return this.password;
            case "login":
                return this.login;
            case "logo":
                return this.logo;
            case "calendar":
                return this.calendar;
            case "attendance":
                return this.attendance;
            case "assignments":
                return this.assignments;
            case "grading":
                return this.grading;
            case "hamburgerMenu":
                return this.hamburgerMenu;
            case "messages":
                return this.messages;
            case "messagesCloseButton":
                return this.messagesCloseButton;
            case "newMessages":
                return this.newMessages;
            case "newMessagesCloseButton":
                return this.newMessagesCloseButton;
            case "profile":
                return this.profile;
            case "messaging":
                return this.messaging;
            case "newMessage":
                return this.newMessage;
            case "inbox":
                return this.inbox;
            case "outbox":
                return this.outbox;
            case "trash":
                return this.trash;
            case "add":
                return this.add;
            case "teacher1":
                return this.teacher1;
            case "addAndExit":
                return this.addAndExit;
            case "subjectTextField":
                return this.subjectTextField;
            case "messageTextField":
                return this.messageTextField;
            case "attachFiles":
                return this.attachFiles;
            case "fromLocalButton":
                return this.fromLocalButton;
            case "sendButton":
                return this.sendButton;
            case "successMessage":
                return this.successMessage;
            default:
                System.out.println("Element not found");
                return null;
        }
    }
}

