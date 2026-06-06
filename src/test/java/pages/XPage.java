package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class XPage extends BasePage {
    public XPage(AndroidDriver driver) {
        super(driver);
    }

    @AndroidFindBy(accessibility = "View menu")
    private WebElement viewMenu;

    public void clickViewMenu() {
        viewMenu.click();
    }
}