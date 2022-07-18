@picker
Feature: ios dropdown picker view
  Scenario: picker view
    Given app IOS cihazda acilsin
    When kullanici "Picker View" yazisina tiklasin
    When kullanici ilk colona "50" ikici kolona "200" ucuncu kolona "150" gondersin
    Then datalari onaylasin