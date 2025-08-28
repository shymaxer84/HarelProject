import Purchasing_Travel_Insurance.TravelInsurance;
import base.BaseTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class HarelTests extends BaseTest {



    @Test(description = "Validate total sum of days for traveler and travelers page")
    public void purchaseTravelInsurance(){
        TravelInsurance purchaseInsurance = new TravelInsurance(driver);
        purchaseInsurance.clickInsuranceButton();
        purchaseInsurance.continentSelection();//Chosen USA Continent
        purchaseInsurance.dateSelection();
        purchaseInsurance.navigateDateSelection();
        purchaseInsurance.navigateTravelersSelection();



    }

}
