Feature: Api demos
  Background: test sayfasina kadar olan adimlar
    Given App telefonda acilsin
    When kullanici API demos tiklasin
    When  kullanici Views tiklasin

  Scenario: Scroll to element and click
    Then kullanici Switches tiklasin
  @single
  Scenario: UIscrollable ile
    Then  kullanici UiScrolable ile Switches tiklasin
  @WebView
  Scenario: UIscrollable ile
    Then  kullanici UiScrolable ile "WebView" tiklasin