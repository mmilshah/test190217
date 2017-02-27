package test190217.com.asos;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by VRINDA on 25/02/2017.
 */
public class ProductPage extends Basepage {

    @FindBy(css = ".product-hero>h1")
    private WebElement ItemDescription;

    @FindBy(xpath = "//select[@data-id='sizeSelect']")
    private WebElement sizedropdown;

    @FindBy(className = "add-button")
    private WebElement addtobaglink;

    @FindBy(className = "bag-link-price")
    private WebElement shoppingcartlink;


    public String productDescription(String product) {
        return ItemDescription.getText();

    }

    public void selectsize(String size) {

        WebElement dropdown = sizedropdown;
        Select sizeDropDownValue = new Select(dropdown);
        sizeDropDownValue.selectByVisibleText(size);

    }

    public void addToBag() {

        addtobaglink.click();

    }

    public void navigateToShoppingCart() {

        shoppingcartlink.click();
    }
}
