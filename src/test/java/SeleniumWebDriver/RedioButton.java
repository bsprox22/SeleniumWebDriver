package SeleniumWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class RedioButton {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.singaporeair.com/en_UK/pl/home#/book/bookflight");
        driver.manage().window().maximize();

        WebElement radio2 = driver.findElement(By.id("redeemFlights"));
        WebElement radio1 = driver.findElement(By.id("bookFlights"));
        radio2.click();

        System.out.println(radio1.isSelected());
        System.out.println(radio2.isSelected());

        System.out.println (driver.findElements(By.xpath("//*[@name='book-flight-radio']")).size());
    }
}
