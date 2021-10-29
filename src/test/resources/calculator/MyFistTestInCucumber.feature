Feature: Calculator test

@calculator
  Scenario: 2 + 2 = 4
    Given we have 2
    And we add 3
    Then the value should be 4
  @calculator
  Scenario: 2 + 3 = 5
    Given we have 2
    And we add 3
    Then the value should be 5
  @calculator
  Scenario: 2 + 0 = 2
    Given we have 2
    And we add 0
    Then the value should be 5
