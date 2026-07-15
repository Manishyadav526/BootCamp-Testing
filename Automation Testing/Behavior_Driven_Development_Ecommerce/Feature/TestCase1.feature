Feature: Customer Registration

@TC_01
Scenario: Verify customer registration with valid details
  Given User launches the Amazon application
  And User is on the Registration page
  When User enters valid registration details
  Then User account should be created successfully
