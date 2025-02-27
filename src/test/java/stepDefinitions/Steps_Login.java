package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.LoginPage;

public class Steps_Login {
    LoginPage loginPage = new LoginPage();

    @Given("the user is in swag labs page")
    public void theUserIsInSwagLabsPage() {
        loginPage.isSwagLabsPageVisible();
    }

    @When("the user gives username {string} and password {string}")
    public void theUserGivesUsernameAndPassword(String username, String password) {
        loginPage.isTextFieldsVisible();
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }

    @And("the user clicks on Login button")
    public void theUserClicksOnLoginButton() {
        loginPage.clickLoginButton();
    }

    @When("the user gives {string} and {string}")
    public void theUserGivesAnd(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }
}
