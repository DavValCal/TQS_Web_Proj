Feature: Signup

Scenario: Signup recaptcha/incorrect data detection

Given the user is in the index page
When the user clicks the login automation tab
And the user clicks xpath button
And the user fills the form signUp
Then the user clicks the submit button