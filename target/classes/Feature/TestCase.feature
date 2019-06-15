Feature: http://demo.automationtesting.in/ Login feature #keyword represents 

Scenario Outline: Skip sign In 

Given user is on Register page
         #precondition
When title of Register page is Automation Demo Site
        #expected conditions -action performing is when output is Then
Then user enters "<Fisrt name>" and"<Last name>"
Then user clicks on Submit button
Then user is on home page
Then close the browser

Examples:
|Fisrt name|Aiswarya|
|last name|R|