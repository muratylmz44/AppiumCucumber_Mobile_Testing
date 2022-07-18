@spinner
Feature: API demos test
  Scenario: spenner dropdown list
    Given App telefonda acilsin
    When kullanici "API Demos" tiklasin
    When kullanici "Views" tiklasin
    When kullanici "Spinner" tiklasin
#      When kullanici "Spinner" tiklasin with UISelector
    And kullanici color menusunden "blue" secmeli
    And kullanici planet menusunden "Saturn" secmeli