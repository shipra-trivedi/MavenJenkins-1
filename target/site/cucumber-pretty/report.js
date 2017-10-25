$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LogIn_Test.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 19,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 21,
  "name": "Login Action",
  "description": "",
  "id": "login-action",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 23,
  "name": "Successful Login with Valid Credentials by data table",
  "description": "",
  "id": "login-action;successful-login-with-valid-credentials-by-data-table",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 24,
  "name": "User is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "User Navigate to LogIn Page",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "User enters Credentials to LogIn",
  "rows": [
    {
      "cells": [
        "shubham3",
        "Test@153",
        "testdata3"
      ],
      "line": 27
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "Message displayed Login Successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "Test_Steps.user_is_on_Home_Page()"
});
formatter.result({
  "duration": 15453654160,
  "status": "passed"
});
formatter.match({
  "location": "Test_Steps.user_Navigate_to_LogIn_Page()"
});
formatter.result({
  "duration": 12007632502,
  "status": "passed"
});
formatter.match({
  "location": "Test_Steps.user_enters_testuser__and_Test(DataTable)"
});
formatter.result({
  "duration": 677396866,
  "status": "passed"
});
formatter.match({
  "location": "Test_Steps.message_displayed_Login_Successfully()"
});
formatter.result({
  "duration": 81635,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "Successful Login with Valid Credentials by Maps in Data Tables",
  "description": "",
  "id": "login-action;successful-login-with-valid-credentials-by-maps-in-data-tables",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 31,
  "name": "User is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 32,
  "name": "User Navigate to LogIn Page",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "User enters Credentials to LogIns",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 34
    },
    {
      "cells": [
        "testuser_1",
        "Test@153"
      ],
      "line": 35
    },
    {
      "cells": [
        "testuser_2",
        "Test@154"
      ],
      "line": 36
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "Message displayed Login Successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "Test_Steps.user_is_on_Home_Page()"
});
formatter.result({
  "duration": 13889198585,
  "status": "passed"
});
formatter.match({
  "location": "Test_Steps.user_Navigate_to_LogIn_Page()"
});
formatter.result({
  "duration": 6205270872,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "Test_Steps.message_displayed_Login_Successfully()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenarioOutline({
  "line": 39,
  "name": "Successful Login with Valid Credentials",
  "description": "",
  "id": "login-action;successful-login-with-valid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 40,
  "name": "User is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 41,
  "name": "User Navigate to LogIn Page",
  "keyword": "When "
});
formatter.step({
  "line": 42,
  "name": "User enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "Message displayed Login Successfully",
  "keyword": "Then "
});
formatter.examples({
  "line": 44,
  "name": "",
  "description": "",
  "id": "login-action;successful-login-with-valid-credentials;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 45,
      "id": "login-action;successful-login-with-valid-credentials;;1"
    },
    {
      "cells": [
        "Shubham1",
        "Test@153"
      ],
      "line": 46,
      "id": "login-action;successful-login-with-valid-credentials;;2"
    },
    {
      "cells": [
        "Shubham2",
        "Test@153"
      ],
      "line": 47,
      "id": "login-action;successful-login-with-valid-credentials;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 46,
  "name": "Successful Login with Valid Credentials",
  "description": "",
  "id": "login-action;successful-login-with-valid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 40,
  "name": "User is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 41,
  "name": "User Navigate to LogIn Page",
  "keyword": "When "
});
formatter.step({
  "line": 42,
  "name": "User enters \"Shubham1\" and \"Test@153\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "Message displayed Login Successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "Test_Steps.user_is_on_Home_Page()"
});
formatter.result({
  "duration": 13453734374,
  "status": "passed"
});
formatter.match({
  "location": "Test_Steps.user_Navigate_to_LogIn_Page()"
});
formatter.result({
  "duration": 5507430405,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Shubham1",
      "offset": 13
    },
    {
      "val": "Test@153",
      "offset": 28
    }
  ],
  "location": "Test_Steps.user_enters_UserName_and_Password(String,String)"
});
formatter.result({
  "duration": 641163458,
  "status": "passed"
});
formatter.match({
  "location": "Test_Steps.message_displayed_Login_Successfully()"
});
formatter.result({
  "duration": 37262,
  "status": "passed"
});
formatter.scenario({
  "line": 47,
  "name": "Successful Login with Valid Credentials",
  "description": "",
  "id": "login-action;successful-login-with-valid-credentials;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 40,
  "name": "User is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 41,
  "name": "User Navigate to LogIn Page",
  "keyword": "When "
});
formatter.step({
  "line": 42,
  "name": "User enters \"Shubham2\" and \"Test@153\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "Message displayed Login Successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "Test_Steps.user_is_on_Home_Page()"
});
formatter.result({
  "duration": 15523266005,
  "status": "passed"
});
formatter.match({
  "location": "Test_Steps.user_Navigate_to_LogIn_Page()"
});
formatter.result({
  "duration": 5751134294,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Shubham2",
      "offset": 13
    },
    {
      "val": "Test@153",
      "offset": 28
    }
  ],
  "location": "Test_Steps.user_enters_UserName_and_Password(String,String)"
});
formatter.result({
  "duration": 585741418,
  "status": "passed"
});
formatter.match({
  "location": "Test_Steps.message_displayed_Login_Successfully()"
});
formatter.result({
  "duration": 44942,
  "status": "passed"
});
formatter.scenario({
  "line": 49,
  "name": "Successful LogOut",
  "description": "",
  "id": "login-action;successful-logout",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 50,
  "name": "User LogOut from the Application",
  "keyword": "When "
});
formatter.step({
  "line": 51,
  "name": "Message displayed LogOut Successfullyy",
  "keyword": "Then "
});
formatter.match({
  "location": "Test_Steps.user_LogOut_from_the_Application()"
});
formatter.result({
  "duration": 52337,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});