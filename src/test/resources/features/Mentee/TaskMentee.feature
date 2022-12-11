@Tugas
Feature: Mentutor Task Mentee

  @GetAllTask
  Scenario: Get all task with Authorization
    Given Get all task with authorization
    When Send get all task request
    Then Status code should be 200 OK

  @GetAllTask
  Scenario: Get all task without Authorization
    Given Get all task without authorization
    When Send get all task request
    Then Status code should be 400 Bad Request

  @InputTask
  Scenario Outline: Post input task with file pdf
    Given Post task file PDF with id_task <id_task>
    When send post task mentee
    Then Status code should be 201 Created
    Examples:
      | id_task |
      | 137      |

  @InputTask
  Scenario Outline: Post input task with file docx
    Given Post input task file DOCX with id_task <id_task>
    When send post task mentee
    Then Status code should be 201 Created
    Examples:
      | id_task |
      | 139     |

  @InputTask
  Scenario Outline: Post input task with file xlsx
    Given Post input task file XLSX with id_task <id_task>
    When send post task mentee
    Then Status code should be 201 Created
    Examples:
      | id_task |
      | 140     |

  @InputTask
  Scenario Outline: Post input task with file pptx
    Given Post input task file PPTX with id_task <id_task>
    When send post task mentee
    Then Status code should be 201 Created
    Examples:
      | id_task |
      | 141      |

  @InputTask
  Scenario Outline: Post input task with file PNG
    Given Post input task file PNG with id_task <id_task>
    When send post task mentee
    Then Status code should be 201 Created
    Examples:
      | id_task |
      | 142      |

