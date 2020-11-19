Feature: Basic sanity testing Contact_Us


Scenario Outline:Test schedule a call with valid credentials

Given Open the chrome and start application
Given : click on contact Us
When : Div should be open

When : User enters valid/invalid "<Full Name>" and "<Mobile Number>"
Then : Click on submit button

Examples:

|Full Name  | Mobile Number     |
|Test Deebas |8652271227        |
|Test Deeba2 |8654564564545645445|