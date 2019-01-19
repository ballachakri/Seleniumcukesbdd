@filter
  Feature: filter the items
  As a end user
  I want to filter the products
  So that i can view all products by filter

  @regression
  Scenario: Filter by Customer Reviews
    Given I am on the homepage
    When i search for product "nike"
    And i selected review "5only" on search results
    Then I should see all the relevant products "customerReview" are filtered "5only"

  @regression
  Scenario: Filter by Price Range
    Given I am on the homepage
    When i search for product "nike"
    And i selected review "£25 - £50" on search results
    Then I should see all the relevant products "range" are filtered "£25 - £50"
