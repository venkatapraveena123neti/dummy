#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Registration Page
  This tests for Registration Event

  @execute
  Scenario: User will give details and try to register
    Given User is one Personal Details page
    When title is not matching with expected title
    Then test should stop execution
    When user click next link without entering Firstname
    Then 'Please fill the First Name' should display
    When user click next link without entering Lastname
    Then 'Please fill the Last Name' should display
    When user click next link without entering email
    Then 'Please fill the Email' should display
    When user clicks next link with invalid email id
    Then 'Please enter valid Email Id.' should display
    When user click next link without entering Conctactno
    Then 'Please fill the Contact No.' should display
    When user clicks next link with invalid contact no.
    Then 'Please enter valid Contact no.' should display
    When user click next link without entering addresslineone
    Then 'Please fill the address line one' should display
    When user click next link without entering addressline two
    Then 'Please fill the address line two' should display
    When user click next link without selecting city
    Then 'Please select city' should display
    When user click next link without selecting state
    Then 'Please select state' should display
    When user click next link after entering valid details
    Then 'Personal details are validated and accepted successfully.' should display navigate to page
