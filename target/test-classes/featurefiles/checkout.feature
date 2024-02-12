Feature: Test the SwagLab application
@Checkout
  Scenario: Test the checkout page
    Given open SwagLab application
    Given login swaglab using valid credentials
    Given Select the product from inventory page and click on addtocart link
    Given click on the checkout button in cart page
    When enter fname "Shima" lname "Mohan" zip"560060"
    When Click on cancel button
    Then it will redirected to cart page
    When click on checkout button again
    Then user will redirected to checkout  page
    When click on continue button button
    Then user will redirected to review  page
