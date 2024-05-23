package StepDefinitions;

import Utilities.GWD;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before // Cucumber için Annotation
    public void before() {
    }

    @After // Cucumber After Annotation'u her senaryodan sonra çalışır.
    public void after(Scenario senaryo) {


        if (senaryo.isFailed()) {

            TakesScreenshot ts = (TakesScreenshot) GWD.getDriver();
            byte[] memory = ts.getScreenshotAs(OutputType.BYTES);

            senaryo.attach(memory, "image/png", "screenshot name");
        }

        GWD.quitDriver();

    }
}
