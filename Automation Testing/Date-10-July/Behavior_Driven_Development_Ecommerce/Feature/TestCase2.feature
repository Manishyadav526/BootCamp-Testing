Feature: Customer Login

@TC_02
Scenario: Verify customer login with valid credentials
  Given User is on Login page
  When User enters valid credentials
  Then User should be logged in successfully
