Feature: Basic sanity testing rental agreement 

Scenario Outline:User should enter valid credental
Given Open the chrome and start application
Given : click on rental agreement
When : User should select value from drop down
When : User enters valid/invalid "<First Name>" and "<Last Name>" and "<Mobile Number>" and "<Mail ID>"
Then : Click on Save and Continue button 
Then : Close browse

Examples:

|First Name   | Last Name      | Mobile Number  | Mail ID               |
|Test Deeba   |Sayed           |8652271255      |deebasayed180@gmail.com|
|8652222222222|866455465       |8654564564545645|deeba@                 |
