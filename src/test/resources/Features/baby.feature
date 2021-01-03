Feature: Test baby & Kids product validation
  Background:
    Given user is on wayfair home page

  Scenario: User able to find out 'Jost Wooden 3 Drawer Accent Chest' and validate it
    When User mouse hover on 'Baby & Kids' and click on the link of 'kids beds'
    And User click on 'Robidoux Convertible Toddler Bed' by selecting its size and color
    Then user should see the item price with text is "SKU: HRBE4979"

  Scenario: User able to find out 'Bounce Houses' and validate it
    When User mouse hover on 'Baby & Kids' and click on the link of 'Bounce Houses & Inflatable Slides'
    And User click on 'Endless Fun 11-in-1 Inflatable Water Bounce House' by selecting 'Age and Number of kids'
    Then user should see the item price with text is "SKU: KDW1152"

  Scenario: User able to find out 'Kids Dressers' and validate it
    When User mouse hover on 'Baby & Kids' and click on the link of 'Kids Dressers'
    And User click on 'Essex 6 Drawer Double Dresser' by selecting its  'color'
    Then user should see the item price with text is "SKU: W002903509"

   Scenario: User able to shop 'Kids Seating Under $100' and its price
    When User mouse hover on 'Baby & Kids' and click on the link of 'Kids Seating Under 100'
    And User click on 'Chewelah Kids Cotton Foam Chair' by selecting its kids 'age'
    Then user should see the item price is "$58.99"

  Scenario: User able to find out 'Toy Organizer' and validate it
    When User mouse hover on 'Baby & Kids' and click on the link of 'Toy Organizer'
    And User click on 'Brecken Kid Toy Organizer' by selecting its size and color
    Then user should see the item price with text is "SKU: OZS1071"

