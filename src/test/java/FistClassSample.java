import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class FistClassSample {
WebDriver driver;
    @BeforeTest
    public void setup()
    {

    }
    @Test
    public void testOne()
    {
        String test1=System.getProperty("user.dir");
        System.out.println("Proj Driver Location "+test1);
        System.setProperty("web.chrome.driver",System.getProperty("user.dir")+"\\src\\properties\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    @AfterTest
    public void tesrdown()
    {

    }
}
