package command_providers;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class BrowserActions {
    public WebDriver driver;

    public BrowserActions(WebDriver driver){
        this.driver = driver;
    }

    public BrowserActions openBrowser(String url) {
        driver.manage().deleteAllCookies();
        driver.get("chrome://settings/clearBrowserData");
        driver.findElement(By.xpath("//settings-ui")).sendKeys(Keys.ENTER);
        driver.get(url);
        driver.manage().window().maximize();
        return this;
    }
    public BrowserActions clickBrowserTab(int pageIndex){
        ArrayList<String> tab = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tab.get(pageIndex));
        return this;
    }

    public BrowserActions validateTitle(String expectedTitle) {
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        return this;
    }

    public BrowserActions closeBrowser() {
        driver.quit();
        return this;
    }
}
