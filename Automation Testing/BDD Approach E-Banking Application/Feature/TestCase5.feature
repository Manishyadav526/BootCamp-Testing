Feature: Add Beneficiary

Background:
  Given User is logged into Internet Banking

@AddBeneficiary
Scenario Outline: Verify Add Beneficiary
  Given User is on Add Beneficiary page
  When User enters beneficiary details
    | Name | <Name> |
    | Account Number | <Account> |
    | IFSC | <IFSC> |
    | Bank | <Bank> |
  And User clicks Save Beneficiary
  Then Beneficiary should be added successfully

Examples:
| Name | Account | IFSC | Bank |
| Rahul Sharma | 123456789012 | SBI0001234 | SBI |
