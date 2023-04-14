package SeleniumWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class JavaScriptExecutor {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
        driver.findElement(By.xpath("//*[@id=\"accept-choices\"]")).click();

        JavascriptExecutor jsexec = (JavascriptExecutor) driver;

        //Print the title of the page
        String script = "return document.title;";
        String title = (String) jsexec.executeScript(script);
        System.out.println(title);

        //Click button
        driver.switchTo().frame("iframeResult");
        jsexec.executeScript("myFunction()");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.switchTo().alert().accept();

        //highlight button
        WebElement button = driver.findElement(By.xpath("/html/body/button"));
        jsexec.executeScript("arguments[0].style.border='5px solid green'", button);

        //Scroll
        driver.navigate().to("https://www.w3schools.com/");
        WebElement certeficatebutton = driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/p[1]/a"));
        jsexec.executeScript("arguments[0].scrollIntoView(true);", certeficatebutton);

        driver.quit();
    }
}
