package StepDefinitions.HamburgerMenu;

import Pages.DialogContent_US_Z;
import Utilities.GWD;
import Utilities.ParentPage;
import io.cucumber.java.en.And;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class US_12_Hamburger_Finance extends ParentPage {
    DialogContent_US_Z dcz = new DialogContent_US_Z();

    @And("Hover over the finance and click on the my finance")
    public void hoverOverTheFinanceAndClickOnTheMyFinance() {

        new Actions(GWD.getDriver()).moveToElement(dcz.finance).build().perform();
        wait.until(ExpectedConditions.visibilityOf(dcz.myFinance));
        dcz.myJSClick(dcz.myFinance);

    }


    @And("Click on the pull down menu button and click the excel export")
    public void clickOnThePullDownMenuButtonAndClickTheExcelExport() {
        wait.until(ExpectedConditions.urlContains("finance"));
        dcz.myJSClick(dcz.pulldownMenu);
        dcz.myClick(dcz.excelExport);

    }


    @And("Click on the pull down menu button and click the pdf export")
    public void clickOnThePullDownMenuButtonAndClickThePdfExport() {
        dcz.myJSClick(dcz.pulldownMenu);
        wait.until(ExpectedConditions.elementToBeClickable(dcz.pdfExport));
        dcz.myClick(dcz.pdfExport);
    }
}
