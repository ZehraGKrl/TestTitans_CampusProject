package StepDefinitions.Login;

import Pages.DialogContent_US_001;
import Pages.LeftNav_US_001;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US_001_LoginSteps {

    DialogContent_US_001 dcm = new DialogContent_US_001();
    LeftNav_US_001 lfm = new LeftNav_US_001();

    @When("User sending the keys in Dialog")
    public void userSendingTheKeysInDialog(DataTable text) {
        List<List<String>> listText = text.asLists(String.class);

        for (int i = 0; i < listText.size(); i++) {
            WebElement txtWebElement = dcm.getWebElement(listText.get(i).get(0));
            dcm.mySendKeys(txtWebElement, listText.get(i).get(1));
        }
    }
}
