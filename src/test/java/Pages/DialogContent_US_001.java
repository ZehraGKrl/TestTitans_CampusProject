package Pages;

import Utilities.GWD;
import Utilities.ParentPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent_US_001 extends ParentPage {
    public DialogContent_US_001() {PageFactory.initElements(GWD.getDriver(),this);}

    @FindBy(xpath = "(//div[@class='mdc-notched-outline__notch'])[1]")
    public WebElement username;

    @FindBy(css = "[class='mdc-notched-outline ng-tns-c1534922977-50 mdc-notched-outline--upgraded ng-star-inserted']")
    public WebElement password;

}
