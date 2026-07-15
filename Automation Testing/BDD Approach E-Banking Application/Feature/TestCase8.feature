Feature: Transaction History

Background:
  Given User is logged into Internet Banking

@TransactionHistory
Scenario Outline: Verify Transaction History
  Given User opens Transaction History page
  When User selects From Date "<FromDate>"
  And User selects To Date "<ToDate>"
  And User clicks Search button
  Then Transaction history should be displayed

Examples:
| FromDate | ToDate |
| 01-07-2026 | 11-07-2026 |
