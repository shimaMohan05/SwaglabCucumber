Feature: Test the SwagLab application
@Cart
  Scenario: Test the cart page
    Given open SwagLab application
    Given login swaglab using valid credentials
    Given Select the product from inventory page and click on addtocart link
    When click on remove button
    When Click on continue shopping
    When select product from inventory and click on addtocart link
    When click on checkout button
    Then user will redirected to checkout page
