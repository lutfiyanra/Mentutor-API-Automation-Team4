@Tugas
Feature: Register New User

  @AdminRegisterNewUser @Positive
  Scenario: Post create new user using valid data in body JSON with authorization
    Given Post create new user with valid data
    When Send post create new user request using authorization
    Then Respons body code should be 201 created

  @AdminRegisterNewUser @Negative
  Scenario: Post create new user using valid data without authorization
    Given Post create new user with valid data not using authorization
    When Send post create new user request without authorization
    Then Status code should be 400 Bad Request

  @AdminRegisterNewUser @Negative
  Scenario: Post create new user with empty name in body JSON
    Given Post create new user with empty name input
    When Send post create new user request using authorization
    Then Status code should be 400 Bad Request

  @AdminRegisterNewUser @Negative
  Scenario: Post create new user with empty email in body JSON
    Given Post create new user with empty email input
    When Send post create new user request using authorization
    Then Status code should be 400 Bad Request

  @AdminRegisterNewUser @Negative
  Scenario: Post create new user with empty password in body JSON
    Given Post create new user with empty password input
    When Send post create new user request using authorization
    Then Status code should be 400 Bad Request

  @AdminRegisterNewUser @Negative
  Scenario: Post create new user with empty id class in body JSON
    Given Post create new user with empty id class input
    When Send post create new user request using authorization
    Then Status code should be 400 Bad Request

  @AdminRegisterNewUser @Negative
  Scenario: Post create new user with empty role in body JSON
    Given Post create new user with empty role input
    When Send post create new user request using authorization
    Then Status code should be 400 Bad Request

  @AdminRegisterNewUser @Negative
  Scenario: Post create new user with alpha numeric on name in body JSON
    Given Post create new user with alpha numeric in name input
    When Send post create new user request using authorization
    Then Status code should be 400 Bad Request

  @AdminRegisterNewUser @Negative
  Scenario: Post create new user with alphabet and special char on name in body JSON
    Given Post create new user with alphabet and special char in name input
    When Send post create new user request using authorization
    Then Status code should be 400 Bad Request

  @AdminRegisterNewUser @Negative
  Scenario: Post create new user with numeric on name in body JSON
    Given Post create new user with numeric in name input
    When Send post create new user request using authorization
    Then Status code should be 400 Bad Request

  @AdminRegisterNewUser @Negative
  Scenario: Post create new user with special char on name in body JSON
    Given Post create new user with special char in name input
    When Send post create new user request using authorization
    Then Status code should be 400 Bad Request

  @AdminRegisterNewUser @Negative
  Scenario: Post create new user without email suffix on email in body JSON
    Given Post create new user without email suffix in email input
    When Send post create new user request using authorization
    Then Status code should be 400 Bad Request

  @AdminRegisterNewUser @Negative
  Scenario: Post create new user without uppercase on password in body JSON
    Given Post create new user without uppercase in password input
    When Send post create new user request using authorization
    Then Status code should be 400 Bad Request

  @AdminRegisterNewUser @Negative
  Scenario: Post create new user without numeric on password in body JSON
    Given Post create new user without numeric in password input
    When Send post create new user request using authorization
    Then Status code should be 400 Bad Request

  @AdminRegisterNewUser @Negative
  Scenario: Post create new user without special char on password in body JSON
    Given Post create new user without special char in password input
    When Send post create new user request using authorization
    Then Status code should be 400 Bad Request

  @AdminRegisterNewUser @Negative
  Scenario: Post create new user alphabet on class id in body JSON
    Given Post create new user with alphabet in class id input
    When Send post create new user request using authorization
    Then Status code should be 400 Bad Request

  @AdminRegisterNewUser @Negative
  Scenario: Post create new user special char on class id in body JSON
    Given Post create new user with special char in class id input
    When Send post create new user request using authorization
    Then Status code should be 400 Bad Request

  @AdminRegisterNewUser @Negative
  Scenario: Post create new user numeric on role in body JSON
    Given Post create new user with numeric in role input
    When Send post create new user request using authorization
    Then Status code should be 400 Bad Request

  @AdminRegisterNewUser @Negative
  Scenario: Post create new user special char on role in body JSON
    Given Post create new user with special char in role input
    When Send post create new user request using authorization
    Then Status code should be 400 Bad Request