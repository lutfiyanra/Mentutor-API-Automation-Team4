@Tugas
Feature: Profile Mentee

  @UpdateProfile
  Scenario: Put update profile mentee with authorization
    Given Put update profile mentee with authorization
    When Send put update profile request
    Then Status code put update profile should be 201 Created

  @UpdateProfile
  Scenario: Put update profile mentee without authorization
    Given Put update profile mentee without authorization
    When Send put update profile request
    Then Status code put update profile should be 400 Bad Request