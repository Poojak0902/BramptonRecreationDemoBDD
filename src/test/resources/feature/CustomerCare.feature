
@customer
Feature: Validate customer feature 
  I want to validate customer features 

  @Customervalidation 
  Scenario: validate cutomer tiles
    Given I want to validate that i am on cs page 
    When I land on cs page I see 9 tiles on page
    Then I want to validate 9 learn more buttons are there 
    
  
  @CustomerformDetails @regression @Sanity 
  
  Scenario Outline: validate cs form with dd testing
  
  Given I click on Sign up button
  Then  I See "<Email>" field
  Then I see "<Fn>" section
  Then I See "<ln>" field in the form
  Then I See "<pcode>" in the form
  
  Examples:
  |Email|Fn|ln|pcode|
  |abc@gmail.com|Pooja|xyz|L7A2G5|
  |xya@gmail.com|Xaver|Rupal|L6P47G|

    
 @regression
  Scenario: validate cutomer tiles
    Given I want to validate that i am on cs page 
    When I land on cs page I see 9 tiles on page
    Then I want to validate 9 learn more buttons are there 
