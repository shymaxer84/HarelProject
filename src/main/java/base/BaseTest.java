package base;

import Utilities.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.Set;

public class BaseTest extends Utilities {
    protected WebDriver driver;
    @BeforeMethod
    public void setUP(){

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://digital.harel-group.co.il/travel-policy");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Utilities.PAGE_WAIT_TIME));


    }
    @AfterTest
    public void tearDown(){
        if(driver !=null)  {
            driver.quit();

        }
    }
}
