package StepDefinitions.HamburgerMenu;

import Pages.DialogContent_US_Z;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;

public class US_7_HamburgerMessaging {
    DialogContent_US_Z dcz=new DialogContent_US_Z();


    @And("Click on the trash button in hamburger menu {string}")
    public void clickOnTheTrashButtonInHamburgerMenu(String button) {

        dcz.myJSClick(dcz.trashButton);
    }

}
