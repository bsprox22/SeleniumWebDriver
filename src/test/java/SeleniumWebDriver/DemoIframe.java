package SeleniumWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoIframe {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
        driver.findElement(By.xpath("//div[@id='accept-choices']")).click();
        driver.manage().window().maximize();
        WebElement frame1 =  driver.findElement(By.id("iframeResult"));
        driver.switchTo().frame(frame1);
        driver.findElement(By.xpath("/html/body/button")).click();
        String alertText = driver.switchTo().alert().getText();
        System.out.println(alertText);
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        driver.switchTo().parentFrame();
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
