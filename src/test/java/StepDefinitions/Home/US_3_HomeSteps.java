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

    DialogContent_US_3 dc=new DialogContent_US_3();

    @Given("Navigate to Campus")
    public void navigateToCampus() {
        GWD.getDriver().get("https://test.mersys.io/");
    }

    @When("Enter username {string} and password {string} and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton(String username, String password) {
        dc.mySendKeys(dc.username, username);
        dc.mySendKeys(dc.password, password);
        dc.myClick(dc.loginButton);
    }

    @Given("Click on all buttons in the tab menu")
    public void clickOnAllButtonsInTheTabMenu(DataTable tabMenuButtons) {
        List<String> tabMenuButtonList=tabMenuButtons.asList(String.class);

        for (int i = 0; i < tabMenuButtonList.size(); i++) {
            WebElement webElement = dc.getWebelement(tabMenuButtonList.get(i));
            dc.myClick(webElement);
            new Actions(GWD.getDriver()).sendKeys(Keys.ESCAPE).build().perform();

        }

    }


}
