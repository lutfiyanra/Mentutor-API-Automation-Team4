@Tugas
Feature: Get All Users Test

  @GetAllUsers @Positive
  Scenario: Get all users using authorization
    Given Get all users with authorization
    When Send get all users request
    Then Status code should be 200 OK

  @GetAllUsers @Negative
  Scenario: Get all users not using authorization
    Given Get all users without authorization
    When Send get all users request
    Then Status code should be 400 Bad Request