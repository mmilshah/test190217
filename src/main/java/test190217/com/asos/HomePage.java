package test190217.com.asos;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by VRINDA on 22/02/2017.
 */
public class HomePage extends BagPage {


    @FindBy(id = "txtSearch")
    private WebElement searchBox;

    @FindBy(xpath = "//a[@class='go']/span")
    private WebElement searchButton;


    public String pageTitle() {
        return driver.getTitle();

    }

    public void searchProduct(String product) {

        searchBox.sendKeys(product);
        searchButton.click();
    }
}



