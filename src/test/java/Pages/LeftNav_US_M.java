package Pages;

import Utilities.GWD;
import Utilities.ParentPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav_US_M extends ParentPage {
    public LeftNav_US_M() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css = "[class='mat-mdc-menu-trigger mat-mdc-button-wrapper mdc-button mat-mdc-button mat-mdc-button-unchecked mat-unthemed mat-mdc-button-base']")
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
