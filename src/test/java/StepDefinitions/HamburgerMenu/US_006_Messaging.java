package StepDefinitions.HamburgerMenu;

import Pages.LeftNav_US_006;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class US_006_Messaging {
    LeftNav_US_006 lfm = new LeftNav_US_006();

    @And("Click on the element Top Menu")
    public void clickOnTheElementTopMenu(DataTable button) {
        List<String> textList = button.asList(String.class);

        for (int i = 0; i < textList.size(); i++) {
            WebElement buttonWebElement = lfm.getWebElement(textList.get(i));
            lfm.myClick(buttonWebElement);
        }
    }

    @And("Hover Over the messaging button")
    public void hoverOverTheMessagingButton() {
        Actions ActionDriver=new Actions(GWD.getDriver());

        ActionDriver.moveToElement(lfm.messaging).build().perform();
    }
}
