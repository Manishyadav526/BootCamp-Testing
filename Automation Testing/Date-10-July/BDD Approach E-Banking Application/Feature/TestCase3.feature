Feature: Account Summary

Background:
  Given User is logged into Internet Banking

@AccountSummary
Scenario: Verify Account Summary
  When User clicks Account Summary
  Then Account Number should be displayed
  And Account Type should be displayed
  And Available Balance should be displayed
