
Feature:Alltricks
  Background:

    Given Alltricks anasayfasina git
    And Profil sekmesine gec
    And Geçersiz bir mail adresini gir
    Then Adresim kismina emaili gir
    And Passwordu gir

  @Vélos
  Scenario: Bisiklet sayfasi
    Given Anasayfaya git




