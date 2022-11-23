Feature: Swaggy

  Scenario:  Verify user is able to add item to cart
    Given Login to the Application
    When user add an items to cart
    And validate added item in cart page


  Scenario: Verify user is able to add multiple items to cart Steps
    Given Login to the Application
    When user add multiple items to cart
    And validate added item in cart page



  Scenario: Verify user is able to filt er the items based on price
    Given Login to the Application
    When User will select the price range as low to high from filter


  Scenario: Verify user is able to filter the items based on alphabetical order
    Given Login to the Application
    When select the alphabetical order option from filter


  Scenario:  Verify user is able to place an order with items in cart
    Given Login to the Application
    When user add an items to cart
    And  validate added item in cart page
    And verify the item in cart page
    And  User will click on checkout
    And user provides the details
    Then user will place the order

