package test190217.com;

import Utils.AutomationConstant;
import Utils.BrowserFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before
    public static void setUp() {
        System.out.println("calling browser factory");
        BrowserFactory.openBrowser();

    }

    @After
    public static void tearDown() {
        BrowserFactory.closeBrowser();

    }
}
