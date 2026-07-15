Feature: Logout

Background:
  Given User is logged into Internet Banking

@Logout
Scenario: Verify Logout functionality
  When User clicks Logout button
  Then User should be redirected to Login page
  And User session should be terminated successfully
