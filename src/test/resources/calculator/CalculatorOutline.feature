Feature:  Scenario outline example

  @calculatorOutline
  Scenario Outline: Calculator outline test
    Given we have <value1>
    And we add <value2>
    Then the value should be <expectedResult>

    Examples:
      | value1 | value2 | expectedResult |
      |    3   |    3   |   6            |
      |    0   |    1   |   4            |
      |    3   |    3   |   6            |
      |    1   |    1   |   2            |
      |    30   |    30   |   60            |
      |    10   |    1   |   11           |
      |    3   |    3   |   0            |
      |    0   |    1   |   0            |
      |    3   |    3   |   0            |
      |    0   |    1   |   0            |