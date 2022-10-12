Feature: abl

Background: open blanck browser
Given i am in background

@login
Scenario: login page
Given open loginpage
When enter uname and password
Then user is on HomePage

@home
Scenario:HomePage
Given homepage in home
