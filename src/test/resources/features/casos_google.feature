Feature: Google Homepage Search
  This feature allows the search with google

  Scenario: User can reach the expected page through the results of google search obtained by clicking the Search Button
    Given I’m on the Google homepage
    When I type “The name of the wind” into the search field
    And I click the Google Search button
    And click on the title: “The Books - Patrick Rothfuss” in the results page
    Then I go to the expected page: “https://www.patrickrothfuss.com/content/books.asp”

  Scenario: User can reach the expected page through the results of google search obtained by using the search suggestions
    Given I’m on the Google homepage
    When I type “The name of the w” into the search field
    And I click on the first suggestion in the list displayed
    And click on the title: “The Books - Patrick Rothfuss” in the results page
    Then I go to the expected page: “https://www.patrickrothfuss.com/content/books.asp”