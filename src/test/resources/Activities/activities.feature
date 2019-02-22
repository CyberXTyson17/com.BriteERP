Feature: As a manager I should be able to go to Activities through CRM Module


#  Background:
#    Given user should be able to open the login page
#    When User logs in using "EventsCRM_Manager@info.com" and "Ugh45wQ12"
#    Then User should be able to click on CRM module

  @BRIT-4295

  Scenario: As a manager I should be able to click on activites through CRM module
    Given user should be able to open the login page
    When User logs in using "EventsCRM_Manager@info.com" and "Ugh45wQ12"
    Then User should be able to click on CRM module
    And Click on Activities

  Scenario: As a manager I should be able to click on search-button
    Given user should be able to open the login page
    When User logs in using "EventsCRM_Manager@info.com" and "Ugh45wQ12"
    Then User should be able to click on CRM module
    And Click on Activities
    Then Click on search

  Scenario: As a manager I shoud be able to click on Group-by drop-down
    Given user should be able to open the login page
    When User logs in using "EventsCRM_Manager@info.com" and "Ugh45wQ12"
    Then User should be able to click on CRM module
    And Click on Activities
    Then Click on search
    And Click on Group-by

  Scenario: As a manager I shoud be able to click on Filter drop-down
    Given user should be able to open the login page
    When User logs in using "EventsCRM_Manager@info.com" and "Ugh45wQ12"
    Then User should be able to click on CRM module
    And Click on Activities
    Then Click on search
    And Click on Group-by
    Then Click on Filter

  Scenario: As a manager I shoud be able to click on Favorites drop-down
    Given user should be able to open the login page
    When User logs in using "EventsCRM_Manager@info.com" and "Ugh45wQ12"
    Then User should be able to click on CRM module
    And Click on Activities
    Then Click on search
    And Click on Group-by
    Then Click on Filter
    And Click on Favorites

  Scenario: As a manager I shoud be able to click on Measure drop-down
    Given user should be able to open the login page
    When User logs in using "EventsCRM_Manager@info.com" and "Ugh45wQ12"
    Then User should be able to click on CRM module
    And Click on Activities
    Then Click on search
    And Click on Group-by
    Then Click on Filter
    Then Click on Measure