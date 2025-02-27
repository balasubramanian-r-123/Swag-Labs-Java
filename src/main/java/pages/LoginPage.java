package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import webBase.SwagLabsWebBase;

public class LoginPage extends SwagLabsWebBase {
    WebElement swagLabsTextLocator = driver.findElement(By.xpath("//*[text()='Swag Labs']"));
    WebElement usernameTextFieldLocator = driver.findElement(By.id("user-name"));
    WebElement passwordTextFieldLocator = driver.findElement(By.id("password"));
    WebElement loginButtonLocator = driver.findElement(By.id("login-button"));

    public boolean isSwagLabsPageVisible() {
        return swagLabsTextLocator.isDisplayed();
    }

    public boolean isTextFieldsVisible() {
        return usernameTextFieldLocator.isDisplayed() && passwordTextFieldLocator.isDisplayed();
    }

    public void enterUsername(String username) {
        usernameTextFieldLocator.sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordTextFieldLocator.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButtonLocator.click();
    }
}
