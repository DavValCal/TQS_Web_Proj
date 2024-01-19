Feature: signIn_signOut

Scenario: Sign In and then Sign Out

Given the user is in the index page
When the user clicks the login automation tab
##And the user fills the form
##And the user clicks the SignIn button
And the user clicks his name
And the user clicks the SignOut button
Then the user has been sign out