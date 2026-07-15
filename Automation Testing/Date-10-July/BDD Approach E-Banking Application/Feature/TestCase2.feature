Feature: Customer Login

Background:
  Given User launches the Internet Banking Application

@Login
Scenario Outline: Verify customer login
  Given User is on Login page
  When User enters Username "<Username>"
  And User enters Password "<Password>"
  And User clicks Login button
  Then User should login successfully

Examples:
| Username | Password |
| john@test.com | Bank@123 |
