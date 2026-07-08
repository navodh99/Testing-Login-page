import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage1 {

    public static void main(String[] args) throws InterruptedException{

        WebDriver driver = new ChromeDriver(); //launching empty browser

        driver.get("https://admin-demo.nopcommerce.com/login"); //launch login page


        Thread.sleep(2000); //2sec

        driver.manage().window().maximize();  //maximise browser


        WebElement name = driver.findElement(By.name("Email"));//username xpath
        name.clear();
        name.sendKeys("admin@yourstore.com");

        Thread.sleep(2000);

        WebElement password = driver.findElement(By.name("Password")); //password xpath
        password.clear();
        password.sendKeys("admin");

        WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
        button.submit(); //click login button

        Thread.sleep(5000);

        //driver.quit(); //closed browser

        System.out.println("Username & Password entered correctly and login successfully");


    }
}
