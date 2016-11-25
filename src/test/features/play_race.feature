Feature: Play race

Scenario Outline: Play race
  Given Player chooses <speed type> speed
  And   Player has <current damage> damage
  When  Player rolls <roll>
  Then  Player moves <step> steps
  And   Player gets <new damage> damage

Examples:
  | speed type | current damage | roll | step | new damage |
  | normal     | 0              | 1    | 1    | 0          |
  | normal     | 0              | 2    | 2    | 0          |
  | normal     | 0              | 3    | 1    | 0          |
  | normal     | 0              | 4    | 2    | 0          |
  | normal     | 0              | 5    | 1    | 0          |
  | normal     | 0              | 6    | 2    | 0          |
  | normal     | 1              | 1    | 0    | 1          |
  | normal     | 2              | 1    | 0    | 2          |
  | super      | 0              | 1    | 1    | 1          |
  | super      | 0              | 2    | 2    | 1          |
  | super      | 0              | 3    | 3    | 1          |
  | super      | 0              | 4    | 4    | 1          |
  | super      | 0              | 5    | 5    | 1          |
  | super      | 0              | 6    | 6    | 1          |
  | super      | 1              | 6    | 5    | 2          |
  | super      | 6              | 6    | 0    | 7          |
  | super      | 7              | 6    | 0    | 8          |
