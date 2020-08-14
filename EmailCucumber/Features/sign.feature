Feature: EbaySearch
Scenario: product search functionality
Given user launch chrome browser
When user open the url as "http://ebay.in"
And user select the dropdown as "Cameras & Photo"
And user enter text fiels as "Sony"
And user click the search button
Then the page should be "https://www.ebay.com/sch/i.html?_from=R40&_trksid=m570.l1313&_nkw=sony&_sacat=625"