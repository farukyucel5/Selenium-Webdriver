package First_automation;

import Webdriver.GettingElement;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Amazon_registration {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver =new ChromeDriver();

        driver.get("https://www.amazon.com.tr/b?ie=UTF8&node=20467303031");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        GettingElement.waiting();
        WebElement registration=driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
        registration.click();

        GettingElement.waiting();
        WebElement signup= driver.findElement(By.xpath("//a[@id='createAccountSubmit']"));
        signup.click();

        GettingElement.waiting();

        WebElement fullname=driver.findElement(By.xpath("//input[@id='ap_customer_name']"));
        fullname.click();
        fullname.sendKeys("Faruk Yucel");

        GettingElement.waiting();

        WebElement email=driver.findElement(By.xpath("//input[@id='ap_email']"));
        email.click();
        email.sendKeys("farukyucel5@hotmail.com");

        GettingElement.waiting();
        WebElement password=driver.findElement(By.xpath("//input[@id='ap_password']"));
        password.click();
        password.sendKeys("F120");

        GettingElement.waiting();
        WebElement password1=driver.findElement(By.xpath("//input[@id='ap_password_check']"));
        password1.click();
        password1.sendKeys("F120");

        GettingElement.waiting();
        WebElement submit= driver.findElement(By.xpath("//input[@id='continue']"));
        submit.click();




    }
}
