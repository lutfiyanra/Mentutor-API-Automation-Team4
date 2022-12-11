@Tugas
Feature: Get All Classes Tests

  @GetAllClasses @Positive
  Scenario: Get all class using authorization
    Given Get all class with authorization
    When Send get all class request
    Then Status code should be 200 OK

  @GetAllClasses @Negative
  Scenario: Get all class not using authorization
    Given Get all class without authorization
    When Send get all class request
    Then Status code should be 400 Bad Request
