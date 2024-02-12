Feature: Test the SwagLab application

  Scenario: Test the login functionality
    Given open SwagLab application
    When Enter usename="standard_user" and password="secret_sauce"
    When Click on submit button
    Then user can able to login
