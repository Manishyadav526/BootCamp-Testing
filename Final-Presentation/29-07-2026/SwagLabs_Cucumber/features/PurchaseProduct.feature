Feature: Purchase Product

  Scenario: Purchase two products successfully

    Given User launches the browser
    And User logs in with valid credentials
    When User opens the Backpack product
    And User adds the Backpack to the cart
    And User returns to the inventory page
    And User opens the Bike Light product
    And User adds the Bike Light to the cart
    And User opens the shopping cart
    And User proceeds to checkout
    And User enters customer details
    And User completes the purchase
    Then Order should be placed successfully