@Tugas
Feature: Forum mentee

  @CommentStatus
  Scenario Outline: Post comment status with input alphabet
    Given Post comment status with input alphabet with <id_status>
    When send post comment mentee
    Then Status code post comment should be 201 Created
    Examples:
      | id_status |
      | 15        |

  @CommentStatus
  Scenario Outline: Post comment status with input numeric
    Given Post comment status with input numeric with <id_status>
    When send post comment mentee
    Then Status code post comment should be 201 Created
    Examples:
      | id_status |
      | 15        |

  @CommentStatus
  Scenario Outline: Post comment status with input special character
    Given Post comment status with input special character with <id_status>
    When send post comment mentee
    Then Status code post comment should be 201 Created
    Examples:
      | id_status |
      | 15        |

  @CommentStatus
  Scenario Outline: Post comment status with invalid id status
    Given Post comment status with invalid <id_status>
    When send post comment mentee
    Then Status code should be 400 Bad Request
    Examples:
      | id_status   |
      | "fg!@#$123" |

  @CommentStatus
  Scenario Outline: Post comment status with invalid path
    Given Post comment status with invalid path and valid <id_status>
    When send post comment mentee with invalid path
    Then Status code should be 404 Not found
    Examples:
      | id_status |
      | 15        |

  @GetAllStatus
  Scenario: Get all status with Authorization
    Given Get all status with authorization
    When Send get all status request
    Then Status code get all status should be 200 OK

  @GetAllStatus
  Scenario: Get all status without Authorization
    Given Get all status without authorization
    When Send get all status request
    Then Status code get all status should be 400 Bad Request

  @PostStatus
  Scenario: Post status with authorization
    Given Post status with authorization
    When Send post status request
    Then Status code post status should be 201 Created

  @PostStatus
  Scenario: Post status without authorization
    Given Post status without authorization
    When Send post status request
    Then Status code post status should be 400 Bad Request