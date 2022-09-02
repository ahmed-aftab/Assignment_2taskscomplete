@cucumber
Feature: Saving data obtained from Cast and Crew site
  Scenario: Saving Data
    Given While Ali is at "Full Cast & Crew" page
    Then store data in csv file
    And Check check that total caste is "96"