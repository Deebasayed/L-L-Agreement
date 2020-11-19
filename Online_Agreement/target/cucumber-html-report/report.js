$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/Features/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Application Login",
  "description": "",
  "id": "application-login",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "User click on login then login page will be open with mobile number and send otp field",
  "description": "",
  "id": "application-login;user-click-on-login-then-login-page-will-be-open-with-mobile-number-and-send-otp-field",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "Initialize driver",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "close pop up div",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User click on login",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "User landed on welcome to MultiLiving page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "User enter valid mobile number to get otp on there mobile number",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Enter otp field page get displayed with login button",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "After enter correct otp page and click on login then user should displayed My Account tab",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User click on My Account",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "user enters \"\u003cFirst Name\u003e\" and \"\u003cLast Name\u003e\" and \"\u003cEmail id\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "click on submit button",
  "keyword": "Then "
});
formatter.examples({
  "line": 18,
  "name": "",
  "description": "",
  "id": "application-login;user-click-on-login-then-login-page-will-be-open-with-mobile-number-and-send-otp-field;",
  "rows": [
    {
      "cells": [
        "First Name",
        "Last Name",
        "Email id"
      ],
      "line": 19,
      "id": "application-login;user-click-on-login-then-login-page-will-be-open-with-mobile-number-and-send-otp-field;;1"
    },
    {
      "cells": [
        "Deeba",
        "Sayed",
        "deeba@"
      ],
      "line": 20,
      "id": "application-login;user-click-on-login-then-login-page-will-be-open-with-mobile-number-and-send-otp-field;;2"
    },
    {
      "cells": [
        "Test Deeba",
        "Test",
        "deeba@gmail.com"
      ],
      "line": 21,
      "id": "application-login;user-click-on-login-then-login-page-will-be-open-with-mobile-number-and-send-otp-field;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 20,
  "name": "User click on login then login page will be open with mobile number and send otp field",
  "description": "",
  "id": "application-login;user-click-on-login-then-login-page-will-be-open-with-mobile-number-and-send-otp-field;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "Initialize driver",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "close pop up div",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User click on login",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "User landed on welcome to MultiLiving page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "User enter valid mobile number to get otp on there mobile number",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Enter otp field page get displayed with login button",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "After enter correct otp page and click on login then user should displayed My Account tab",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User click on My Account",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "user enters \"Deeba\" and \"Sayed\" and \"deeba@\"",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "click on submit button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefination.initialize_driver()"
});
formatter.result({
  "duration": 15131377700,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.close_pop_up_div()"
});
formatter.result({
  "duration": 91472500,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_click_on_login()"
});
formatter.result({
  "duration": 80206600,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_landed_on_welcome_to_multiliving_page()"
});
formatter.result({
  "duration": 9649800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.Get_otp()"
});
formatter.result({
  "duration": 133289400,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.Enter_otp()"
});
formatter.result({
  "duration": 3787500,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.login()"
});
formatter.result({
  "duration": 16593810300,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_click_on_my_account()"
});
formatter.result({
  "duration": 1620585400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Deeba",
      "offset": 13
    },
    {
      "val": "Sayed",
      "offset": 25
    },
    {
      "val": "deeba@",
      "offset": 37
    }
  ],
  "location": "LoginStepDefination.user_enters_something_and_something_and_something(String,String,String)"
});
formatter.result({
  "duration": 6361500600,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.click_on_submit_button()"
});
formatter.result({
  "duration": 145530500,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "User click on login then login page will be open with mobile number and send otp field",
  "description": "",
  "id": "application-login;user-click-on-login-then-login-page-will-be-open-with-mobile-number-and-send-otp-field;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "Initialize driver",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "close pop up div",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User click on login",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "User landed on welcome to MultiLiving page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "User enter valid mobile number to get otp on there mobile number",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Enter otp field page get displayed with login button",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "After enter correct otp page and click on login then user should displayed My Account tab",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User click on My Account",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "user enters \"Test Deeba\" and \"Test\" and \"deeba@gmail.com\"",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "click on submit button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefination.initialize_driver()"
});
formatter.result({
  "duration": 13945987200,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.close_pop_up_div()"
});
formatter.result({
  "duration": 111633500,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_click_on_login()"
});
formatter.result({
  "duration": 74451200,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_landed_on_welcome_to_multiliving_page()"
});
formatter.result({
  "duration": 7684100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.Get_otp()"
});
formatter.result({
  "duration": 133214200,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.Enter_otp()"
});
formatter.result({
  "duration": 3787200,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.login()"
});
formatter.result({
  "duration": 16566713000,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_click_on_my_account()"
});
formatter.result({
  "duration": 1644927300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test Deeba",
      "offset": 13
    },
    {
      "val": "Test",
      "offset": 30
    },
    {
      "val": "deeba@gmail.com",
      "offset": 41
    }
  ],
  "location": "LoginStepDefination.user_enters_something_and_something_and_something(String,String,String)"
});
formatter.result({
  "duration": 6434473200,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.click_on_submit_button()"
});
formatter.result({
  "duration": 146030800,
  "status": "passed"
});
});