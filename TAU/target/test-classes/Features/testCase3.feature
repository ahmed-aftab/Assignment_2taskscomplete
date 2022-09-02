@cucumber
Feature: Right IMDb page
  This page gives full description of movie searched
  Scenario Outline: Conforming Ali is on right IMDb page
    Given Ali is on Search Page
    When Ali opens IMDb Page
    Then Name of "<show>"is correctly displayed
    And IMDb rating is equal to that on Google
    And The genre is "Comedy" and "Drama"
    Examples:
      | show      |
      |After Life|

    Scenario: Opening Cast and crew page
      Given Ali is at "IMDb page"
      When he clicks on "Cast and crew" button
      Then he go to "Full Cast & Crew" page


  Scenario Outline: Conforming Ricky Gervais as director and cast member
    Given Ali is on Cast and Crew page
    Then the name of director is "<director>"
    And "<director>" is also in the cast
    And his cast name is "Tony"
    And he appeared in "18 episodes"
    Examples:
      | director     |
      |Ricky Gervais|