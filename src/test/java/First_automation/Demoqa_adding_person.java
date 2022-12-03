package First_automation;

import Webdriver.GettingElement;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Demoqa_adding_person {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        GettingElement.waiting();

        JavascriptExecutor jsx=(JavascriptExecutor) driver;
        jsx.executeScript("window.scrollBy(0,450)","");
        GettingElement.waiting();

        WebElement elements= driver.findElement(By.xpath("//*[name()='path' and contains(@d,'M16 132h41')]"));
        GettingElement.waiting();
        elements.click();

        GettingElement.waiting();

        jsx.executeScript("window.scrollBy(0,450)","");

        GettingElement.waiting();

        WebElement webtables= driver.findElement(By.xpath("//div[@class='element-list collapse show']//li[@id='item-3']"));
        webtables.click();

        GettingElement.waiting();

        WebElement add= driver.findElement(By.xpath("//button[@id='addNewRecordButton']"));
        add.click();

        GettingElement.waiting();

        WebElement firstname=driver.findElement(By.xpath("//input[@id='firstName']"));
        firstname.click();
        firstname.sendKeys("Faruk");

        GettingElement.waiting();

        WebElement lastname=driver.findElement(By.xpath("//input[@id='lastName']"));
        lastname.click();
        lastname.sendKeys("Yucel");

        GettingElement.waiting();

        WebElement email=driver.findElement(By.xpath("//input[@id='userEmail']"));
        email.click();
        email.sendKeys("farukyucel5@gmail.com");

        GettingElement.waiting();

        WebElement age=driver.findElement(By.xpath("//input[@id='age']"));
        age.click();
        age.sendKeys("28");

        GettingElement.waiting();

        WebElement salary=driver.findElement(By.xpath("//input[@id='salary']"));
        salary.click();
        salary.sendKeys("28000");

        GettingElement.waiting();

        WebElement department=driver.findElement(By.xpath("//input[@id='department']"));
        department.click();
        department.sendKeys("IT department");

        GettingElement.waiting();

        WebElement submit=driver.findElement(By.xpath("//button[@id='submit']"));
        submit.click();























    }
}
