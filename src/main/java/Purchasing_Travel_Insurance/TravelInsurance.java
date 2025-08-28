package Purchasing_Travel_Insurance;

import Utilities.Utilities;
import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class TravelInsurance  {

private final WebDriver driver;

private final By purchaseButton = By.xpath("//div[@class='jss11']/button[@class='MuiButtonBase-root MuiButton-root jss34 jss13 MuiButton-contained jss12 MuiButton-containedPrimary']");

private final By chooseContinent = By.xpath("//div[@id='destination-0']//*[name()='svg']");

private  final  By chooseDateOfTravel = By.xpath("//div[@class='jss207']/div/button[@class='MuiButtonBase-root MuiButton-root jss208 MuiButton-contained jss164 MuiButton-containedPrimary']");

    public TravelInsurance(WebDriver driver){
        this.driver =driver;
    }

public  void clickInsuranceButton(){

    driver.findElement(purchaseButton).click();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Utilities.IMPLICIT_WAIT_TIME));
}

public void continentSelection(){

    driver.findElement(chooseContinent).click();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Utilities.IMPLICIT_WAIT_TIME));
}

public void dateSelection(){

    driver.findElement(chooseDateOfTravel).click();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Utilities.IMPLICIT_WAIT_TIME));
}
}
