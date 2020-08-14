Feature: EbaySearch
Scenario: search functionality
Given user launch chrome browser
When user opens url "https://ebay.in"
And user select the dropdown as "Cameras & Photo"
And user enter text as "sony"
And user click on search button
Then Page url should be "https://www.ebay.com/sch/i.html?_from=R40&_trksid=m570.l1313&_nkw=sony&_sacat=625"