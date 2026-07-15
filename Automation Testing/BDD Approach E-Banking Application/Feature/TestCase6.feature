Feature: Fund Transfer

Background:
  Given User has added a beneficiary

@FundTransfer
Scenario Outline: Verify Fund Transfer
  Given User is on Fund Transfer page
  When User selects beneficiary "<Beneficiary>"
  And User enters transfer amount "<Amount>"
  And User clicks Transfer button
  Then Amount should be transferred successfully

Examples:
| Beneficiary | Amount |
| Rahul Sharma | 10000 |
