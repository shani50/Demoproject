Feature: Login to HRM

  @ValidCredentials
  Scenario: Login with valid credentials

    Given User is on Home page
    When User enters username as "Admin"
    And User enters password as "admin123"
    Then User should be able to login successfully
