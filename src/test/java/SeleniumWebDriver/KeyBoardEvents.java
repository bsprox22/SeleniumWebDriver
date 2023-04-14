package SeleniumWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class KeyBoardEvents {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://extendsclass.com/text-compare");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div[2]/div[2]/button[1]/p")).click();
        WebElement sourcetextarea = driver.findElement(By.xpath("//*[@id=\"dropZone\"]//div[5]/pre/span"));
        Actions action = new Actions(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        action.keyDown(sourcetextarea, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
        WebElement destinationtextarea = driver.findElement(By.xpath("//*[@id=\"dropZone2\"]//div[5]/div[3]/pre/span"));
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        action.keyDown(destinationtextarea, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
        driver.quit();
    }
}
