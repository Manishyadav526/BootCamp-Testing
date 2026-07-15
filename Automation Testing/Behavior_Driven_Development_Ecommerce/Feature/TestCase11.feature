Feature: Order Confirmation

@TC_11
Scenario: Verify order confirmation
  Given Payment is successful
  When Order is placed
  Then Order confirmation should be displayed
