Feature: Login User with Incorrect Email

Scenario: Login with Incorrect Email and Correct Password

Given User should Launch Edge browser
When User should Navigate to url 'http://automationexercise.com'
Then Verify home page is visible successfully
And Click on 'Signup / Login' button
Then Verify 'Login to your account' is visible
And Enter incorrect email address and correct password
And Click 'Login' button
Then Verify 'Your email or password is incorrect!' is visible