package StepDefinitions.Home;

import Pages.DialogContent_US_3;

import Pages.LeftNav_US_3;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class US_3_HomeSteps {

    LeftNav_US_3 ln=new LeftNav_US_3();


    @Given("Navigate to Campus")
    public void navigateToCampus() {
        GWD.getDriver().get("https://test.mersys.io/");
    }

    @When("Enter username {string} and password {string} and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton(String username, String password) {
        ln.mySendKeys(ln.username, username);
        ln.mySendKeys(ln.password, password);
        ln.myClick(ln.loginButton);
    }

    @Given("Click on all buttons in the tab menu")
    public void clickOnAllButtonsInTheTabMenu(DataTable tabMenuButtons) throws InterruptedException {
        List<String> tabMenuButtonList=tabMenuButtons.asList(String.class);

        for (int i = 0; i < tabMenuButtonList.size(); i++) {
            WebElement webElement = ln.getWebelement(tabMenuButtonList.get(i));
            ln.myClick(webElement);
            new Actions(GWD.getDriver()).sendKeys(Keys.ESCAPE).build().perform();
            Thread.sleep(3000);

        }

        GWD.quitDriver();

    }


}
