$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/search.feature");
formatter.feature({
  "name": "EbaySearch",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "search functionality",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user launch chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Step.user_launch_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user opens url \"https://ebay.in\"",
  "keyword": "When "
});
formatter.match({
  "location": "Step.user_opens_url(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the dropdown as \"Cameras \u0026 Photo\"",
  "keyword": "And "
});
formatter.match({
  "location": "Step.user_select_the_dropdown_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter text as \"sony\"",
  "keyword": "And "
});
formatter.match({
  "location": "Step.user_enter_text_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on search button",
  "keyword": "And "
});
formatter.match({
  "location": "Step.user_click_on_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page url should be \"https://www.ebay.com/sch/i.html?_from\u003dR40\u0026_trksid\u003dm570.l1313\u0026_nkw\u003dsony\u0026_sacat\u003d625\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Step.page_url_should_be(String)"
});
formatter.result({
  "status": "passed"
});
});