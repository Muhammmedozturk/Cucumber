@parametre
Feature: arama_feature
  Background: googlea_git
    Given kullanici google gider

    Scenario: TC01_google_iphone_arama
      When kullanici "iphone" için arama yapar
  Then sonuclarda "iphone" oldugunu dogrular
      And close the application
      # "veri" feature file paramatize etmek için kullanılır
  Scenario: TC02_google_iphone_arama
    When kullanici "tesla" için arama yapar
    Then sonuclarda "tesla" oldugunu dogrular
    And close the application

  Scenario: TC03_google_iphone_arama
    When kullanici "water" için arama yapar
    Then sonuclarda "water" oldugunu dogrular
    And close the application

  Scenario: TC04_google_iphone_arama
    When kullanici "porcelain tea pot" için arama yapar
    Then sonuclarda "porcelain tea pot" oldugunu dogrular
    And close the application