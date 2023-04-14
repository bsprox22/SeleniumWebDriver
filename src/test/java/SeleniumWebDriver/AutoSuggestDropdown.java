package SeleniumWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestDropdown {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.easyjet.com/pl");;
        Thread.sleep(2000);
        driver.findElement(By.id("ensCloseBanner")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("origin")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("origin")).sendKeys("Sydney");
        Thread.sleep(2000);
        driver.findElement(By.name("origin")).sendKeys(Keys.ENTER);
        driver.quit();
    }
}
