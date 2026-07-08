import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class LoginPage {

    public static void main(String[] args) throws InterruptedException{

        WebDriver driver = new ChromeDriver(); //launching empty browser

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); //launch login page


        Thread.sleep(2000); //2sec

        driver.manage().window().maximize();  //maximise browser


        WebElement name = driver.findElement(By.name("username")); //username xpath
        name.sendKeys("Admin");

        Thread.sleep(2000);

        WebElement password = driver.findElement(By.name("password")); //password xpath
        password.sendKeys("admin123");

        WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
        button.submit(); //click login button

        Thread.sleep(5000);

        //driver.quit(); //closed browser

        System.out.println("Username & Password entered correctly and login successfully");


    }
}
