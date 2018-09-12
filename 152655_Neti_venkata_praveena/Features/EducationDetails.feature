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
Feature: Redirecting from education details page

  @tag1
  Scenario: User enters education details
    Given User is on Education Details page
    When title of the page doesnt match
    Then test stops execution
    When user click makepayment link without entering graduation
    Then 'Please Select Graduation' should display
    When user click makepayment link without entering percentage
    Then 'Please fill Percentage detail' should display
    When user click makepayment link without entering passing year
    Then 'Please fill Passing Year' should display
    When user clicks makepayment link without entering project name
    Then 'Please fill Project Name' should display
    When user click makepayment link without selecting technologies used
    Then 'Please Select Technologies Used' should display
    When user clicks makepayment link without entering other technologies
    Then 'Please fill other Technologies Used' should display
    When user click makepayment link after entering valid details
    Then 'Your Registration Has succesfully done Plz check you registerd email for account activation link !!!' should display navigate to page
