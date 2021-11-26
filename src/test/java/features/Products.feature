@ProductSelection
Feature: Product Selection

  Background: Open the Login page
    Given User has opened swaglabs

  Scenario Outline: Positive Login Functionality
    When User has entered correct "<Username>" and "<Password>"
    And User click on Login Button
    And user add a product "<Product Name>" to the cart
    Then Product should be added to cart

    Examples: 
      | Username      | Password     | Product Name        |
      | standard_user | secret_sauce | Sauce Labs Backpack |

