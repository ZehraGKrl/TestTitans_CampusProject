package StepDefinitions.Home;

import Pages.DialogContent_US_Z;
import Utilities.GWD;
import Utilities.ParentPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class US_2_Home extends ParentPage {
    DialogContent_US_Z dcz= new DialogContent_US_Z();


    @And("User should see the company logo at the left upper corner")
    public void userShouldSeeTheCompanyLogoAtTheLeftUpperCorner() {
        wait.until(ExpectedConditions.visibilityOf(dcz.companyLogo));
        Assert.assertTrue(dcz.companyLogo.isDisplayed());
    }

    @When("User should click the company logo at the left upper corner")
    public void userShouldClickTheCompanyLogoAtTheLeftUpperCorner() {
        dcz.myClick(dcz.companyLogo);
    }


    @Then("A new tab should open")
    public void aNewTabShouldOpen() {

        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        Set<String> tabs = GWD.getDriver().getWindowHandles();
        Iterator gosterge = tabs.iterator();
        String firstTabId = gosterge.next().toString();
        String secondTabId = gosterge.next().toString();
        GWD.getDriver().switchTo().window(secondTabId);
    }


    @Then("User should redirected to {string}")
    public void userShouldRedirectedTo(String expectedUrl) {
        ArrayList<String> tabs = new ArrayList<>(GWD.getDriver().getWindowHandles());
        GWD.getDriver().switchTo().window(tabs.get(1));
        wait.until(ExpectedConditions.urlToBe(expectedUrl));
        String actualUrl = GWD.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
        GWD.quitDriver();
    }


}
