package Pages;

import Utilities.GWD;
import Utilities.ParentPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent_US_001 extends ParentPage {
    public DialogContent_US_001() {
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

    public WebElement getWebElement(String strElement) {
        switch (strElement) {
            case "usernameInput":
                return this.username;
            case "passwordInput":
                return this.password;
            case "loginButton":
                return  this.loginButton;

        }
        return null;
    }

}
