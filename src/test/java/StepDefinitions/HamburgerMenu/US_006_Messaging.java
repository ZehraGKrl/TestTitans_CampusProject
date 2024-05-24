package StepDefinitions.HamburgerMenu;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

import java.util.List;

public class US_006_Messaging {
    @And("Click on the element Top Menu")
    public void clickOnTheElementTopMenu(DataTable text) {
        List<String> textList = text.asList(String.class);

    }
}
