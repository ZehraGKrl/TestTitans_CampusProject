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





}
