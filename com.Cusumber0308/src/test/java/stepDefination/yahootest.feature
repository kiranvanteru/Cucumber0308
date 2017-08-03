Feature: Yahoo Login

Scenario: Login with valid username and password

Given user opens login page
Then user Enter loginid
Then user Enter password
And  user clicks on signin button
And close the browser
 

Scenario: Login title page

Given user opens login page
Then get the title of login page and verify
And  close the browser

