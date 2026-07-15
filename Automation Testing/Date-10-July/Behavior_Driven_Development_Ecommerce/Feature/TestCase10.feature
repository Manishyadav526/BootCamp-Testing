Feature: Payment

@TC_10
Scenario: Verify payment
  Given User is on checkout page
  When User enters valid payment details
  Then Payment should be successful
