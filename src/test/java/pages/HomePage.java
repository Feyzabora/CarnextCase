package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Printer;
import utils.Utilities;

import java.util.List;

public class HomePage extends Utilities {

    Printer log = new Printer(HomePage.class);

    @FindBy (css = "[class*=ResponsiveColumnList] li label")
    public List<WebElement> carBrands;

    @FindBy (css = "[class*=ResponsiveColumnList]")
    public WebElement carBrandsPanel;

    @FindBy (css = "[class*='DrawerDropdownstyled'] label")
    public List<WebElement> carModels;

    @FindBy (css = "[data-e2e-id=\"brandDropdown\"]")
    public WebElement brandFilter;

    @FindBy (css = "[data-e2e-id=\"modelDropdown\"]")
    public WebElement modelFilter;

    @FindBy (css = "[data-e2e-id=\"searchButton\"]")
    public WebElement searchButton;

    public void selectCar(String brand){
        waitUntilElementIsVisible(carBrandsPanel, System.currentTimeMillis());
        for (WebElement carBrand:carBrands){
            String filter = carBrand.getText();
            if (filter.contains(brand)){
                clickElement(carBrand);
                return;
            }
        }
        Assert.fail("Could not find element type");
    }
    public void selectModel(String model){
        waitUntilElementIsVisible(carBrandsPanel, System.currentTimeMillis());
        loopAndClick(carModels,model);
    }

}
