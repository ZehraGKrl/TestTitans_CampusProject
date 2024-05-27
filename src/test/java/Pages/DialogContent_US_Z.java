package Pages;

import Utilities.GWD;
import Utilities.ParentPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent_US_Z extends ParentPage {

    public DialogContent_US_Z() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//input[@formcontrolname='username'")
    public WebElement username;

    @FindBy(xpath = "//input[@formcontrolname='password']")
    public WebElement password;

    @FindBy(css = "[class='mdc-button__label']")
    public WebElement login;

    @FindBy(xpath = "//div[@class='ng-star-inserted']/img")
    public WebElement companyLogo;



    public WebElement getWebElement(String strElement) {
        switch (strElement) {
            case "username":
                return this.username;
            case "password":
                return this.password;
            case "login":
                return this.login;

        }
        return null;
    }


}
