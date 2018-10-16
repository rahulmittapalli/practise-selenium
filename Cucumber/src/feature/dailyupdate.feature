Feature:Attitude matters

In order to Understand his attitude
As a ITworking guy 
I want to know whom he is wishing


@tester
Scenario Outline:I am Employee and his attitude

Given I work in latenight
When i met nightwatchmen
Then i greet him wishes
Given I work in morning
When i met watchman
Then i greet not him wishes

Given we work in <weekday>
When we met <guy>
Then i greet him

Examples:
 |weekday |   guy     |
 |tenpm   |watchmen  |
 |ninepm  |  cabdriver|

