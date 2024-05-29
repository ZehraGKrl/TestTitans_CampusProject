package StepDefinitions.HamburgerMenu;

import Pages.DialogContent_US_M;
import Pages.LeftNav_US_M;
import Utilities.GWD;
import Utilities.ParentPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class US_011_FinanceSteps extends ParentPage {
    LeftNav_US_M lfm = new LeftNav_US_M();

    DialogContent_US_M dcm = new DialogContent_US_M();

    @Then("Hover Over the Finance button")
    public void hoverOverTheFinanceButton() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Actions actionDriver = new Actions(GWD.getDriver());
        actionDriver.moveToElement(lfm.financeButton).build().perform();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    @And("Click the Stripe button to choose the payment method")
    public void clickTheStripeButtonToChooseThePaymentMethod() {
        wait.until(ExpectedConditions.visibilityOf(dcm.stripeButton));
        dcm.myJSClick(dcm.stripeButton);
    }

    @And("Enter the amount to be paid")
    public void enterTheAmountToBePaid() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ms-currency-field[@formcontrolname='customAmountField']")));
        dcm.mySendKeys(dcm.InputAmount, "235");
    }

    @And("Click the Pay button")
    public void clickThePayButton() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ms-button")));
        dcm.myClick(dcm.PayButton1);
        dcm.myClick(dcm.PayButton1);
    }

    @And("User must enter card details")
    public void userMustEnterCardDetails() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[class='__PrivateStripeElement']>iframe")));
        WebElement frame=GWD.getDriver().findElement(By.cssSelector("[class='__PrivateStripeElement']>iframe"));
        GWD.getDriver().switchTo().frame(frame);

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[name='number']")));
        dcm.mySendKeys(dcm.cardNumber, "4242 4242 4242 4242");

        dcm.mySendKeys(dcm.expirationNumber, "1225");
        dcm.mySendKeys(dcm.cvcNumber,"0707");
    }
}
