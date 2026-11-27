package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class DuckDuckGoSearchTest {

    @Test
    public void firstResultShouldBeSeleniumWebDriverDocs() {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://duckduckgo.com/");
        driver.findElement(By.name("q")).sendKeys("Selenium WebDriver" + Keys.ENTER);
        String firstResultLink = driver.findElement(By.cssSelector("a[data-testid='result-title-a']")).getAttribute("href");
        Assert.assertEquals(firstResultLink, "https://www.selenium.dev/documentation/webdriver/");
        driver.quit();
    }
}
