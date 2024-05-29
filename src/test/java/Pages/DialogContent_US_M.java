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

    @FindBy(xpath = "(//div[@class='mat-mdc-radio-touch-target'])[1]/following-sibling::input")
    public WebElement stripeButton;


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

        }
        return null;
    }
}
