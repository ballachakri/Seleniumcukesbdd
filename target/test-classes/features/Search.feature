@search
Feature: Search
  As a end user
  I want to search for a product
  So that i can see all the relevant products

  Background: I am on the home page

  Scenario Outline: : valid search
    Given I am on the homepage
    When i search for a product "<myproduct>"
    Then I should see all the relevant products "<myproduct>"

    Examples:
    | myproduct |
    | laptop|