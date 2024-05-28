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
    @FindBy(xpath = "//*[text()='Trash']")
    public WebElement trashButton;
    @FindBy(xpath = "//ms-delete-button//button")
    public WebElement trashIcon;
    @FindBy(xpath = "//ms-standard-button[@icon='trash-restore']")
    public WebElement restoreIcon;
    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    public WebElement successMessage;
    @FindBy(xpath = "//*[text()=' Delete ']")
    public WebElement delete;
    @FindBy(xpath = "//span[text()='Finance']")
    public WebElement finance;
    @FindBy(xpath = "//span[text()='My Finance']")
    public WebElement myFinance;
    @FindBy(xpath = "(//button[contains(@class, 'mat-mdc-menu-trigger')])[7]")
    public WebElement pulldownMenu;
    @FindBy(xpath = "//span[text()=' Excel Export ']")
    public WebElement excelExport;




}
