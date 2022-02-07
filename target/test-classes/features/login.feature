#Author
#Date
#Description
Feature: Bank manager add customer

  ##############
  #Open Account#
  ##############
  #Add customer successful with valid data
  Scenario: Check add customer is successful with valid credentials
    Given user navigates to Bank manager login page
    And user verify page
    When user click on Add Customer - top button
    Then user enters <firstname> ,<lastname> and <postcode>
    And user click on Add Customer - bottom button
    And user click on OK button of the alert
    And user verify data
    Then close executions

  #Add customer with all empty fields
  Scenario: Check add customer with all fields are empty
    Given user navigates to Bank manager login page
    And user verify page
    When user click on Add Customer - top button
    Then user click on Add Customer - bottom button
    Then close executions

  #verify First Name
  Scenario: Check add customer with First Name field is empty
    Given user navigates to Bank manager login page
    And user verify page
    When user click on Add Customer - top button
    Then user enters <lastname> and <postcode>
    Then user click on Add Customer - bottom button
    Then close executions

  #verify First Name
  Scenario: Check add customer with invalid First Name
    Given user navigates to Bank manager login page
    And user verify page
    When user click on Add Customer - top button
    Then user enters <lastname>, <postcode> and <inFirstname>
    And user click on Add Customer - bottom button
    Then user enter <Firstname> again
    Then user click on Add Customer - bottom button
    Then close executions

  #verify Last Name
  Scenario: Check add customer with Last Name is empty
    Given user navigates to Bank manager login page
    And user verify page
    When user click on Add Customer - top button
    Then user enters <firstname> and <postcode>
    Then user click on Add Customer - bottom button
    Then close executions

  #verify Last Name
  Scenario: Check add customer with invalid First Name
    Given user navigates to Bank manager login page
    And user verify page
    When user click on Add Customer - top button
    Then user enters <firstname>, <postcode> and <inLastname>
    And user click on Add Customer - bottom button
    Then user enter <Lastname> again
    Then user click on Add Customer - bottom button
    Then close executions

  #verify Post Code
  Scenario: Check add customer with Post Code is empty
    Given user navigates to Bank manager login page
    And user verify page
    When user click on Add Customer - top button
    Then user enters <firstname> and <lastname>
    And user click on Add Customer - bottom button
    Then close executions

  #verify Post Code
  Scenario: Check add customer with invalid Post Code
    Given user navigates to Bank manager login page
    And user verify page
    When user click on Add Customer - top button
    Then user enters <firstname> ,<lastname> and <inPostcode>
    And user click on Add Customer - bottom button
    Then user enter <Lastname> again
    Then user click on Add Customer - bottom button
    Then close executions

  ##############
  #Open Account#
  ##############
  #Open Account successfully with valid data
  Scenario: Check Open Account successful
    Given user navigates to Bank manager login page
    And user verify page
    When user click on Open Account button
    Then user select <customer> and <currency>
    And user click on Process button
    Then user click on OK button of the alert
    Then close executions

  #Open account with all empty fields
  Scenario: Check open Account with all fields are empty
    Given user navigates to Bank manager login page
    And user verify page
    When user click on Open Account button
    Then user click on Process button
    Then close executions

  #verify Customer field
  Scenario: Check open Account with empty Customer field
    Given user navigates to Bank manager login page
    And user verify page
    When user click on Open Account button
    Then user select <currency>
    And user click on Process button
    Then close executions

  ################
  #Customers list#
  ################
  #Search customer that exits
  Scenario: Check search customer that exits
    Given user navigates to Bank manager login page
    And user verify page
    When user click on Customers button
    Then user enter <customer> in Search Customer input
    Then close executions

  #Search customer that doesn't exit
  Scenario: Check search customer that does not exit
    Given user navigates to Bank manager login page
    And user verify page
    When user click on Customers button
    Then user enter invalidate <customer> in Search Customer input
    Then close executions
