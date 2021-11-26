$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/Products.feature");
formatter.feature({
  "name": "Product Selection",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@ProductSelection"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Positive Login Functionality",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User has entered correct \"\u003cUsername\u003e\" and \"\u003cPassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User click on Login Button",
  "keyword": "And "
});
formatter.step({
  "name": "user add a product \"\u003cProduct Name\u003e\" to the cart",
  "keyword": "And "
});
formatter.step({
  "name": "Product should be added to cart",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Username",
        "Password",
        "Product Name"
      ]
    },
    {
      "cells": [
        "standard_user",
        "secret_sauce",
        "Sauce Labs Backpack"
      ]
    }
  ]
});
formatter.background({
  "name": "Open the Login page",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User has opened swaglabs",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefs.user_has_opened_swaglabs()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Positive Login Functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@ProductSelection"
    }
  ]
});
formatter.step({
  "name": "User has entered correct \"standard_user\" and \"secret_sauce\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefs.user_has_entered_correct_something_and_something(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on Login Button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefs.user_click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user add a product \"Sauce Labs Backpack\" to the cart",
  "keyword": "And "
});
formatter.match({
  "location": "SelectProduct.user_add_a_product_something_to_the_cart(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Product should be added to cart",
  "keyword": "Then "
});
formatter.match({
  "location": "SelectProduct.product_should_be_added_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});