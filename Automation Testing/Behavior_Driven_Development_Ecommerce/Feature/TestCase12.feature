Feature: Logout

@TC_12
Scenario: Verify logout
  Given User is logged in
  When User logs out
  Then Login page should be displayed
