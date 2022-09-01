@cucumber
Feature: TodoMVC
  This app allow us to note down daily todo tasks and then mark them completed
  Scenario Outline: Add todo
    Given Ali is on "https://todomvc.com/examples/vanillajs/"
    When he adds a todo "<todo_description>"
    Then the "<todo_description>" is visible in the todo list
    Examples:
      | todo_description |
      |buy egg           |
      |buy bread         |