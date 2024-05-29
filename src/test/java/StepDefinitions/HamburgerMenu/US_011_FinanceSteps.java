package StepDefinitions.HamburgerMenu;

import Pages.DialogContent_US_M;
import Pages.LeftNav_US_M;
import Utilities.GWD;
import Utilities.ParentPage;
import io.cucumber.java.en.Then;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class US_011_FinanceSteps extends ParentPage {
    LeftNav_US_M lfm = new LeftNav_US_M();

    DialogContent_US_M dcm = new DialogContent_US_M();

    @Then("Hover Over the Finance button")
    public void hoverOverTheFinanceButton() {
        wait.until(ExpectedConditions.visibilityOf(lfm.financeButton));

        Actions actionDriver = new Actions(GWD.getDriver());
        actionDriver.moveToElement(lfm.financeButton).build().perform();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
