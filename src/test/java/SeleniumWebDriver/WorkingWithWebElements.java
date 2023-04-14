package SeleniumWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithWebElements {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.pl/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2"
                + "Fidentifier_select&pageId=plflex&mobileBrowserWeblabTreatment=C&openid.return_to=https%3A%2F%2Fwww.amazon.pl%2F%3Fref_%3Dnav_ya_signin&prev"
                + "RID=B7J5M7PHP3XG6B4HFSH6&openid.assoc_handle=plflex&openid.mode=checkid_setup&desktopBrowserWeblabTreatment=C&prepopulatedLoginId=&failedSignInCount"
                + "=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
        driver.manage().window().maximize();
        driver.findElement(By.name("customerName")).sendKeys("Jan Kowalski");
        driver.findElement(By.name("customerName")).clear();
        System.out.println(driver.findElement(By.name("customerName")).getAttribute("class"));
        System.out.println(driver.findElement(By.xpath("//*[@id=\"continue\"]")).getCssValue("background"));
        System.out.println(driver.findElement(By.xpath("//*[@id=\"continue\"]")).getSize());
        System.out.println(driver.findElement(By.xpath("//*[@id=\"continue\"]")).getLocation());
        System.out.println(driver.findElement(By.xpath("//*[@id=\"ap_register_form\"]/div/div/h1")).getText());
        System.out.println(driver.findElement(By.xpath("//*[@id=\"continue\"]")).getTagName());
        System.out.println(driver.findElement(By.xpath("//*[@id=\"continue\"]")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("//*[@id=\"continue\"]")).isEnabled());
        System.out.println(driver.findElement(By.xpath("//*[@id=\"continue\"]")).isSelected());

    }
}
