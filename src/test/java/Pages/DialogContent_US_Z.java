package Pages;

import Utilities.GWD;
import Utilities.ParentPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent_US_Z extends ParentPage {

    WebDriver driver;

    public DialogContent_US_Z() {
        this.driver = GWD.getDriver();
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='ng-star-inserted']/img")
    public WebElement companyLogo;
    @FindBy(xpath = "//*[text()='Messaging']")
    public WebElement msgButton;
    @FindBy(xpath = "//*[text()='Trash']")
    public WebElement trashButton;
    @FindBy(xpath = "(//span[@class='mat-mdc-focus-indicator'])[21]")
    public WebElement trashIcon;
    @FindBy(xpath = "(//span[@class='mat-mdc-focus-indicator'])[20]")
    public WebElement restoreIcon;

    public WebElement getWebElement(String strElement) {
        switch (strElement) {
            case "msgButton":
                return this.msgButton;
            case "trashButton":
                return this.trashButton;
        }

        return null;
    }


}
