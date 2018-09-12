Feature: Check addition in Google calculator
   In order to verify that google calculator work correctly
   As a user of google
   I should be able to get correct addition result

  Scenario Outline: Addition
    Given I open google
    When I enter "<calculation>" in search textbox
    Then I should get result as "<result>"

    Examples: 
      | calculation | result |
      | 3+3         |      6 |
      | 2+5         |     70 |
