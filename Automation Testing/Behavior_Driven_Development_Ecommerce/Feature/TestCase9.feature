Feature: Checkout

@TC_09
Scenario: Verify checkout
  Given Cart contains products
  When User proceeds to checkout
  Then Checkout page should open
