@Tugas
Feature: Post Login Admin

  @login @positive
  Scenario: Post login admin with valid value
    Given Post login with all valid value as admin
    When Send request post login
    Then Should return 200 OK
    And Validate post login valid value json schema

  @login @negative
  Scenario: Post login admin with invalid email value
    Given Post login with invalid email as admin
    When Send request post login
    Then Should return respons body code 404 not found

  @login @negative
  Scenario: Post login with invalid password value
    Given Post login as admin with invalid password
    When Send request post login
    Then Should return respons body code 400 bad request

  #ditanyakan invalid all data kok response di postman 400 tapi di automation 404
  @login @negative
  Scenario: Post login with invalid all data
    Given Post login as admin with invalid all data
    When Send request post login
    Then Should return respons body code 400 bad request

  @login @negative
  Scenario: Post login with empty email
    Given Post login as admin with empty email
    When Send request post login
    Then Should return respons body code 400 bad request

  @login @negative
  Scenario: Post login with empty password
    Given Post login as admin with empty password
    When Send request post login
    Then Should return respons body code 400 bad request

  @login @negative
  Scenario: Post login with empty data
    Given Post login as admin with empty data
    When Send request post login
    Then Should return respons body code 400 bad request