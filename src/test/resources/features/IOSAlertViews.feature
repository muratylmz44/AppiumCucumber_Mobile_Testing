@alertIOS
Feature: IOS testing
  Background: on sart
    Given app IOS cihazda acilsin
    When kullanici "Alert Views" yazisina tiklasin

  Scenario: alert test
    When kullanici "Simple" yazisina tiklasin
    When kullanici popup mesaji gorundunu onayalsin
    Then kullanici ok butonuna tiklasin

  Scenario: send key to text box
    When kullanici "Text Entry" yazisina tiklasin
    And kullanici "IOS" yazi kutusuna yazacak
    Then kullanici ok butonuna tiklasin