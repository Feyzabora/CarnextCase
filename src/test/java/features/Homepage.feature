Feature: Sign up/User Journey
  Background:
    * Navigate to www.carnext.com/tr-tr/

  Scenario: Select a car
    * I click the brand filter
    * I select the car brand as Audi
    * I click the model filter
    * I filter A3
    * I print cars
    * I select car by feature 2.0 TDI quattro S tronic
    * I get appointment
    * I select day from dropdown as Yarın 19 Ekim
    * I select day from dropdown as 10:00 - 11:00
    * I fill name as Tester
    * I fill lastname as Tester
    * I fill email as tester@gmail.com
    * I fill phone number as +901111111111
    * I check gdpr
    * I check Marketing Aggrement
    * I submit appoinment
    * I verify name input Tester
    * Wait 8 seconds
