package StepDefinitions.HamburgerMenu;

import Pages.DialogContent_US_M;
import io.cucumber.java.en.And;

public class US_009_HamburgerFinanceSteps {

    DialogContent_US_M dcm=new DialogContent_US_M();

    @And("User should see the installment table")
    public void userShouldSeeTheInstallmentTable() {
        dcm.verifyContainsText(dcm.dateText,"Date");
        dcm.verifyContainsText(dcm.debitText,"Debit");

    }
}

