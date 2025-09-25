package Purchasing_Travel_Insurance;

import Utilities.Utilities;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class TravelInsurance extends Utilities {

    public WebDriver driver;

    LocalDate startDate = LocalDate.now().plusDays(7);
    LocalDate endDate = startDate.plusDays(30);

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    String startStr = startDate.format(formatter);
    String endStr = endDate.format(formatter);



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
public void navigateDateSelection(){

    WebElement departureInput = driver.findElement(By.id("travel_start_date"));
        departureInput.sendKeys(startStr);
        departureInput.click();

    WebElement endDateInput = driver.findElement(By.id("travel_end_date"));
        endDateInput.sendKeys(endStr);
        endDateInput.click();

    long daysBetween = ChronoUnit.DAYS.between(startDate, endDate)+1;
    Assert.assertEquals(daysBetween, 31, "The number of days between start and end date is correct");

}
public void navigateTravelersSelection(){

WebElement travelers= driver.findElement(By.xpath("//div[@class='jss207']/button[@id='nextButton']"));
travelers.click();
WebElement assertText= driver.findElement(By.xpath("//span[text()='מי נוסע?']"));
String text = assertText.getText();
Assert.assertEquals(text,"מי נוסע?","The page travelers is opened");

}
}
