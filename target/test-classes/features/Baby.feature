Feature: Baby
  As a user
  I want to access baby page
  So I can view product baby
@baby
  Scenario Outline: Fitur Menu Baby
    Given I am on the home page
    Then I click baby on the header
    When I will go to "<page>"
    And I "<validate>" page
    Examples:
    | page            | validate  |
    | babyPage        | bayi      |
    | pakaianNewborn1 | txtPN1    |
    | aksesoris1      | txtAksesoris1   |
    | koleksiNewborn  | txtKoleksiNewborn  |
    | luaran1         | txtLuaran1  |
    | onePiece        | txtOnepiece |
    | atasan1         | txtAtasan1          |
    | bajuTerusan     | txtBajuTerusan |
    | legging         | txtLegging |
    | UT1             | txtUT1 |
    | gaun1           | txtGaun1 |
    | Airism1         | txtAirism1 |
    | kaosKaki1       | txtKaosKaki1 |
    | aksesoris2      | txtAksesoris2 |
    | koleksiBalita   | txtKoleksiBalita |
    | atasan2         | txtAtasan2 |
    | luaran2         | txtLuaran2 |
    | bawahan         | txtBawahan2 |
    | piyama          | txtPiyama |
    | gaun2           | txtGaun2 |
    | UT2             | txtUT2 |
    | heattech        | txtHeattech |
    | dalamanAtas     | txtDalamanAtas |
    | airism2         | txtAirism2 |
    | kaosKaki2       | txtKaosKaki2 |
    | aksesoris3      | txtAksesoris3 |
