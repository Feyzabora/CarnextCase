package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.components.CarCard;
import utils.Utilities;

import java.util.List;

public class CarsPage extends Utilities {


    @FindBy(css = "[data-e2e-id*= carDetailsButton]")
    public List<WebElement> carFeatures;

    @FindBy(css = "[class*='CarCard']")
    public List<CarCard> carCards;

    public void x(CarCard card){
        System.out.println(card.getConfiguration());;
        System.out.println(card.getBrand());;
        System.out.println(card.getStatus());;
        System.out.println(card.getImgSource());;
        System.out.println(card.getModel());;
        System.out.println(card.getKilometers());;
        System.out.println(card.getPrice());;
        System.out.println(card.getYear());;
        System.out.println(card.isAutomatic());;
        System.out.println(card.isDiesel());;
    }

    public void clickFav(CarCard card){
        card.addFavorite();
    }

    public void clickByFeature(String model){
        for (CarCard productCard:carCards) {
            if(productCard.getConfiguration().contains(model)){
                System.out.println(productCard.getConfiguration());
                clickElement(productCard);
            }
        }
    }
}
