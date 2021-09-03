Feature: Purchase a book on amazon.com
  I want to purchase a book of testing on amazon.com


  Scenario Outline: Purchase a book
    Given I visit the page amazon
    When I looking for a book
      | <nameBook> | <assertOneAuthor> | <assertCar> | <assertTab> |
    Then I see interesting books
    Examples:
      | nameBook | assertOneAuthor | assertCar | assertTab |
      | A Practitioner's Guide to Software Test Design | Lee Copeland    | 0         | Paperback |
