@smoke
  Feature: F05_hoverCategories
    Scenario: hover between the categories
      When select random one of the three sub categories
      And hover on the selected category
      Then verify that the sub category title