Feature: Verifying Adactin Hotel App booking details

  Scenario Outline: Verifying Adactin bookinghotel with Valid Credentials
    Given User is on the adactin hotel page
    When User should perform login "<username>", "<password>"
    Then User should verifying after login message "Hello Sathish257!"
    And User should select "<location>","<hotels>","<roomtype>","<roomno>","<checkin>","<checkout>","<adult>" and "<child>"
    Then User should verifying after search "Select Hotel"
    And User should select hotel name
    Then User should verify after select hotel name success message "Book A Hotel"
    And User should book hotel "<firstname>","<lastname>" and "<address>"
      | Cardtype         | cardno           | expmonth | expyear | cvv |
      | VISA             | 1234567890123456 | December |    2022 | 123 |
      | Master Card      | 1234567890123457 | December |    2022 | 673 |
      | American Express | 1234567890123458 | December |    2022 | 563 |
    Then User should verify after booking success message "Booking Confirmation"

    Examples: 
      | username   | password | location | hotels         | roomtype | roomno  | checkin    | checkout   | adult   | child   | firstname | lastname | address |
      | sathish257 | CAC67K   | Paris    | Hotel Sunshine | Standard | 1 - One | 10/10/2022 | 11/10/2022 | 2 - Two | 1 - One | Sathish   | Kumar    | Chennai |

  Scenario Outline: Verifying Adactin bookinghotel with Invalid Credentials
    Given User is on the adactin hotel page
    When User should perform login "<username>", "<password>"
    Then User should verifying after login message "Hello Sathish257!"
    And User should select "<location>","<hotels>","<roomtype>","<roomno>","<checkin>","<checkout>","<adult>" and "<child>"
    Then User should verifying after search "Select Hotel"
    And User should select hotel name
    Then User should verify after select hotel name success message "Book A Hotel"
    And User should click book now button without entry any data
    Then User should verify after booking without entry error message "Please Enter your First Name","Please Enter you Last Name","Please Enter your Address","Please Enter your 16 Digit Credit Card Number","Please Select your Credit Card Type","Please Select your Credit Card Expiry Month" and "Please Enter your Credit Card CVV Number"

    Examples: 
      | username   | password | location | hotels         | roomtype | roomno  | checkin    | checkout   | adult   | child   |
      | sathish257 | CAC67K   | Paris    | Hotel Sunshine | Standard | 1 - One | 10/10/2022 | 11/10/2022 | 2 - Two | 1 - One |
