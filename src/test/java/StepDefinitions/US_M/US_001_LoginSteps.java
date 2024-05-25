package StepDefinitions.US_M;

import Pages.DialogContent_US_M;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;

    public class US_001_LoginSteps {

        DialogContent_US_M dcm = new DialogContent_US_M();

        @When("User sending the keys in Dialog")
        public void userSendingTheKeysInDialog(DataTable text) {
            List<List<String>> listText = text.asLists(String.class);

            for (int i = 0; i < listText.size(); i++) {
                WebElement txtWebElement = dcm.getWebElement(listText.get(i).get(0));
                dcm.mySendKeys(txtWebElement, listText.get(i).get(1));
            }
        }

        @Then("Click on the element in Dialog")
        public void clickOnTheElementInDialog(DataTable button) {
            List<String> buttonList = button.asList(String.class);

            for (int i = 0; i < buttonList.size(); i++) {
                WebElement buttonWebElement = dcm.getWebElement(buttonList.get(i));
                dcm.myClick(buttonWebElement);
            }
        }

        @And("Main page should be displayed")
        public void mainPageShouldBeDisplayed() {
            dcm.verifyContainsText(dcm.courses, "Courses");

            GWD.quitDriver();
        }
    }


