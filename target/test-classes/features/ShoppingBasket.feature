@basket
  Feature:
    As i am end user
    I want to add to the argos basket
    So that i can buy product
    @EndToEnd
    Scenario:
      Given I am on the homepage
      When i search for a product "laptop"
      And i select a product randomly
      And the product should be added to basket
      And i will go to basket
      Then i should see the product my basket to buy it
