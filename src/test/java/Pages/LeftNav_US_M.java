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

    @FindBy(css = "[class='svg-inline--fa fa-bars fa-fw']")
    public WebElement hamburgerMenu;

    @FindBy(xpath = "//span[text()='Messaging']")
    public WebElement messaging;

    @FindBy(xpath = "(//fa-icon[@class='ng-fa-icon ng-star-inserted'])[6]/following-sibling::span")
    public WebElement financeButton;

    @FindBy(xpath = "(//*[@data-icon='chart-mixed'])[1]")
    public WebElement gradingButton;

    @FindBy(xpath = "((//div[@class='mat-ripple mat-mdc-tab-ripple'])[3]//following-sibling::span)[1]//span")
    public WebElement transcriptBySubject;

    @FindBy(xpath = "(//span[@class='mdc-tab__content'])[2]")
    public WebElement studentTranscript;

    public WebElement getWebElement(String strElement) {
        switch (strElement) {
            case "hamburgerMenu":
                return this.hamburgerMenu;
            case "gradingButton":
                return this.gradingButton;
        }

        return null;
    }
}
