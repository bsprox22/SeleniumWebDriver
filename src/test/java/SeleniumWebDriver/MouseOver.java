package SeleniumWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class MouseOver {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com.au/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"gdpr-banner-accept\"]")).click();
        WebElement element = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));

        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
    }
}
