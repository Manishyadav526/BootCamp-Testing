Feature: Wishlist

@TC_08
Scenario: Verify wishlist
  Given User is on product page
  When User adds product to wishlist
  Then Product should appear in wishlist
