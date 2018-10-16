$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/feature/dailyupdate.feature");
formatter.feature({
  "name": "Attitude matters",
  "description": "In order to Understand his attitude\nAs a ITworking guy \nI want to know whom he is wishing",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "I am Employee and his attitude",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tester"
    }
  ]
});
formatter.step({
  "name": "I work in latenight",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "i met nightwatchmen",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "i greet him wishes",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I work in morning",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "i met watchman",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "i greet not him wishes",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});