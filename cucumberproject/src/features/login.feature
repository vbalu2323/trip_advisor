Feature: free crm login page

Scenario: free crm login test scenario
 
 Given user is already on login page
 When title of login page is free crm
 And  user enter username and password
 And user click on login button
 Then user is on home page 
 
 