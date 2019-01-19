@sort
  Feature: Sorting
    As an end User
    I want to sort the Products
    So that i can view them in selected sorting pattern
  @regression
  Scenario: Sorting
    Given I am on the homepage
    When i search for a product "nike"
    And i sort the product by "Price: High - Low"
    Then i could see the all products in sorting order of Price" in order"


