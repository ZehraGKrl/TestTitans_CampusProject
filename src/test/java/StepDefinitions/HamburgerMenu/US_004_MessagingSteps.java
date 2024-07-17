package StepDefinitions.HamburgerMenu;

import Pages.DialogContent_US_M;
import Pages.LeftNav_US_M;
import Utilities.GWD;
import Utilities.ParentPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class US_004_MessagingSteps extends ParentPage {

    DialogContent_US_M dcm = new DialogContent_US_M();
    LeftNav_US_M lfm=new LeftNav_US_M();
    List<String> list1 = new ArrayList<>();

    @Then("User should be able to see related buttons")
    public void userShouldBeAbleToSeeRelatedButtons() {
        list1.add(dcm.messageButton.getText());
        list1.add(dcm.inboxButton.getText());
        list1.add(dcm.outboxButton.getText());
        list1.add(dcm.trashButton1.getText());

        System.out.println("list1 = " + list1);

        for (int i = 0; i < 1; i++) {
            Assert.assertEquals(list1.get(0), "New Message");
            Assert.assertEquals(list1.get(1), "Inbox");
            Assert.assertEquals(list1.get(2), "Outbox");
            Assert.assertEquals(list1.get(3), "Trash");

        }
    }

    @Then("Click on the element in Hamburger Menu")
    public void clickOnTheElementInHamburgerMenu(DataTable button) {

        List<String> buttonList = button.asList(String.class);

        for (int i = 0; i < buttonList.size(); i++) {
            WebElement buttonWebElement = dcm.getWebElement(buttonList.get(i));
            dcm.myClick(buttonWebElement);
        }
    }
}
