Feature: Add to Cart

@TC_05
Scenario: Verify add to cart
  Given User is on product page
  When User clicks Add to Cart
  Then Product should be added to cart
