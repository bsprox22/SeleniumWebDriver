package SeleniumWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class CapturingScreenshot {
    public static void main(String[] args) throws InterruptedException, IOException {

        Date currentdate = new Date();
        String screenshotfilename = currentdate.toString().replace(" ", "-").replace(":", "-");
        System.out.println(screenshotfilename);

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"gdpr-banner-accept\"]")).click();
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile, new File(".//screenshot//"+screenshotfilename+".png"));
    }
}
