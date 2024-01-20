Feature: Login

Scenario: Login recaptcha/incorrect data detection

Given the user is in the index page 
When the user clicks the login automation tab
And the user fills the login form
Then the user clicks submit button