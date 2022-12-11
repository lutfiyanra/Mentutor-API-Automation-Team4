@Tugas
Feature: Delete Specific Task

  @DeleteSpecificTask @Positive
  Scenario: Delete specific task with valid id
    Given Delete specific task with id_task 10
    When Send delete specific task request
    Then Status delete specific task code should be 200 OK

  @DeleteSpecificTask @Negatif
  Scenario: Delete specific task without id
    Given Delete specific task without id_task
    When Send delete specific task without id request
    Then Status delete specific task code should be 405 Method Not Allowed

  @DeleteSpecificTask @Negatif
  Scenario: Delete specific task invalid path
    Given Delete specific task with id_task 11 and invalid path
    When Send delete specific task with invalid path request
    Then Status delete specific task code should be 404 Not Found