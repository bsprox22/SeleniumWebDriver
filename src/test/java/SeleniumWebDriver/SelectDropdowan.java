package SeleniumWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdowan {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.sugarcrm.com/uk/request-demo/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]")).click();
        driver.findElement(By.name("email")).sendKeys("test@o2.pl");
        Thread.sleep(5000);
        driver.findElement(By.name("firstname")).sendKeys("Sebastian Test");
        WebElement ddown = driver.findElement(By.name("employees_c"));
        Select select = new Select(ddown);
        Thread.sleep(2000);
        select.selectByValue("level1");
        Thread.sleep(2000);
        select.selectByVisibleText("51 - 100 employees");
        Thread.sleep(2000);
        select.selectByIndex(5);
        driver.quit();
    }
}
