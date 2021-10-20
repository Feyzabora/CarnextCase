package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Utilities;

import java.util.List;

public class CarDetailsPage extends Utilities {
    @FindBy(css = "[data-e2e-id=\"makeAnAppointmentButton\"]")
    public WebElement getAppointmentButton;

    @FindBy (css = "[class*=\"Select__SelectWrapper\"] option")
    public List<WebElement> dayDropDown;

    @FindBy (css = "[id=\"firstName_input\"]")
    public WebElement nameInput;

    @FindBy (css = "[id=\"lastName_input\"]")
    public WebElement secondNameInput;

    @FindBy (css = "[id=\"email_input\"]")
    public WebElement emailInput;

    @FindBy (css = "[id=\"phone_input\"]")
    public WebElement phoneNumber;

    @FindBy (css = "[name=\"gdprConsent\"]")
    public WebElement gdprConsent;

    @FindBy (css = "[name=\"marketingAgreement\"]")
    public WebElement marketingAggrement;

    @FindBy (css = "[data-e2e-id=\"submitAppointmentFormButton\"]")
    public WebElement submitAppointment;


    /* public void selectDay(String model){

        for (WebElement day:dayDropDown){
            if (day.getText().contains(model)){
                clickElement(day);
                return;
            }
        }
    }*/
    public void fillNameInput(String input){
        clearFillInput(nameInput,input,true);
    }
    public void fillLastNameInput(String input){
        clearFillInput(secondNameInput,input,true);
    }
    public void fillEmailInput(String input){
        clearFillInput(emailInput,input,true);
    }
    public void fillPhoneNumberInput(String input){
        clearFillInput(phoneNumber,input,true);
    }
    public void checkGdpr(){
        clickElement(gdprConsent);
    }
    public void checkMarketing(){
        clickElement(marketingAggrement);
    }
    public void verifyNameOutput(String nameOutputText){
        if(nameInput.getAttribute("value").contains(nameOutputText)){
            System.out.println("Output is verified to be " + nameOutputText);
        }
        else Assert.fail("Could not verify name output.");
    }
}
