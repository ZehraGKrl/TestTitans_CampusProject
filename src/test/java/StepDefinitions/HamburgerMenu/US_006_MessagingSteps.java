package StepDefinitions.HamburgerMenu;

import Pages.DialogContent_US_M;
import Pages.LeftNav_US_M;
import Utilities.GWD;
import Utilities.ParentPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class US_006_MessagingSteps extends ParentPage {

    LeftNav_US_M lfm = new LeftNav_US_M();
    DialogContent_US_M dcm = new DialogContent_US_M();

    @And("Hover Over the messaging button")
    public void hoverOverTheMessagingButton() {
        wait.until(ExpectedConditions.visibilityOf(lfm.messaging));
        Actions ActionDriver = new Actions(GWD.getDriver());

        ActionDriver.moveToElement(lfm.messaging).build().perform();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    @And("Click on the trash button")
    public void clickOnTheTrashButton() {
        dcm.myClick(dcm.trashButton);
    }

    @And("Click on the element Top Menu")
    public void clickOnTheElementTopMenu(DataTable button) {
        wait.until(ExpectedConditions.elementToBeClickable(lfm.hamburgerMenu));

        List<String> textList = button.asList(String.class);

        for (int i = 0; i < textList.size(); i++) {
            WebElement buttonWebElement = lfm.getWebElement(textList.get(i));
            lfm.myClick(buttonWebElement);
        }
    }

    @And("Confirm message should be displayed")
    public void confirmMessageShouldBeDisplayed() {
        wait.until(ExpectedConditions.visibilityOf(dcm.confirmMessage));
        dcm.verifyContainsText(dcm.confirmMessage, "Message successfully moved to trash!");

        GWD.quitDriver();
    }
}


