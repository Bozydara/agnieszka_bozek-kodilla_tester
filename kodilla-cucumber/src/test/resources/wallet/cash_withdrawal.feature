Feature: Cash Withdrawal

  Scenario Outline: Successful withdrawal from a wallet with credit
    Given I have deposited <depositedAmount> in my wallet
    When I request <requestedAmount>
    Then <dispensedAmount> should be dispensed
    Examples:
      | depositedAmount | requestedAmount | dispensedAmount |
      | $200            | $30             | $30             |
      | $20             | $40             | $20             |
      | $0              | $100            | $0              |
      | $15             | $15             | $15             |