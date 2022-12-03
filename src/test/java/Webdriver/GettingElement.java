package Webdriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class GettingElement {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        waiting();

        WebElement fullname=driver.findElement(By.cssSelector("#userName"));
        fullname.click();
        fullname.sendKeys("Faruk Yücel");
        waiting();

        WebElement email=driver.findElement(By.xpath("//input[@id='userEmail']"));
        email.click();
        email.sendKeys("farukyucel5@gmail.com");
        waiting();

        WebElement currentAdress=driver.findElement(By.xpath("//textarea[@placeholder=\"Current Address\"]"));
        currentAdress.click();
        currentAdress.sendKeys("Bursa/Osmangazi");
        waiting();

        JavascriptExecutor jsx=(JavascriptExecutor) driver;
        jsx.executeScript("window.scrollBy(0,450)","");

        WebElement permanentAdress=driver.findElement(By.xpath("//textarea[@id=\"permanentAddress\"]"));
        permanentAdress.click();
        permanentAdress.sendKeys("indefinite for now!");
        waiting();

        WebElement submit=driver.findElement(By.xpath("//button[@id=\"submit\"]"));
        submit.click();

        waiting();

        driver.manage().window().minimize();

        waiting();

        driver.manage().window().maximize();
        driver.quit();

    }

    public static void waiting()
    {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }




}
