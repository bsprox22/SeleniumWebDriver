package SeleniumWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class PrintAllLinks {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.sugarcrm.com/au/request-demo/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]")).click();
        driver.findElement(By.name("email")).sendKeys("test@o2.pl");
        Thread.sleep(5000);
        driver.findElement(By.name("firstname")).sendKeys("Sebastian Test");
        List<WebElement> alltags = driver.findElements(By.tagName("a"));
        System.out.println("Total tags are: "+alltags.size());

        for(int i=0; i<alltags.size(); i++);
        {
            System.out.println("Links on page are "+alltags.get('i').getAttribute("href"));
            System.out.println("Links on page are "+alltags.get('i').getText());
        }
        driver.quit();
    }
}
