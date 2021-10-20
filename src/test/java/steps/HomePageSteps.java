package steps;

import pages.HomePage;
import io.cucumber.java.en.Given;

public class HomePageSteps {

    HomePage homePage= new HomePage();

    @Given("I click the brand filter")
    public void clickBrandFilter(){
        homePage.clickElement(homePage.brandFilter);
    }

    @Given("I click the model filter")
    public void clickModelFilter(){
        homePage.clickElement(homePage.modelFilter);
    }

    @Given("I select the car brand as {}")
    public void selectCarBrand(String brand){
        homePage.selectCar(brand);
    }

    @Given("I filter {}")
    public void selectModelBrand(String model){homePage.selectModel(model);}

    @Given("I click the search button")
    public void clickSearchButton(){
        homePage.clickElement(homePage.searchButton);
    }

}
