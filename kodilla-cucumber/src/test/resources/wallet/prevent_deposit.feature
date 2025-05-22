Feature: Prevent users from deposit money in unacceptable currency
  Scenario: User tries to deposit money in currency that is not acceptable
    Given I check the balance
    When I deposit CHF 500 in my wallet
    Then nothing should be deposited
    And I should be noticed about unacceptable currency