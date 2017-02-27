package test190217.com.asos;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.security.SecureRandom;

/**
 * Created by VRINDA on 22/02/2017.
 */
public class BagPage extends Basepage {


    @FindBy(xpath = "//div[@class = 'bag-title-holder']/h2")
    private WebElement myBagText;

    public String inmyBagPage() {

        return myBagText.getText();



    }
}
