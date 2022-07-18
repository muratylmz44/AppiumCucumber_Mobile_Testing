@switch
Feature: APIDEMOS
  Background: test sayfasina kadar olan steps
    Given App telefonda acilsin
    When kullanici API demos tiklasin
    When kullanici Preference tiklasin
    When kullanici Switch tiklasin

  Scenario: Switch element
    And ilk switch butonu acik olmali
    Then ilk switch butonunun acik oldugunu onayla
  @switch2
  Scenario:  Switch elementler
    And ilk switch butonu kapali olmali
    Then ilk switch butonunun kapali oldugunu onayla
    And ikinci switch butonu acik olmali
    Then ikinci switch butonu acik oldugunu onayla
    Then screenshot al