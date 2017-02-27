package test190217.com;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import test190217.com.asos.BagPage;
import test190217.com.asos.HomePage;
import test190217.com.asos.ProductPage;
import test190217.com.asos.SearchPage;

/**
 * Created by VRINDA on 24/02/2017.
 */
public class MyStepdefs {


    HomePage hp = new HomePage();
    SearchPage sp = new SearchPage();
    ProductPage pp = new ProductPage();
    BagPage bp = new BagPage();

    @Given("^User is in home page$")
    public void userIsInHomePage() {

        String pageTitleText = hp.pageTitle();
        System.out.println("page title " + pageTitleText);
        Assert.assertEquals("ASOS | Shop the Latest Clothes and Fashion Online", pageTitleText);

    }

    @When("^User search for a product \"([^\"]*)\"$")
    public void userSearchForAProduct(String product) {

        hp.searchProduct(product);
    }


    @Then("^User should be nevigated to product \"([^\"]*)\" page$")
    public void userShouldBeNevigatedToProductPage(String product) {
        String searchProductText = sp.inSearchPage();
        Assert.assertEquals(product,searchProductText);
    }

    @When("^User selects the item$")
    public void userSelectsTheItem() {

        sp.selectproduct();


    }

    @Then("^\"([^\"]*)\" description page should be displyed$")
    public void descriptionPageShouldBeDisplyed(String product) {

        String ItemDescriptionText = pp.productDescription(product);
        System.out.println(ItemDescriptionText);
        System.out.println(product);
        Assert.assertTrue(ItemDescriptionText.contains(product));
    }

    @When("^User select \"([^\"]*)\"$")
    public void userSelect(String size) {

        pp.selectsize(size);

    }

    @And("^Adds the product to the cart$")
    public void addsTheProductToTheCart() {

        pp.addToBag();

    }

    @Then("^The product should be added to the cart$")
    public void theProductShouldBeAddedToTheCart() {

        pp.navigateToShoppingCart();


    }


    @And("^User navigates to bagpage$")
    public void userNavigatesToBagpage() {
       String myBag = bp.inmyBagPage();
        System.out.println(myBag);
        Assert.assertEquals("MY BAG", myBag);
    }
}

