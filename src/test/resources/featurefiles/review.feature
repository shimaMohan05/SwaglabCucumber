Feature: Test the SwagLab application
@Review
  Scenario: Test the review page
    Given open SwagLab application
    Given login swaglab using valid credentials
    Given Select the product from inventory page and click on addtocart link
    Given click on the checkout button in cart page
    Given Enter user details and enter continue button
    When fetch the billing summary
    Then print the summary details
    When Click on Finish button
    Then user will redirected to checkout copleate  page
