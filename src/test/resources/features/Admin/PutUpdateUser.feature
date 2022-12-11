@Tugas
Feature: Admin Update User

  @AdminUpdateUser @Positive
  Scenario: Update user with valid data and authorization
    Given Update user with valid data and authenticated to id user 62
    When Send update request
    Then Status code should be 201 Created
