package Utils;

import cucumber.api.java.After;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by VRINDA on 22/02/2017.
 */
public class BrowserFactory {

    public static WebDriver driver;

    public static void openBrowser(){
        System.out.println("local firefox started");
        ChromeDriverManager.getInstance().setup();
        driver = new ChromeDriver();
        driver.get(AutomationConstant.URL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }


    public static void closeBrowser(){
//        driver.quit();
    }
}
