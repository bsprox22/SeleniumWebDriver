package SeleniumWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class HandlingWindows {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.salesforce.com/au/");
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
        driver.findElement(By.xpath("//*[@id=\"main\"]/div[4]/div/div/div/div[2]/div[1]/div[1]/div[3]/div/div[1]/div/a/span")).click();
        Set<String> windowhandles = driver.getWindowHandles();
        System.out.println(windowhandles);

        Iterator<String> iterator = windowhandles.iterator();
        String parentwindow = iterator.next();
        System.out.println(parentwindow);
        String childwindow = iterator.next();
        System.out.println(childwindow);

        driver.switchTo().window(childwindow);

        driver.findElement(By.name("UserFirstName")).sendKeys("Seba");
        driver.findElement(By.name("UserLastName")).sendKeys("Kowalski");
        driver.switchTo().window(parentwindow);
    }
}
