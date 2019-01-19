@register
Feature: User Registration
  As a end user i am on the homepage
  I want to register to Agros
  So that i can enter all valid dat

  Background: User on the Home Page
    @smoke
    Scenario:
      Given I am on the homepage
      When i will navigate register page
      And i will enter the user deatils:
      |email | title | firstName | lastName | postCode |
      | abdnc@sdsds.com | Mr |  chakr | balla | ig1 4nd |







