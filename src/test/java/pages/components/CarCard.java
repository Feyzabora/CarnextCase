package pages.components;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.TextParser;
import utils.Utilities;
import java.util.List;

public class CarCard extends Utilities {

    TextParser parser = new TextParser();

    @FindBy(css = "[class*='FavoriteButton']")
    public WebElement favoriteButton;

    @FindBy(css = "[data-e2e-id='cardCarBrand']")
    public WebElement brandContainer;

    @FindBy(css = "[data-e2e-id='cardCarModel']")
    public WebElement modelContainer;

    @FindBy(css = "picture img")
    public WebElement picture;

    @FindBy(css = "[class*='CarLabel']")
    public List<WebElement> labels;

    @FindBy(css = "[class*='PriceContent']")
    public WebElement priceContainer;

    @FindBy(css = "[data-e2e-grid-item]")
    public List<WebElement> specificationsList;

    @FindBy(css = "span button")
    public WebElement detailsButton;

    public Integer getKilometers(){return new Specifications(specificationsList).kilometers;}

    public Boolean isAutomatic(){return new Specifications(specificationsList).isAutomatic;}

    public Boolean isDiesel(){return new Specifications(specificationsList).isDiesel;}

    public Integer getYear(){return new Specifications(specificationsList).year;}

    public String getBrand(){return brandContainer.getText();}

    public String getModel(){return modelContainer.getText();}

    public String getConfiguration(){return picture.getAttribute("alt");}

    public String getImgSource(){return picture.getAttribute("src");}

    public void clickDetailsButton(){clickElement(detailsButton);}

    public void addFavorite(){clickElement(favoriteButton);}

    public Integer getPrice(){
        if (getStatus()==null || !getStatus().equals("Satıldı"))
            return Integer.parseInt(parser.parse(
                    "",
                    "₺",
                    priceContainer.getText()).replaceAll("\\.","").trim());
        else
            return null;
    }

    public String getStatus(){
        if (labels.size()>0) return labels.get(0).getText();
        else return null;
    }

    private static class Specifications {
        TextParser parser = new TextParser();
        private final Integer kilometers;
        private final Boolean isDiesel;
        private final Boolean isAutomatic;
        private final Integer year;

        public Specifications(List<WebElement> specificationsList){
            this.isDiesel = specificationsList.get(0).getText().contains("Dizel");
            this.isAutomatic = specificationsList.get(1).getText().contains("Otomatik");
            this.year = Integer.parseInt(specificationsList.get(2).getText().trim());
            this.kilometers = Integer.parseInt(parser.parse(
                    null,
                    "Km",
                    specificationsList.get(3).getText()).replaceAll("\\.","").trim());
        }
    }

}
