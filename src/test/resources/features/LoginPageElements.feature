#Author: Aziz E.

@Abdulaziz2
Feature: Login to SIS Page

  Scenario: Valid Login
    
    #Given I navigated to the HRM website
    When I enter a valid username
    And I enter a valid password
    And I click the login button
    Then I validate I am logged in
    #And I will quit the browser

  


