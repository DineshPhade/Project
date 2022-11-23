$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/Feature/Swaggy.feature");
formatter.feature({
  "line": 1,
  "name": "Swaggy",
  "description": "",
  "id": "swaggy",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5294304400,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Verify user is able to add item to cart",
  "description": "",
  "id": "swaggy;verify-user-is-able-to-add-item-to-cart",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Login to the Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user add an items to cart",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "validate added item in cart page",
  "keyword": "And "
});
formatter.match({
  "location": "Swaggydef.Login_to_the_Application()"
});
formatter.result({
  "duration": 15835461100,
  "status": "passed"
});
formatter.match({
  "location": "Swaggydef.user_add_an_items_to_cart()"
});
formatter.result({
  "duration": 3199120600,
  "status": "passed"
});
formatter.match({
  "location": "Swaggydef.validate_added_item_in_cart_page()"
});
formatter.result({
  "duration": 3339656900,
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 416954000,
  "status": "passed"
});
formatter.before({
  "duration": 2600699500,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Verify user is able to add multiple items to cart Steps",
  "description": "",
  "id": "swaggy;verify-user-is-able-to-add-multiple-items-to-cart-steps",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "Login to the Application",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "user add multiple items to cart",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "validate added item in cart page",
  "keyword": "And "
});
formatter.match({
  "location": "Swaggydef.Login_to_the_Application()"
});
formatter.result({
  "duration": 12518072700,
  "status": "passed"
});
formatter.match({
  "location": "Swaggydef.user_add_multiple_items_to_cart()"
});
formatter.result({
  "duration": 7302312000,
  "status": "passed"
});
formatter.match({
  "location": "Swaggydef.validate_added_item_in_cart_page()"
});
formatter.result({
  "duration": 3537060200,
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "duration": 499181700,
  "status": "passed"
});
formatter.before({
  "duration": 1688488200,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Verify user is able to filt er the items based on price",
  "description": "",
  "id": "swaggy;verify-user-is-able-to-filt-er-the-items-based-on-price",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 17,
  "name": "Login to the Application",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "User will select the price range as low to high from filter",
  "keyword": "When "
});
formatter.match({
  "location": "Swaggydef.Login_to_the_Application()"
});
formatter.result({
  "duration": 12520817300,
  "status": "passed"
});
formatter.match({
  "location": "Swaggydef.User_will_select_the_price_range_as_low_to_high_from_filter()"
});
formatter.result({
  "duration": 9246199000,
  "status": "passed"
});
formatter.embedding("image/png", "embedded2.png");
formatter.after({
  "duration": 527856900,
  "status": "passed"
});
formatter.before({
  "duration": 2309230500,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Verify user is able to filter the items based on alphabetical order",
  "description": "",
  "id": "swaggy;verify-user-is-able-to-filter-the-items-based-on-alphabetical-order",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 22,
  "name": "Login to the Application",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "select the alphabetical order option from filter",
  "keyword": "When "
});
formatter.match({
  "location": "Swaggydef.Login_to_the_Application()"
});
formatter.result({
  "duration": 12570278600,
  "status": "passed"
});
formatter.match({
  "location": "Swaggydef.select_the_alphabetical_order_option_from_filter()"
});
formatter.result({
  "duration": 3286706000,
  "status": "passed"
});
formatter.embedding("image/png", "embedded3.png");
formatter.after({
  "duration": 489697800,
  "status": "passed"
});
formatter.before({
  "duration": 1768663700,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "Verify user is able to place an order with items in cart",
  "description": "",
  "id": "swaggy;verify-user-is-able-to-place-an-order-with-items-in-cart",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 27,
  "name": "Login to the Application",
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "user add an items to cart",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "validate added item in cart page",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "verify the item in cart page",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "User will click on checkout",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "user provides the details",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "user will place the order",
  "keyword": "Then "
});
formatter.match({
  "location": "Swaggydef.Login_to_the_Application()"
});
formatter.result({
  "duration": 12648802100,
  "status": "passed"
});
formatter.match({
  "location": "Swaggydef.user_add_an_items_to_cart()"
});
formatter.result({
  "duration": 3207452300,
  "status": "passed"
});
formatter.match({
  "location": "Swaggydef.validate_added_item_in_cart_page()"
});
formatter.result({
  "duration": 3397627500,
  "status": "passed"
});
formatter.match({
  "location": "Swaggydef.verify_the_item_in_cart_page()"
});
formatter.result({
  "duration": 143946200,
  "status": "passed"
});
formatter.match({
  "location": "Swaggydef.User_will_click_on_checkout()"
});
formatter.result({
  "duration": 205546900,
  "status": "passed"
});
formatter.match({
  "location": "Swaggydef.user_provides_the_details()"
});
formatter.result({
  "duration": 14455142400,
  "status": "passed"
});
formatter.match({
  "location": "Swaggydef.user_will_place_the_order()"
});
formatter.result({
  "duration": 3305151400,
  "status": "passed"
});
formatter.embedding("image/png", "embedded4.png");
formatter.after({
  "duration": 373121500,
  "status": "passed"
});
});