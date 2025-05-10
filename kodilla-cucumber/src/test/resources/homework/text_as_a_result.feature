Feature:Text as a result of number division.

  Scenario Outline: Number division by 3 and 5 returns different text according to the criteria.

    Given the number is <number>
    When  I divide it by 3 and 5
    Then  I should receive <text>
    Examples:
      | number | text       |
      | 3      | "Fizz"     |
      | 5      | "Buzz"     |
      | 15     | "FizzBuzz" |
      | 0      | "FizzBuzz" |
      | 20     | "Buzz"     |
      | -5     | "Buzz"     |
      | 4      | "None"     |
      | 12     | "Fizz"     |
      | 44     | "None"     |