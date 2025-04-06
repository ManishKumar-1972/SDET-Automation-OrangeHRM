Feature: OrangeHRM Login

  Scenario: Successful login with valid credentials
    Given I launch the OrangeHRM login page
    When I enter valid username and password
    Then I should be redirected to the dashboard

  Scenario: Login with invalid credentials
    Given I launch the OrangeHRM login page
    When I enter username "invalid" and password "invalid123"
    Then I should see an error message

  Scenario: Login with empty credentials
    Given I launch the OrangeHRM login page
    When I submit empty login form
    Then I should see required field validation errors