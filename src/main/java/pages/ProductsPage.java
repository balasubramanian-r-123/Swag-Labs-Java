package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import webBase.SwagLabsWebBase;

public class ProductsPage extends SwagLabsWebBase {
    WebElement productsTextLocator = driver.findElement(By.xpath("//*[text()='Products']"));

    public boolean isProductsPageVisible() {
        return productsTextLocator.isDisplayed();
    }

}
