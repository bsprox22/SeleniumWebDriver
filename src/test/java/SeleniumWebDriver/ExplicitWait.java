
package SeleniumWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ExplicitWait {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"gdpr-banner-accept\"]")).click();
       // driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        WebElement element = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[4]/a"));
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[4]/div[2]/div[1]/nav[1]/ul/li[7]/a"))).click();
    }
}
