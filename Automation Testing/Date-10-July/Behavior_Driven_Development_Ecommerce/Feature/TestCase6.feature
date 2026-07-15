Feature: Update Cart

@TC_06
Scenario: Verify update cart quantity
  Given Product is in cart
  When User updates quantity
  Then Cart should be updated
