package SeleniumWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ColorPicker {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/slider/#colorpicker");
        driver.manage().window().maximize();

        WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
        driver.switchTo().frame(frame);

        WebElement greenslider = driver.findElement(By.xpath("//*[@id=\"green\"]/span"));

        Actions action = new Actions(driver);
        action.dragAndDropBy(greenslider, -100, 125).perform();
    }
}
