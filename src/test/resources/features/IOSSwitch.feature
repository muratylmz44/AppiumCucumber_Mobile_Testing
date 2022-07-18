@switchIOS
Feature: IOS
  Scenario: switch cases
    Given app IOS cihazda acilsin
    When kullanici "Switches" yazisina tiklasin
    And kullanici ilk switch butonunun acmali IOS
    Then ilk switch butonunun acik oldugunu onayla IOS
    And kullanici ikinci switch butonunun kapamali IOS
    Then ikinci switch butonunun kapali oldugunu onayla IOS
    Then screenshot al