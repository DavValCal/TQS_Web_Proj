Feature: accesCourseWithExistingAccount

Scenario: Access to a Course content with an existing account

Given the user is in the index page
When the user hovers over the Learning option
And the user clicks on the Courses button
And the user enters java in the search bar
And the user clicks the Course
And the user clicks the unroll for free button

And the user fill the email input
Then automatically the password input appears