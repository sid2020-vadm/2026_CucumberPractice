@sample2
Feature: Sample2 hooks
  Scenario:  first debit test case
    Given I logged into homepage
    When I perform debit payment
    Then payment should be successful