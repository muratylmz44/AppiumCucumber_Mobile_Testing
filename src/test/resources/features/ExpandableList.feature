@longPress
Feature: Api demos
  Scenario: expandable list test
    Given App telefonda acilsin
    When kullanici "API Demos" tiklasin
    When kullanici "Views" tiklasin
    When kullanici "Expandable Lists" tiklasin
    When kullanici "1. Custom Adapter" tiklasin
    When kullanici "People Names" tiklasin
    When kullanici Arnold basili tuttugunda
    Then popup ciktigini onayla
