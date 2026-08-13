Feature: Login User with Valid Credentials

Scenario: Successful Login with Valid Credentials

Given User should Launch Edge browser
When User should Navigate to url 'https://practicetestautomation.com/practice-test-login/'
Then Enter username 'student'
And Enter password 'Password123'
And Click 'Submit' button
Then Verify URL contains 'practicetestautomation.com/logged-in-successfully/'
And Verify 'Congratulations' or 'successfully logged in' is visible
Then Verify 'Log out' button is displayed