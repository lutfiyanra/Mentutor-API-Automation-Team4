@Tugas
Feature: Get Task Detail

  @GetTaskDetail @positive
  Scenario: Get Task Detail with Valid Path
    Given Get task detail from id task 112
    When User send request get task detail
    Then Status code should be 201 Created

  @GetTaskDetail @negative
  Scenario: Get Task Detail with valid Path without token
    Given Get task detail from id task 112 without token
    When User send request get task detail
    Then Status code should be 400 Bad Request