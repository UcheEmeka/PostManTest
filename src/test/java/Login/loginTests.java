package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class loginTests {

    private WebDriver driver;

    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "E:/test_automation/resources/geckodriver.exe");
        driver = new FirefoxDriver();

        driver.get("https://identity.getpostman.com/login?addAccount=1");
        Thread.sleep(5000);
        driver.manage().window().maximize();

        System.out.println(driver.getTitle());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("username")).sendKeys("enter sample email address here");
        driver.findElement(By.id("password")).sendKeys("enter sample password here");
        //driver.findElement(By.id("sign-in-btn")).click();

        driver.close();
    }

    public static void main(String args[]) throws InterruptedException
    {
        loginTests test = new loginTests();
        test.setUp();
    }
}
