Feature: Test Home basic sanity testing
Scenario Outline: Basic Testing on home page 

Given : Open the the browser with chrome
And : Navigate to url
Given : click on Home Page
When : click on read more button
When : User enters valid/invalid "<Full Name>" and "<Email Address>" and "<Mobile Number>" "<Your Query>"
Then : Click on submit button 



Examples:

|Full Name  | Email Address     | Mobile Number| Your Query |
|Test Deebs | deeba@gmail.com   |8652271222| test purp      |
|@@24234    |deeba@             |86555555   |test           |



