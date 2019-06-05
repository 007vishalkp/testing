Feature: Learnyst login page
  To login into learnyst we have to enter the details

  Scenario: login with valid credentials
    Given User is at the login page
    When User gives valid credentials
    Then The user should login successfully