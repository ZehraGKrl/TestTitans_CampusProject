package StepDefinitions.HamburgerMenu;

import Pages.DialogContent_US_3;
import Pages.LeftNav_US_3;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class US_8_FinanceSteps {

    DialogContent_US_3 dc=new DialogContent_US_3();

    LeftNav_US_3 ln=new LeftNav_US_3();

    @Given("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {
        ln.mySendKeys(ln.username, "Student_7");
        ln.mySendKeys(ln.password, "S12345");
        ln.myClick(ln.loginButton);
    }

    @When("Make payment by clicking on the finance section")
    public void makePaymentByClickingOnTheFinanceSection() {



    }


}
