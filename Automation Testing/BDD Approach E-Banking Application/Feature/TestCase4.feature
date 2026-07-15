Feature: Balance Enquiry

Background:
  Given User is logged into Internet Banking

@BalanceEnquiry
Scenario: Verify Balance Enquiry
  When User clicks Balance Enquiry
  Then Current Account Balance should be displayed
