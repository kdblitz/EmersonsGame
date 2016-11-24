Feature: Create Game Redirection

  Scenario: Redirect to create game view
    Given I am in the view all races page
    When  I try create a new game
    Then  I must be redirected to the create game page
