package StepDefinitions.HamburgerMenu;
import Pages.DialogContent_US_E;
import Utilities.GWD;
import Utilities.ParentPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.awt.*;
import java.awt.event.KeyEvent;

public class US_010_Hamburger_Finance extends ParentPage {

    DialogContent_US_E dc = new DialogContent_US_E();

    @When("the user clicks the finance button and the my finance button")
    public void theUserClicksTheFinanceButtonAndTheMyFinanceButton() throws AWTException {

        Robot robot = new Robot();

        for (int i = 0; i < 6; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
        }
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_RIGHT);
        robot.keyRelease(KeyEvent.VK_RIGHT);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        dc.myClick(dc.studentName);
    }
    @And("the user selects the Stripe button and clicks the pay button")
    public void theUserSelectsTheStripeButtonAndClicksThePayButton() throws AWTException {

        Robot robot = new Robot();

        dc.myClick(dc.stripeButton);
        dc.myClick(dc.allPayment);
        dc.myClick(dc.payButton);
        dc.mySendKeys(dc.amountButton,"10");
        new Actions(GWD.getDriver()).doubleClick(dc.paymentButton).build().perform();
        dc.myClick(dc.paymentButton);
        wait(10);
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("[class='__PrivateStripeElement']>iframe")));
        GWD.getDriver().switchTo().frame(dc.iframe);
        wait(3);
        dc.mySendKeys(dc.cardNumberButton,"4242 4242 4242 4242");
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("[id='Field-expiryInput']")));
        dc.mySendKeys(dc.expirationButton,"04 32");
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("[id='Field-cvcInput']")));
        dc.mySendKeys(dc.cvcButton,"987");
        GWD.getDriver().switchTo().defaultContent();
        wait(1);
        dc.myJSClick(dc.stripePaymentsButton);
        dc.verifyContainsText(dc.paymentSuccessMessage,"Student Payment successfully created");
    }

    @And("the user clicks the Fee_Balance Detail button and sees the payment")
    public void theUserClicksTheFee_BalanceDetailButtonAndSeesThePayment() {

        dc.myClick(dc.feeBalanceDetail);
    }

    @And("the user sees all payments and balances or debts")
    public void theUserSeesAllPaymentsAndBalancesOrDebts() throws AWTException {

        dc.myClick(dc.messageButton);
        dc.myClick(dc.firstMessage);

    }

}
