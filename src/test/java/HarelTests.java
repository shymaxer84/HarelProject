import Purchasing_Travel_Insurance.TravelInsurance;
import base.BaseTest;
import org.testng.annotations.Test;

public class HarelTests extends BaseTest {


    @Test
    public void testPurchaseInsurance(){
        TravelInsurance purchaseInsurance = new TravelInsurance(driver);
        purchaseInsurance.clickInsuranceButton();
    }

    @Test(dependsOnMethods = "testPurchaseInsurance",description = "Chosen USA Continent")
    public void testChooseContinent(){
        TravelInsurance purchaseInsurance = new TravelInsurance(driver);
        purchaseInsurance.continentSelection();
    }

    @Test(dependsOnMethods = "testChooseContinent")
    public void testChooseDate(){
        TravelInsurance chooseDate = new TravelInsurance(driver);
        chooseDate.dateSelection();

    }

}
