@Tugas
Feature: Create New Class

  @CreateNewClass @Positive
  Scenario: Create New Class with Valid Data and Authentication
    Given Post create new class with valid data
    When Send post create new class request using authorization
    Then Respons body code should be 201 created

  @CreateNewClass @Negative
  Scenario: Create New Class with Valid Data without Authentication
    Given Post create new class with valid data not using authentication
    When Send post create new class request without authorization
    Then Should return respons body code 400 bad request

  @CreateNewClass @Negative
  Scenario: Create New Class with Invalid Data by Numeric
    Given Post create new class with invalid data by numeric input
    When Send post create new class request using authorization
    Then Should return respons body code 400 bad request

  @CreateNewClass @Negative
  Scenario: Create New Class with Invalid Data by Special Char
    Given Post create new class with invalid data by special char input
    When Send post create new class request using authorization
    Then Should return respons body code 400 bad request

  @CreateNewClass @Negative
  Scenario: Create New Class with Empty Input
    Given Post create new class with invalid data by empty input
    When Send post create new class request using authorization
    Then Should return respons body code 400 bad request