Feature: Test the SwagLab application
@Inventory
  Scenario: Test the inventory page
    Given open SwagLab application
    Given login swaglab using valid credentials
    When select a product from inventory page and click on addto cart button
    When Click on addtocart link
    Then user can able to get acess on cart page
