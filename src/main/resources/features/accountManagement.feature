Feature: login
    As a user
    I can add and view income and expense
    so that I know how much money I have

Scenario: Add income
    Given a user has 1000 for income
    When I add income amount 100
    Then I have income amount 1100

Scenario: Pay a money less than income
    Given a user has 1000 for income
    When I pay a money amount 200
    Then I have income amount 800
    And my expense is 200

Scenario: Pay a money greater than income
    Given a user has 1000 for income
    When I pay a money amount 1100
    Then I have income amount 0
    And my expense is 1100

Scenario: Check current income
    Given a user has 1000 for income
    When I want to check my current income that is 1000
    Then system shows my current income amount 1000

Scenario: Check current expense
    Given a user has 1000 for income
    When I pay a money amount 200
    Then system shows my current expense amount 200