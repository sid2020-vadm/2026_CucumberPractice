@sample1
Feature: Sample1 hooks

  Scenario:  first upi test case
    Given I logged into homepage
    When I perform UPI payment
    Then payment should be successful

  Scenario: second test upi case
    Given I am in cartpage
    When add product to cart
    Then added products can be checked out successfully

