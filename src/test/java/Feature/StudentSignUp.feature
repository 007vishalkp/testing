Feature: LearnNew SignUp page
  Student will enter the details to SignUp into the website

  Scenario: Student will use email and password to SignUp
    Given Student is at the signUp page
    When Student enters the details
    Then Student SignUp successful

    Scenario: Student will SignUp through Facebook
      Given Student is at the SignUp page via facebook
      When Student enters the credentials
      Then Student SignUp successful

      Scenario: Student will SignUp through Gmail
        Given Student is at the SignUp page via Gmail
        When Student enters the credentials
        Then Student SignUp successful