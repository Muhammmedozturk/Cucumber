@scenario_outline_1
Feature: arama_feature
  Background: googlea_git
    Given kullanici google gider
@regression
    Scenario Outline: arama_testi
      When kullanici "<product>" için arama yapar
      Then sonuclarda "<product>" oldugunu dogrular
      And close the application

      Examples: data
        | product |
        | iphone  |
        | tesla   |
        | tv      |
        | flower  |
        | cat     |
        | dog     |


      #Scenario -> Scenario Outline
  #  "" -> "<sutun ismi>"
  # Example kelimesi Scenario outline dan sonra kullanılmalı
  # Example verilerin kullanıldığı yerdir