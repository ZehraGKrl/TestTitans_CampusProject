package Pages;

import Utilities.GWD;
import Utilities.ParentPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent_US_O extends ParentPage {

    public DialogContent_US_O() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(xpath = "(//span[@class='mat-mdc-menu-item-text'])[2]")
    public WebElement financeButton;
    @FindBy(xpath = "//span[text()='My Finance']")
    public WebElement myFinanceButton;
    @FindBy(css = "[class='mat-mdc-menu-trigger mat-mdc-button-wrapper mdc-button mat-mdc-button mat-mdc-button-unchecked mat-unthemed mat-mdc-button-base']")
    public WebElement moreButton;
    @FindBy(xpath = "(//span[@class='mat-mdc-focus-indicator'])[18]")
    public WebElement viewButton;
    @FindBy(css = "(//div[@class='mdc-radio__background'])[1]")
    public WebElement stripeButton;


public WebElement getWebelement(String element){

    switch (element) {

        case "moreButton":
            return this.moreButton;
        case "financeButton":
            return this.financeButton;
        case "myFinanceButton":
            return this.myFinanceButton;
        case "viewButton":
            return this.viewButton;
        case "stripeButton":
            return this.stripeButton;

    }
    return null;
}



}
