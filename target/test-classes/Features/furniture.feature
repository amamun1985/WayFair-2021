
Feature: Test furniture price validation
  Background:
    Given user is on wayfair home page

  Scenario: User able to find out 'Jost Wooden 3 Drawer Accent Chest' and validate it
    When User mouse hover on furniture and click on the link of 'cabinetAndChest'
    And User click on 'Marcos 2 Drawer Accent Chest' by selecting its color
    Then user should see the item price with text is "SKU: W001410585"

  Scenario: User able to find out 'Faux leather Armchair' and validate it
    When User mouse hover on furniture and click on the item of 'chair'
    And User select the colors and click on 'Schlater 24" W Faux leather Armchair'
    Then user should see the item price with text is "SKU: W002129268"


  Scenario:User able to find out 'Nesting coffee Tables' and validate it
    When User mouse Hover on 'Furniture' by selecting the link 'Coffee Tables'
    Then User click on 'Maywood Frame 2 Nesting Tables' by its 'color' and 'UnderPrice'
    And user should see the item price with text is "SKU: W002935438"

  Scenario:User able to find out 'Tufted Back Convertible Sofa' and validate it
    When User mouse Hover on 'Furniture' by selecting the link 'sofas and loveSeats'
    Then User click on 'Twin 66.1" Tufted Back Convertible Sofa' by selecting its 'color'
    And user should see the item price with text is "SKU: STF1297"

  Scenario:User able to find out different type of 'TV Stands' and validate it
    When User mouse Hover on 'Furniture' by selecting the link 'TV Stands'
    Then User click on 'Lorraine TV Stand for TVs up to 55" with Electric Fireplace Included' by selecting its 'color'
    And user should see the item price with text is "SKU: LNPK3414"




