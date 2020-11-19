Feature: Test Apartmnet basic sanity testing
Scenario Outline: Basic Testing  on appartment page

Given : Open the chrome and start application
Given : click on Apartments
When : Search data by Aapply filter

When : User enters valid/invalid "<Full Name>" and "<Mobile Number>"
Then : Click on schedule call button

Examples:

|Full Name  | Mobile Number     |
|Test Deebs |8652271227         |
|@@24234    |8654564564545645445|
|           |                   |  
