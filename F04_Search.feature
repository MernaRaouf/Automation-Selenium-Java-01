@smoke
  Feature: F04_Search.feature | Search
    Scenario: user could search using product name
      When user enter product name
      And click on search btn
      Then verify the output


    Scenario: user could search for product using sku
      When user enter product sku
      And click on search btn
      Then verify the output
