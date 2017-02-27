package test190217.com.asos;

import Utils.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by VRINDA on 21/02/2017.
 */
public class Basepage extends BrowserFactory {

    Basepage()
    {
        PageFactory.initElements(driver,this);
    }
}
