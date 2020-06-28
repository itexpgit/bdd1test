$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("umafeature.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#----------------------------------"
    },
    {
      "line": 2,
      "value": "# Empty Cucumber .feature file"
    },
    {
      "line": 3,
      "value": "#----------------------------------"
    }
  ],
  "line": 4,
  "name": "Inchins Bamboo Garden Order food with Catering and Bulletin Test Feature",
  "description": "",
  "id": "inchins-bamboo-garden-order-food-with-catering-and-bulletin-test-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "Inchins Bulletin Test Scenario",
  "description": "",
  "id": "inchins-bamboo-garden-order-food-with-catering-and-bulletin-test-feature;inchins-bulletin-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "user is already on Bulletin Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user enters data name emaile",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user clicks on Schaumburg on Select Location Page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user enters captcha code on Bulletin Page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user clicks on Submit Form on Bulletin Page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user closes the browser for bulletin",
  "keyword": "Then "
});
formatter.match({
  "location": "UmaStepDefinitions.user_is_already_on_Bulletin_Home_Page()"
});
formatter.result({
  "duration": 16649864700,
  "status": "passed"
});
formatter.match({
  "location": "UmaStepDefinitions.user_enters_data_name_emaile()"
});
formatter.result({
  "duration": 5042204700,
  "status": "passed"
});
formatter.match({
  "location": "UmaStepDefinitions.user_clicks_on_Schaumburg_on_Select_Location_Page()"
});
formatter.result({
  "duration": 708013900,
  "status": "passed"
});
formatter.match({
  "location": "UmaStepDefinitions.user_enters_captcha_code_on_Bulletin_Page()"
});
formatter.result({
  "duration": 428535200,
  "status": "passed"
});
formatter.match({
  "location": "UmaStepDefinitions.user_clicks_on_Submit_Form_on_Bulletin_Page()"
});
formatter.result({
  "duration": 1119583800,
  "status": "passed"
});
formatter.match({
  "location": "UmaStepDefinitions.user_closes_the_browser_for_bulletin()"
});
formatter.result({
  "duration": 198355900,
  "status": "passed"
});
});