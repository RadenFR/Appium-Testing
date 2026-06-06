package tests;

import core.BaseTest;
import core.DriverManager;
import pages.XPage;
import org.testng.annotations.Test;

public class XTest extends BaseTest {
    @Test
    public void xTestMenu() {
        XPage xPage = new XPage(DriverManager.getDriver());

        xPage.clickViewMenu();
    }
}