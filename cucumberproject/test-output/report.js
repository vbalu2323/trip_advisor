$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:\\Users\\murali dasari\\eclipse-workspace\\cucumberproject\\src\\features\\login.feature");
formatter.feature({
  "line": 1,
  "name": "free crm login page",
  "description": "",
  "id": "free-crm-login-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "free crm login test scenario",
  "description": "",
  "id": "free-crm-login-page;free-crm-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is already on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of login page is free crm",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enter username and password",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "Loginstepdefination.user_is_already_on_login_page()"
});
formatter.result({
  "duration": 24302035600,
  "status": "passed"
});
formatter.match({
  "location": "Loginstepdefination.title_of_login_page_is_free_crm()"
});
formatter.result({
  "duration": 17480400,
  "status": "passed"
});
formatter.match({
  "location": "Loginstepdefination.user_enter_username_and_password()"
});
formatter.result({
  "duration": 2302791200,
  "status": "passed"
});
formatter.match({
  "location": "Loginstepdefination.user_click_on_login_button()"
});
formatter.result({
  "duration": 8366122800,
  "status": "passed"
});
formatter.match({
  "location": "Loginstepdefination.user_is_on_home_page()"
});
formatter.result({
  "duration": 26631100,
  "status": "passed"
});
});