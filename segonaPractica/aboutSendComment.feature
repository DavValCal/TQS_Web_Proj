Feature: aboutSendComment

Scenario: Checks if can write comment in about tab
Given the user is in the index page
When the user clicks the about tab
And the user clicks the name input
And the user fills the comment form
Then the comment was submitted