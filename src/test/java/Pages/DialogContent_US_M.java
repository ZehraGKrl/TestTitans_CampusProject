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

    @FindBy(css = "[placeholder='Kullanıcı Adı']")
    public WebElement username;

    @FindBy(css = "[formcontrolname='password']")
    public WebElement password;

    @FindBy(xpath = "//span[text()=' GİRİŞ YAP ']")
    public WebElement loginButton;

    @FindBy(css = "[class='mat-expansion-panel-header-description ng-star-inserted']")
    public WebElement invalidLoginMessage;

    @FindBy(xpath = "(//span[text()='Courses'])[1]")
    public WebElement courses;

    @FindBy(xpath = "//span[text()='Outbox']")
    public WebElement outboxButton;

    @FindBy(css = "body > app > student-layout > div > footer > user-messages-buttons > button-bar > div > div:nth-child(2) > ms-confirm-button > button > span.mdc-button__label > fa-icon")
    public WebElement trashButton;

    @FindBy(css = "#mat-mdc-checkbox-6-input")
    public WebElement checkBox;


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
            case "checkBox":
                return this.checkBox;

        }
        return null;
    }

}
