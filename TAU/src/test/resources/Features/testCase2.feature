@cucumber
Feature: Check IMDb link is present
  The user enters the movie name in google search bar and check whether there IMDb link is present on page.
  Scenario:Movie search
    Given Ali is on "https://www.google.com/"
    When he adds a "After Life" in search bar
    Then the IMDb link is visible on the page

