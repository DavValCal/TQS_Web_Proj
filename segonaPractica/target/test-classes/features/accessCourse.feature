Feature: accesCourse

Scenario: Access to a Course content

Given the user is in the index page
When the user hovers over the Learning option
And the user clicks on the Courses button
And the user enters java in the search bar
And the user clicks the Course
And the user clicks the unroll for free button
And the user fill the form
And the user clicks the SignUp button
And the user enters the password
And the user clicks the Complete SetUp button
Then the course content appears