Feature: Register User

Scenario: Successful Registration

Given User should Launch Edge browser
When User should Navigate to url 'http://automationexercise.com'
Then Verify home page is visible successfully
And Click on 'Signup / Login' button
Then Verify 'New User Signup!' is visible
And Enter name and email address
And Click 'Signup' button
Then Enter account and address information
And Click 'Create Account' button
Then Verify 'ACCOUNT CREATED!' is visible
And Click 'Continue' button
Then Verify that 'Logged in as username' is visible	