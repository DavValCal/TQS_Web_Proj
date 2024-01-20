Feature: blogVideo

Scenario: Check if blogs entry video is being played
Given the user is in the index page
When the user clicks the blog tab
And the user clicks the blog entry
And the user plays video
Then the video is playing