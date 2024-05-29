package Pages;

import Utilities.GWD;
import Utilities.ParentPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent_US_E extends ParentPage {

    public DialogContent_US_E() {
        PageFactory.initElements(GWD.getDriver(), this);
    }
    @FindBy(xpath = "//span[contains(@class, 'username') and contains(@class, 'mr-12')]")
    public WebElement profileButton;

    @FindBy(xpath = "//span[text()='Settings']")
    public WebElement settingsButton;

    @FindBy(xpath = "//span[text()='Default Theme']")
    public WebElement defaultTheme;

    @FindBy(xpath = "//mat-option[.//span[text()=' Purple Theme ']]")
    public WebElement purpleTheme;

    @FindBy(xpath = "//span[text()='Save' and @style='visibility: visible;']")
    public WebElement saveButton;

    @FindBy(xpath = "//div[text()='Profile successfully updated']")
    public WebElement successMessage;

    public WebElement getWebElement(String strElement) {
        switch (strElement) {
            case "profileButton":
                return this.profileButton;
            case "settingsButton":
                return this.settingsButton;
            case "purpleTheme":
                return this.purpleTheme;
            case "defaultTheme":
                return this.defaultTheme;
            case "saveButton":
                return this.saveButton;
            case "isSuccessMessageDisplayed":
                return this.successMessage;

        }
        return null;
    }
}
