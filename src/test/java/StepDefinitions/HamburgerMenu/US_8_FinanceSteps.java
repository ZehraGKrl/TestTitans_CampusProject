package StepDefinitions.HamburgerMenu;

import Pages.DialogContent_US_O;
import Pages.LeftNav_US_O;
import Utilities.GWD;
import Utilities.ParentPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class US_8_FinanceSteps extends ParentPage {

    DialogContent_US_O dc=new DialogContent_US_O();
    LeftNav_US_O ln=new LeftNav_US_O();



    @Given("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {
        ln.mySendKeys(ln.username, "Student_7");
        ln.mySendKeys(ln.password, "S12345");
        ln.myClick(ln.loginButton);
    }

    @When("Go to the payment screen by clicking on the finance section")
    public void GoToThePaymentScreenByClickingOnTheFinanceSection(DataTable financeButtons) throws InterruptedException {
        List<String> financeButtonList = financeButtons.asList(String.class);

        for (int i = 0; i < financeButtonList.size(); i++) {
            WebElement webElement =dc.getWebelement(financeButtonList.get(i));
            dc.myClick(webElement);

        }

    }
    @Then("Make payment in My finance section")
    public void makePaymentInMyFinanceSection(DataTable paymentButtons){
        List<String> paymentButtonList = paymentButtons.asList(String.class);

        for (int i = 0; i < paymentButtonList.size(); i++) {
            WebElement webElement = dc.getWebelement(paymentButtonList.get(i));
            dc.myClick(webElement);

        }
        GWD.quitDriver();
    }


}
