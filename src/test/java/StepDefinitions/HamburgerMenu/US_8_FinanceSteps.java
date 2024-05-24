package StepDefinitions.HamburgerMenu;

import Pages.DialogContent_US_3;
import Pages.LeftNav_US_3;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US_8_FinanceSteps {

    DialogContent_US_3 dc=new DialogContent_US_3();

    LeftNav_US_3 ln=new LeftNav_US_3();

    @Given("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {
        ln.mySendKeys(ln.username, "Student_7");
        ln.mySendKeys(ln.password, "S12345");
        ln.myClick(ln.loginButton);
    }

    @When("Go to the payment screen by clicking on the finance section")
    public void GoToThePaymentScreenByClickingOnTheFinanceSection(DataTable financeButtons){
        List<String> financeButtonList = financeButtons.asList(String.class);

        for (int i = 0; i < financeButtonList.size(); i++) {
            WebElement webElement =ln.getWebelement(financeButtonList.get(i));
            ln.myClick(webElement);
        }

    }


}
