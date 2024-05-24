package Pages;

import Utilities.GWD;
import Utilities.ParentPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav_US_006 extends ParentPage {
    public LeftNav_US_006() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "(//span[@class='mat-mdc-focus-indicator'])[6]")
    public WebElement hamburgerMenu;

    @FindBy(xpath = "//span[text()='Messaging']")
    public WebElement messaging;

    public WebElement getWebElement(String strElement) {
        switch (strElement) {
            case "hamburgerMenu":
                return this.hamburgerMenu;
        }


        return null;
    }
}
