Feature: Remove from Cart

@TC_07
Scenario: Verify remove from cart
  Given Product is in cart
  When User removes product
  Then Product should be removed
