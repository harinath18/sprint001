$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("skillracks/cucmber/cucumberJava.feature");
formatter.feature({
  "line": 1,
  "name": "CucumberJava",
  "description": "",
  "id": "cucumberjava",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login functionality exists",
  "description": "",
  "id": "cucumberjava;login-functionality-exists",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I have open the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I open Facebook website",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Login button should exits",
  "keyword": "Then "
});
formatter.match({
  "location": "Samplecucmber.openBrowser()"
});
formatter.result({
  "duration": 8374328727,
  "status": "passed"
});
formatter.match({
  "location": "Samplecucmber.goToFacebook()"
});
formatter.result({
  "duration": 4352464346,
  "status": "passed"
});
formatter.match({
  "location": "Samplecucmber.loginButton()"
});
formatter.result({
  "duration": 184113430,
  "status": "passed"
});
});