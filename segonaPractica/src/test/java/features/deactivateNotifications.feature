Feature: deactivateNotifications

Scenario: Deactivate notifications

Given the user is in the index page
When the user clicks the login automation tab
##And the user fills the form
##And the user clicks the SignIn button
And the user clicks his name
And the user clicks the MyAccount button
And the user clicks the Notifications option
And the user clicks the check option
And the user clicks the SaveChange button
Then the notifications has been activated or deactivated