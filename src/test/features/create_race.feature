Feature: Create Race

  Scenario: Name the Race
    Given I have a race with no name
    When  I try to name the race
    Then  I must see the race using the new name

  Scenario: Add first player
    Given I have no players
    When  I try to add a new player
    Then  I must see the new player added

#  Scenario: Add another player
#    Given I have a player
#    When  I try to add another player
#    Then  I must see both players in the list