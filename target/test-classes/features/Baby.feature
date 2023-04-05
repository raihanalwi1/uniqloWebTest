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
    | pakaianNewborn1 |           |
    | aksesoris1      |           |
    | koleksiNewborn  |           |
    | luaran1         |           |
    | onePiece        |           |
    | atasan1         |           |
    | bajuTerusan     |           |
    | legging         |           |
    | UT1             |           |
    | gaun1           |           |
    | Airism1         |           |
    | kaosKaki1       |           |
    | aksesoris2      |           |
