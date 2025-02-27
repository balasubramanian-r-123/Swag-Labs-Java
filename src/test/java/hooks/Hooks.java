package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import webBase.SwagLabsWebBase;

public class Hooks {
    SwagLabsWebBase swagLabsWebBase = new SwagLabsWebBase();

    @Before
    public void setUp() {
        swagLabsWebBase.initializeBrowser();
        swagLabsWebBase.maximizeBrowser();
        swagLabsWebBase.implicitWait();
        swagLabsWebBase.navigateToURL("https://www.saucedemo.com/");
    }

    @After
    public void tearDown() {
        swagLabsWebBase.quitBrowser();
    }
}