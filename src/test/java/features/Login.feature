@LoginFeature
Feature: Login Feature Scenarios

Background: Open the Login page
    Given User has opened swaglabs

  Scenario Outline: Positive Login Functionality
    When User has entered correct "<Username>" and "<Password>"
    And User click on Login Button
    Then Validating if that user has been  navigated to product page

    Examples: 
      | Username      | Password     |
      | standard_user | secret_sauce |

  Scenario Outline: Negative Login Functionality
    When User has entered wrong "<username>" and "<password>"
    And User click on Login Button
    Then Validating if that user is  getting "<Error>"

    Examples: 
      | username         | password     | Error                                                                     |
      | standard_user222 | secretsauce1 | Epic sadface: Username and password do not match any user in this service |
