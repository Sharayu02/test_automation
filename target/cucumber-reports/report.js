$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/searchFlight.feature");
formatter.feature({
  "name": "searchFlight",
  "description": "  As A User\n  I want to search flights\n  So That I can view flight options",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I\u0027am on cleartrip search flight page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDef.SearchFlight.iAmOnCleartripSearchFlightPage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To search flight from Pune to Chennai",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@flight"
    }
  ]
});
formatter.step({
  "name": "I enter details and search flights",
  "rows": [
    {},
    {}
  ],
  "keyword": "When "
});
formatter.match({
  "location": "stepDef.SearchFlight.iEnterDetailsAndSearchFlights(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see flight options",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDef.SearchFlight.iShouldSeeFlightOptions()"
});
formatter.result({
  "status": "passed"
});
});