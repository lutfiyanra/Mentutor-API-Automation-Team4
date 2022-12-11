@Tugas
Feature: Post Login Mentee
  @login @positive
  Scenario: Post login mentee with valid value
    Given Post login with all valid value as mentee
    When Send request post login
    Then Should return 200 OK
    And Validate post login valid value json schema