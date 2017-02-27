package test190217.com.asos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by VRINDA on 22/02/2017.
 */
public class SearchPage extends Basepage {

    @FindAll({@FindBy(className = "product-img")})
    private List<WebElement> resultElements;

    @FindBy(css = ".search-term")
    private WebElement searchProduct;

    public String inSearchPage() {

        return searchProduct.getText();

    }

    public void selectproduct() {

//    List<WebElement> productList = driver.findElements(By.className("product-img"));
//        WebElement productCountSize = productList.get(productList.size()-1);
//        WebElement selectedProduct = productList.get(4);
//        selectedProduct.click();
//        productCountSize.click();
//        System.out.println(productList.size());
//        The above way also works but it is not through page factory. this is driver.findby way.

        WebElement productCountSize = resultElements.get(3);
        productCountSize.click();

    }
}
