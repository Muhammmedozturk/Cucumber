@proje

Feature:dean olarak sayfaya giris
  Scenario Outline: TC_01_dean_mesajlari_gorur
    Given Kullanici Given Kullanici "https://www.managementonschools.com" adresine girer
    When kullanici login butonuna tiklar
    And kullanici "<username>" alanina kullanici adini girer
    And kullanici "<password>" alanina kullanici password girer
    And kullanici login butonuna tiklar
    And kullanici acilan sayfada menu butonuna tiklar
    And kullanici sol taraftan contact get all butonuna tiklar
    And kullanici acilan sayfada yazilan mesajlari goruntuledigini dogrular

    Examples:
      |username|password|
      |yildiz|yildiz321|


