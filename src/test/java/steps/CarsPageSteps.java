package steps;

import pages.CarsPage;
import io.cucumber.java.en.Given;
import pages.components.CarCard;

public class CarsPageSteps {

    CarsPage carsPage= new CarsPage();

    @Given("I select car by feature {}")
    public void selectByFeature(String model){
        carsPage.loopAndClick(carsPage.carFeatures,model);
    }

    @Given("I print cars")
    public void printCarShize(){
        for (CarCard card:carsPage.carCards) {
            if(card.getBrand().trim().length()>0){
                carsPage.x(card);
            }
        }
    }

    @Given("I click Favorite")
    public void clickFav(){
        for (CarCard card:carsPage.carCards) {
            carsPage.clickFav(card);
        }
    }

}
