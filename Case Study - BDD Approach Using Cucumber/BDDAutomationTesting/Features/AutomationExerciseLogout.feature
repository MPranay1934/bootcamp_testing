Feature: Logout User

Scenario: Successful Logout

Given User should Launch Edge browser
When User should Navigate to url 'http://automationexercise.com'
When User should Verify home page is visible successfully
Then Click on 'Signup / Login' button
Then Verify 'Login to your account' is visible
And Enter correct email address and password
When Click 'login' button
When Verify that 'Logged in as username' is visible
Then Click on 'Logout' button
Then Verify that user is navigated to login page
And Verify 'Login to your account' is visible