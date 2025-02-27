package stepDefinitions;

import io.cucumber.java.en.Then;
import pages.ProductsPage;

public class Steps_Products {
    ProductsPage productsPage = new ProductsPage();

    @Then("the products page should be displayed")
    public void theProductsPageShouldBeDisplayed() {
        productsPage.isProductsPageVisible();
    }
}
