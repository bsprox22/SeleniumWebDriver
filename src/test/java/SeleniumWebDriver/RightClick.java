package SeleniumWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://jqueryui.com/slider/#colorpicker");
        driver.manage().window().maximize();
        WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
        driver.switchTo().frame(frame);
        WebElement rectangle = driver.findElement(By.xpath("//*[@id=\"swatch\"]"));
        Actions action = new Actions(driver);
        action.contextClick(rectangle).perform();
    }
}
