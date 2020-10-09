$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Home.feature");
formatter.feature({
  "line": 2,
  "name": "Home Screen",
  "description": "",
  "id": "home-screen",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@SanityTest"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "HomePage  consists of search bar",
  "description": "",
  "id": "home-screen;homepage--consists-of-search-bar",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Search bar displayed on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "HomeStep.search_bar_displayed_on_home_page()"
});
formatter.result({
  "duration": 146525817,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 8,
  "name": "Search for  word  facebook and verify autosuggestion list showing and  click on autosuggestion",
  "description": "",
  "id": "home-screen;search-for--word--facebook-and-verify-autosuggestion-list-showing-and--click-on-autosuggestion",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 10,
  "name": "EnterSearcKeyword is \"\u003cCompanyName\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Autosuggestion size is 0 or less than 0",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "NavigateFirstAutosuggestion",
  "keyword": "And "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "home-screen;search-for--word--facebook-and-verify-autosuggestion-list-showing-and--click-on-autosuggestion;",
  "rows": [
    {
      "cells": [
        "CompanyName"
      ],
      "line": 15,
      "id": "home-screen;search-for--word--facebook-and-verify-autosuggestion-list-showing-and--click-on-autosuggestion;;1"
    },
    {
      "cells": [
        "kristal.ai"
      ],
      "line": 16,
      "id": "home-screen;search-for--word--facebook-and-verify-autosuggestion-list-showing-and--click-on-autosuggestion;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 16,
  "name": "Search for  word  facebook and verify autosuggestion list showing and  click on autosuggestion",
  "description": "",
  "id": "home-screen;search-for--word--facebook-and-verify-autosuggestion-list-showing-and--click-on-autosuggestion;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "EnterSearcKeyword is \"kristal.ai\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Autosuggestion size is 0 or less than 0",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "NavigateFirstAutosuggestion",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "kristal.ai",
      "offset": 22
    }
  ],
  "location": "HomeStep.entersearckeyword_is(String)"
});
formatter.result({
  "duration": 136084538,
  "status": "passed"
});
formatter.match({
  "location": "HomeStep.autosuggestion_size_is_0_or_less_than_0()"
});
formatter.result({
  "duration": 148565264,
  "status": "passed"
});
formatter.match({
  "location": "HomeStep.navigatefirstautosuggestion()"
});
formatter.result({
  "duration": 949052192,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 19,
  "name": "User can search a sentence  in google and in results page all type of results will show",
  "description": "",
  "id": "home-screen;user-can-search-a-sentence--in-google-and-in-results-page-all-type-of-results-will-show",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 21,
  "name": "provide Name \"\u003cname\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "ClickSearchbar",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "Verify Images and Videos",
  "keyword": "And "
});
formatter.examples({
  "line": 24,
  "name": "",
  "description": "",
  "id": "home-screen;user-can-search-a-sentence--in-google-and-in-results-page-all-type-of-results-will-show;",
  "rows": [
    {
      "cells": [
        "name"
      ],
      "line": 25,
      "id": "home-screen;user-can-search-a-sentence--in-google-and-in-results-page-all-type-of-results-will-show;;1"
    },
    {
      "cells": [
        "About Kristal.ai Company"
      ],
      "line": 26,
      "id": "home-screen;user-can-search-a-sentence--in-google-and-in-results-page-all-type-of-results-will-show;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 26,
  "name": "User can search a sentence  in google and in results page all type of results will show",
  "description": "",
  "id": "home-screen;user-can-search-a-sentence--in-google-and-in-results-page-all-type-of-results-will-show;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "provide Name \"About Kristal.ai Company\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "ClickSearchbar",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "Verify Images and Videos",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "About Kristal.ai Company",
      "offset": 14
    }
  ],
  "location": "HomeStep.provide_Name(String)"
});
formatter.result({
  "duration": 193045257,
  "status": "passed"
});
formatter.match({
  "location": "HomeStep.clicksearchbar()"
});
formatter.result({
  "duration": 1412148617,
  "status": "passed"
});
formatter.match({
  "location": "HomeStep.verify_images_and_videos()"
});
formatter.result({
  "duration": 26298511,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "Verify the search result page title  is proper or not",
  "description": "",
  "id": "home-screen;verify-the-search-result-page-title--is-proper-or-not",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 29,
  "name": "Veify Home Page URL",
  "keyword": "Then "
});
formatter.match({
  "location": "HomeStep.veify_home_page_url()"
});
formatter.result({
  "duration": 5866568,
  "status": "passed"
});
formatter.scenario({
  "line": 32,
  "name": "Verify Google logo is present",
  "description": "",
  "id": "home-screen;verify-google-logo-is-present",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 33,
  "name": "Logo Present Results Page",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "Navigate Back",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "Verify Logo In Home Page",
  "keyword": "And "
});
formatter.match({
  "location": "HomeStep.logo_present_results_page()"
});
formatter.result({
  "duration": 22105581,
  "status": "passed"
});
formatter.match({
  "location": "HomeStep.navigate_back()"
});
formatter.result({
  "duration": 205539112,
  "status": "passed"
});
formatter.match({
  "location": "HomeStep.verify_logo_in_home_page()"
});
formatter.result({
  "duration": 21042002,
  "status": "passed"
});
});