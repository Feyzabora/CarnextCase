package steps;

import pages.CarDetailsPage;
import io.cucumber.java.en.Given;

public class CarDetailsPageSteps {

    CarDetailsPage carDetailsPage = new CarDetailsPage();

    @Given("I get appointment")
    public void getAppointment(){
        carDetailsPage.clickElement(carDetailsPage.getAppointmentButton);
    }

    @Given("I select day from dropdown as {}")
    public void selectDay(String day){carDetailsPage.loopAndClick(carDetailsPage.dayDropDown, day);}

    @Given("I fill name as {}")
    public void fillName(String input){
        carDetailsPage.fillNameInput(input);
    }

    @Given("I fill lastname as {}")
    public void fillLast(String input){
        carDetailsPage.fillLastNameInput(input);
    }

    @Given("I fill email as {}")
    public void fillEmail(String input){
        carDetailsPage.fillEmailInput(input);
    }

    @Given("I fill phone number as {}")
    public void fillPhone(String input){
        carDetailsPage.fillPhoneNumberInput(input);
    }

    @Given("I check gdpr")
    public void checkGdpr(){
        carDetailsPage.checkGdpr();
    }

    @Given("I check Marketing Aggrement")
    public void checkMarketing(){
        carDetailsPage.checkMarketing();
    }

    @Given("I submit appoinment")
    public void clickBrandFilter(){
        carDetailsPage.clickElement(carDetailsPage.submitAppointment);
    }

    @Given("I verify name input {}")
    public void checkMarketing(String input){
        carDetailsPage.verifyNameOutput(input);
    }
}
