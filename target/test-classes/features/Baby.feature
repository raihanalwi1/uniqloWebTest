Feature: Baby
  As a user
  I want to access baby page
  So I can view product baby

#  Scenario: Go to baby page
#    Given I am on the home page
#    Then I click baby on the header
#    When I will go to "<page>"
#
#  Scenario: Menu Pakaian Newboarn Bayi
#    Given I am on the home page
#    Then I click baby on the header
#    When I will go to pakaian newboarn bayi
#
#  Scenario: Menu Aksesoris bayi 1
#    Given I am on the home page
#    Then I click baby on the header
#    When I will go to aksesoris bayi satu
#
#  Scenario: Menu Koleksi Newborn
#    Given I am on the home page
#    Then I click baby on the header
#    When I will go to koleksi newborn
#
#  Scenario: Menu Luaran 1
#    Given I am on the home page
#    Then I click baby on the header
#    When I will go to luaran satu
#
#  Scenario: Menu One Piece
#    Given I am on the home page
#    Then I click baby on the header
#    When I will go to one piece
#
#  Scenario: Menu Atasan 1
#    Given I am on the home page
#    Then I click baby on the header
#    When I will go to atasan satu
#
#  Scenario: Menu Baju Terusan
#    Given I am on the home page
#    Then I click baby on the header
#    When I will go to baju terusan
#
#  Scenario: Menu Legging
#    Given I am on the home page
#    Then I click baby on the header
#    When I will go to legging
#
#  Scenario: Menu UT 1
#    Given I am on the home page
#    Then I click baby on the header
#    When I will go to ut satu
#
#  Scenario: Menu Gaun 1
#    Given I am on the home page
#    Then I click baby on the header
#    When I will go to gaun satu
#
#  Scenario: Menu AIRism 1
#    Given I am on the home page
#    Then I click baby on the header
#    When I will go to airism satu
#
#  Scenario: Menu Kaos Kaki 1
#    Given I am on the home page
#    Then I click baby on the header
#    When I will go to kaos kaki satu
#
#  Scenario: Menu Aksesoris 2
#    Given I am on the home page
#    Then I click baby on the header
#    When I will go to aksesoris bayi dua
#
#  Scenario: Menu Koleksi Balita
#    Given I am on the home page
#    Then I click baby on the header
#    When I will go to koleksi balita
#
#  Scenario: Menu Atasan 2
#    Given I am on the home page
#    Then I click baby on the header
#    When I will go to atasan dua

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
