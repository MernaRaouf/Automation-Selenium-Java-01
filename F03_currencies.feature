@smoke
  Feature: F03_currencies | changing the currency
    Scenario: user could change the currency
      When Select Euro currency from the dropdown list
      Then Verify the Euro Symbol