package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DuckDuckGoTitleTest {

    @Test
    public void pageTitleShouldBeGoogle() {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://duckduckgo.com/");
        Assert.assertEquals(driver.getTitle(), "Google");
        driver.quit();
    }
}
