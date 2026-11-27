package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DuckDuckGoLogoTest {

    @Test
    public void duckDuckGoLogoShouldBeDisplayed() {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://duckduckgo.com/");
        Assert.assertTrue(driver.findElement(By.cssSelector("a[aria-label='Learn about DuckDuckGo']")).isDisplayed());
        driver.quit();
    }
}
