Feature: showOrderHistory

Scenario: Show Order History

Given the user is in the index page
When the user clicks the login automation tab
##And the user fills the form
##And the user clicks the SignIn button
And the user clicks his name
And the user clicks the MyAccount button
And the user clicks the OrderHistory option
Then the Order History page appears