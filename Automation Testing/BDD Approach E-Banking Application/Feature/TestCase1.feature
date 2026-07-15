Feature: Customer Registration

Background:
  Given User launches the Internet Banking Application

@Registration
Scenario Outline: Verify customer registration with valid details
  Given User is on Registration page
  When User enters customer details
    | First Name | <FirstName> |
    | Last Name | <LastName> |
    | Email | <Email> |
    | Mobile | <Mobile> |
    | Password | <Password> |
  And User clicks Register button
  Then Customer account should be created successfully

Examples:
| FirstName | LastName | Email | Mobile | Password |
| John | Doe | john@test.com | 9876543210 | Bank@123 |
