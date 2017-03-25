@live1
Feature: Add product to the cart

  Scenario Outline: Add product to the cart

    Given User is in home page
    When User search for a product "<product>"
    Then User should be nevigated to product "<product>" page
    When User selects the item
    Then "<product>" description page should be displyed
    When User select "<size>"
    And Adds the product to the cart
    Then The product should be added to the cart
    And User navigates to bagpage



    Examples:
      | product | size                  |
      | Nike    | UK 8 - EU 42.5 - US 9 |
#      | adidas  | UK 8                  |








