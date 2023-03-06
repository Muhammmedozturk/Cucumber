@failed_scenario
Feature: hooks_test
  Background: googlea_git
    Given kullanici google gider

    #Bu scenarioları bilerek fail ettik. Raporlarda fail durumunda ekran görüntüsü eklenmiş olacaktır.
  Scenario: TC01_google_iphone_arama
    When kullanici "iphone" için arama yapar
    Then sonuclarda "apple" oldugunu dogrular
    Then close the application
  Scenario: TC02_google_tesla_arama
    When kullanici "tesla" için arama yapar
    Then sonuclarda "toros" oldugunu dogrular
    Then ekran görüntüsü al
    Then close the application

