$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/resources/featuresfile/ SearchCars.feature");
formatter.feature({
  "line": 1,
  "name": "Acceptance testing to validate Search Cars Page is working.",
  "description": "In order to validate that\r\nthe Search Cars page is working\r\nDoing the Acceptance Testing",
  "id": "acceptance-testing-to-validate-search-cars-page-is-working.",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10879912000,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Validate Search Cars Page",
  "description": "",
  "id": "acceptance-testing-to-validate-search-cars-page-is-working.;validate-search-cars-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I am on the Home Page of CarsGuide Website",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I mouse hover to buy+sell Menu",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "click on \"Search Cars\" link",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "select car brand as \"BMW\" from AnyMake dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "select \"1 Series\" as car model",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "select location as \"NSW - Sydney\" from Select Location dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "select \"$30,000\" as price",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "click on Find_My_Next_Car button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I should see list of searched cars \"26 BMW 1 Series for Sale under $30,000 in Sydney, NSW\"",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "the page title should be \"Bmw 1 Series Under 30000 for Sale Sydney NSW | carsguide\"",
  "keyword": "And "
});
formatter.match({
  "location": "SearchCars.iAmOnTheHomePageOfCarsGuideWebsite()"
});
formatter.result({
  "duration": 177575000,
  "status": "passed"
});
formatter.match({
  "location": "SearchCars.iMouseHoverToBuySellMenu()"
});
formatter.result({
  "duration": 374397500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Search Cars",
      "offset": 10
    }
  ],
  "location": "SearchCars.clickOnLink(String)"
});
formatter.result({
  "duration": 2968106300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BMW",
      "offset": 21
    }
  ],
  "location": "SearchCars.selectCarBrandAsFromAnyMakeDropdown(String)"
});
formatter.result({
  "duration": 424248400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1 Series",
      "offset": 8
    }
  ],
  "location": "SearchCars.selectAsCarModel(String)"
});
formatter.result({
  "duration": 348056100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "NSW - Sydney",
      "offset": 20
    }
  ],
  "location": "SearchCars.selectLocationAsFromSelectLocationDropdown(String)"
});
formatter.result({
  "duration": 269292600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$30,000",
      "offset": 8
    }
  ],
  "location": "SearchCars.selectAsPrice(String)"
});
formatter.result({
  "duration": 233573500,
  "status": "passed"
});
formatter.match({
  "location": "SearchCars.clickOnFind_My_Next_CarButton()"
});
formatter.result({
  "duration": 2035540000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "26 BMW 1 Series for Sale under $30,000 in Sydney, NSW",
      "offset": 36
    }
  ],
  "location": "SearchCars.iShouldSeeListOfSearchedCars(String)"
});
formatter.result({
  "duration": 261905100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bmw 1 Series Under 30000 for Sale Sydney NSW | carsguide",
      "offset": 26
    }
  ],
  "location": "SearchCars.thePageTitleShouldBe(String)"
});
formatter.result({
  "duration": 31737000,
  "status": "passed"
});
formatter.after({
  "duration": 811651400,
  "status": "passed"
});
formatter.uri("src/test/java/resources/featuresfile/UsedCarSearchSale.feature");
formatter.feature({
  "line": 1,
  "name": "Acceptance testing to validate Search Cars Page is working.",
  "description": "In order to validate that\r\nthe Used Search Cars page is working\r\nPerforming the Acceptance Testing",
  "id": "acceptance-testing-to-validate-search-cars-page-is-working.",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4582005800,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Validate Used  Search Cars Page",
  "description": "",
  "id": "acceptance-testing-to-validate-search-cars-page-is-working.;validate-used--search-cars-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "I am on the Home Page of CarsGuide Website",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I mouse hover to buy+sell Menu",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "click on submenu Used Search link",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "select carMaker \"Audi\" from AnyMake dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "select carModel \"A4\" from AmyModel dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "select location \"SA - All\"  from SelectLocation dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "select price \"$20,000\" from price dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "click on Find_My_Car button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I should see list of Used cars \"10 Used Audi A4s for Sale under $20,000 in SA\"",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "the page title should match expected title  \"Used Audi A4 Under 20000 for Sale SA | carsguide\"",
  "keyword": "And "
});
formatter.match({
  "location": "SearchCars.iAmOnTheHomePageOfCarsGuideWebsite()"
});
formatter.result({
  "duration": 110900,
  "status": "passed"
});
formatter.match({
  "location": "SearchCars.iMouseHoverToBuySellMenu()"
});
formatter.result({
  "duration": 405568900,
  "status": "passed"
});
formatter.match({
  "location": "UsedCarSearch.clickOnSubmenuUsedSearchLink()"
});
formatter.result({
  "duration": 2254357700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Audi",
      "offset": 17
    }
  ],
  "location": "UsedCarSearch.selectCarMakerFromAnyMakeDropdown(String)"
});
formatter.result({
  "duration": 470693600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "A4",
      "offset": 17
    }
  ],
  "location": "UsedCarSearch.selectCarModelFromAmyModelDropdown(String)"
});
formatter.result({
  "duration": 222305600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SA - All",
      "offset": 17
    }
  ],
  "location": "UsedCarSearch.selectLocationFromSelectLocationDropdown(String)"
});
formatter.result({
  "duration": 208793300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$20,000",
      "offset": 14
    }
  ],
  "location": "UsedCarSearch.selectPriceFromPriceDropdown(String)"
});
formatter.result({
  "duration": 239021300,
  "status": "passed"
});
formatter.match({
  "location": "UsedCarSearch.clickOnFind_My_CarButton()"
});
formatter.result({
  "duration": 2708391900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10 Used Audi A4s for Sale under $20,000 in SA",
      "offset": 32
    }
  ],
  "location": "UsedCarSearch.iShouldSeeListOfUsedCars(String)"
});
formatter.result({
  "duration": 1186776600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Used Audi A4 Under 20000 for Sale SA | carsguide",
      "offset": 45
    }
  ],
  "location": "UsedCarSearch.thePageTitleShouldMatchExpectedTitle(String)"
});
formatter.result({
  "duration": 18339000,
  "status": "passed"
});
formatter.after({
  "duration": 1268166700,
  "status": "passed"
});
});