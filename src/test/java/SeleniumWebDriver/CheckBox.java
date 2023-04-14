package SeleniumWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.sugarcrm.com/uk/request-demo/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]")).click();
        driver.findElement(By.name("email")).sendKeys("test@o2.pl");
        Thread.sleep(2000);
        driver.findElement(By.id("doi0")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("doi0")).click();

        System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());

        driver.quit();
    }
}
