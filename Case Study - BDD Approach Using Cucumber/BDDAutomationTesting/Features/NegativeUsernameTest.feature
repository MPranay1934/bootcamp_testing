Feature: Login User with Invalid Username

Scenario: Login with Invalid Username

Given User should Launch Edge browser
When User should Navigate to url 'https://practicetestautomation.com/practice-test-login/'
Then Enter username 'incorrectUser'
And Enter password 'Password123'
And Click 'Submit' button
Then Verify error message is displayed
And Verify error message text is 'Your username is invalid!'