Feature: Application Login


Scenario Outline: User click on login then login page will be open with mobile number and send otp field

Given Initialize driver
Given close pop up div

Given User click on login 
Given User landed on welcome to MultiLiving page
When User enter valid mobile number to get otp on there mobile number
Then Enter otp field page get displayed with login button 
And After enter correct otp page and click on login then user should displayed My Account tab
Given User click on My Account 

When user enters "<First Name>" and "<Last Name>" and "<Email id>"
Then click on submit button
Examples:
|First Name	|Last Name  |Email id		    |
|Deeba		|Sayed		|deeba@	            |
|Test Deeba	|Test		|deeba@gmail.com				|
		







