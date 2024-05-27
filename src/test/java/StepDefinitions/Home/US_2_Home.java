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

public class US_2_Home extends ParentPage {
    DialogContent_US_Z dcz= new DialogContent_US_Z();
    WebDriver driver;

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
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        Assert.assertEquals(2, tabs.size());
    }


    @Then("User should redirected to {string}")
    public void userShouldRedirectedTo(String expectedUrl) {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);

    }
}
