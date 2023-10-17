Feature: Log In in app Loop Kaban Board

  @green
  Scenario: Successful Log In
    Given Sergey log in on kanban board
    When he enters his user cbarahona@calengs.com
    And enters his pass "testenvpass"
    Then he should be able to log in in his account

  Scenario: Failed Log In
    Given Sergey log in on kanban board
    When he enters his user lizmarie@dsfjhf.com
    And enters his pass "numb23"
    Then he shouldnt be able to log in app

