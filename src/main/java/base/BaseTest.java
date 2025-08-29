package base;

import Utilities.Utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import java.time.Duration;


public class BaseTest extends Utilities {
    protected WebDriver driver;
    @BeforeMethod
    public void setUP(){

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--no-sandbox", "--disable-dev-shm-usage", "--disable-gpu", "--remote-allow-origins=*");

            String ciEnv = System.getenv("CI");
            if (ciEnv != null && ciEnv.equalsIgnoreCase("true")) {
                options.addArguments("--headless=new", "--window-size=1920,1080");
            } else {
                options.addArguments("--start-maximized");
            }

            driver = new ChromeDriver(options);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://digital.harel-group.co.il/travel-policy");

    }
    @AfterTest
    public void tearDown(){
        if(driver !=null)  {
            driver.quit();

        }
    }
}
