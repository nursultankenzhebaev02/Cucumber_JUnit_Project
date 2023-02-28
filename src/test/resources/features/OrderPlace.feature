Feature: Some of the general functionality verification

  Scenario:Dropdown options verification
    Given user is already logged in to The Web table app
    When user is on the “Order” page
    Then user sees below options under “product” dropdown
      | MoneyCog   |
      | Familybea  |
      | Screenable |

  Scenario: Order place scenario
    Given user is already logged in to The Web table app
    When user is on the “Order” page
    Then user sees Visa as enabled payment option
    Then user sees Mastercard as enabled payment option
    Then user sees American Express as enabled payment option

  Scenario: Order place scenario
    Given user is already logged in to web table app
    When user is on the “Order” page
    And user enters quantity "2"
    And user enters customer name "Alexandra Gray"
    Then user enters street "Hell 666"
    And user enters city "Valhalla"
    And user enters state "One Piece"
    And user enters zip "6666666"
    And user selects payment option "Visa"
    And user enters credit card number "9999999999999999"
    And user enters expiration date "23/66"
    And user clicks to process order button
    Then user should see "Alexandra Gray" in the first row of the web table

  Scenario Outline: Order place scenario
    Given user is already logged in to web table app
    When user is on the “Order” page
    And user enters quantity "<quantity>"
    And user enters customer name "<customerName>"
    Then user enters street "<street>"
    And user enters city "<city>"
    And user enters state "<state>"
    And user enters zip "<zip>"
    And user selects payment option "<paymentType>"
    And user enters credit card number "<cardNumber>"
    And user enters expiration date "<expDate>"
    And user clicks to process order button
    Then user should see "<expectedName>" in the first row of the web table

    Examples:

      | quantity | customerName   | street   | city     | state     | zip    | paymentType | cardNumber       | expDate | expectedName   |
      | 2        | Alexandra Gray | Hell 666 | Valhalla | One Piece | 666666 | Visa        | 6666666666666666 | 21/30    | Alexandra Gray |

