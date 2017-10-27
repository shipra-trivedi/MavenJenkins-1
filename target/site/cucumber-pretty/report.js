$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LogIn_Test.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: shubham.jain@cuelogic.co.in"
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
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "Message displayed Login Successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "Test_Steps.UserCheck()"
});
formatter.result({
  "duration": 15138123456,
  "status": "passed"
});
formatter.match({
  "location": "Test_Steps3.user_Navigate_to_LogIn_Page()"
});
formatter.result({
  "duration": 18679550964,
  "status": "passed"
});
formatter.match({
  "location": "Test_Steps3.user_enters_testuser__and_Test()"
});
formatter.result({
  "duration": 291352628,
  "status": "passed"
});
formatter.match({
  "location": "Test_Steps3.message_displayed_Login_Successfully()"
});
formatter.result({
  "duration": 70258,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "Successful Login with Valid Credentials by Maps in Data Tables",
  "description": "",
  "id": "login-action;successful-login-with-valid-credentials-by-maps-in-data-tables",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 30,
  "name": "User is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 31,
  "name": "User Navigate to LogIn Page",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "User enters Credentials to LogIns",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "Message displayed Login Successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "Test_Steps.UserCheck()"
});
formatter.result({
  "duration": 13403783626,
  "status": "passed"
});
formatter.match({
  "location": "Test_Steps3.user_Navigate_to_LogIn_Page()"
});
formatter.result({
  "duration": 19190631361,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "Test_Steps3.message_displayed_Login_Successfully()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 35,
  "name": "Successful Login with Valid Credentials",
  "description": "",
  "id": "login-action;successful-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 36,
  "name": "User is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 37,
  "name": "User Navigate to LogIn Page",
  "keyword": "When "
});
formatter.step({
  "line": 38,
  "name": "User enters Credentials to LogIns",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "Message displayed Login Successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "Test_Steps.UserCheck()"
});
formatter.result({
  "duration": 14447153179,
  "status": "passed"
});
formatter.match({
  "location": "Test_Steps3.user_Navigate_to_LogIn_Page()"
});
formatter.result({
  "duration": 21430679569,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "Test_Steps3.message_displayed_Login_Successfully()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 41,
  "name": "Successful LogOut",
  "description": "",
  "id": "login-action;successful-logout",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 42,
  "name": "User LogOut from the Application",
  "keyword": "When "
});
formatter.step({
  "line": 43,
  "name": "Message displayed LogOut Successfullyy",
  "keyword": "Then "
});
formatter.step({
  "line": 44,
  "name": "Asserts of JUnits",
  "keyword": "Then "
});
formatter.match({
  "location": "Test_Steps3.user_LogOut_from_the_Application()"
});
formatter.result({
  "duration": 13456694020,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "Test_Steps3.testAssert()"
});
formatter.result({
  "status": "skipped"
});
});