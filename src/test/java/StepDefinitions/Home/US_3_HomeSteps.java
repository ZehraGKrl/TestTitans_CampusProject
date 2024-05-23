package StepDefinitions.Home;

import Utilities.GWD;
import io.cucumber.java.en.Given;

public class US_3_HomeSteps {
    @Given("Navigate to Campus")
    public void navigateToCampus() {
        GWD.getDriver().get("https://test.mersys.io/");
    }

    @Given("Click on all buttons in the tab menu")
    public void clickOnAllButtonsInTheTabMenu() {


    }
}
