package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav_US_3 {

    public LeftNav_US_3() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(css = "[id='mat-input-2']")
    public WebElement username;
    @FindBy(id = "mat-input-3")
    public WebElement password;
    @FindBy(css = "[class='mdc-button__label']")
    public WebElement loginButton;


    public WebElement getWebelement(String element){

        switch (element){

            case "username":
                return this.username;
            case "password":
                return this.password;
            case "loginButton":
                return this.loginButton;

        }
        return null;
    }



}
