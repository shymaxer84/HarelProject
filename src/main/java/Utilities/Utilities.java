package Utilities;


import org.openqa.selenium.By;

public class Utilities  {
    public static final int  IMPLICIT_WAIT_TIME = 10;
    public  static final int PAGE_WAIT_TIME = 10;

    public By purchaseButton = By.xpath("//div[@class='jss11']/button[@class='MuiButtonBase-root MuiButton-root jss34 jss13 MuiButton-contained jss12 MuiButton-containedPrimary']");//enum ?

    public By chooseContinent = By.xpath("//div[@id='destination-0']//*[name()='svg']");

    public  By chooseDateOfTravel = By.xpath("//div[@class='jss207']/div/button[@class='MuiButtonBase-root MuiButton-root jss208 MuiButton-contained jss164 MuiButton-containedPrimary']");


}
