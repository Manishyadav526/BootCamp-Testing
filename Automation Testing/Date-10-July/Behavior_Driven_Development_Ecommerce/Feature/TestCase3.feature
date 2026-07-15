Feature: Product Search

@TC_03
Scenario: Verify product search
  Given User is logged in
  When User searches for "iPhone 15"
  Then Relevant products should be displayed
