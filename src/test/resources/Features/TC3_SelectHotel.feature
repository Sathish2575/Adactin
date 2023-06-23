@select
Feature: Verifying Adactin Hotel App select details

  Scenario Outline: Verifying Adactin selecthotel with Valid Credentials
    Given User is on the adactin hotel page
    When User should perform login "<username>", "<password>"
    Then User should verifying after login message "Hello Sathish257!"
    And User should select "<location>","<hotels>","<roomtype>","<roomno>","<checkin>","<checkout>","<adult>" and "<child>"
    Then User should verifying after search "Select Hotel"
    And User should select hotel name
    Then User should verify after select hotel name success message "Book A Hotel"

    Examples: 
      | username   | password | location | hotels         | roomtype | roomno  | checkin    | checkout   | adult   | child   |
      | sathish257 | CAC67K   | Paris    | Hotel Sunshine | Standard | 1 - One | 10/10/2022 | 11/10/2022 | 2 - Two | 1 - One |

  Scenario Outline: Verifying Adactin selecthotel with Invalid Credentials
    Given User is on the adactin hotel page
    When User should perform login "<username>", "<password>"
    Then User should verifying after login message "Hello Sathish257!"
    And User should select "<location>","<hotels>","<roomtype>","<roomno>","<checkin>","<checkout>","<adult>" and "<child>"
    Then User should verifying after search "Select Hotel"
    And User should click continue without select any hotel
    Then User should verify without select any hotel error message "Please Select a Hotel"

    Examples: 
      | username   | password | location | hotels         | roomtype | roomno  | checkin    | checkout   | adult   | child   |
      | sathish257 | CAC67K   | Paris    | Hotel Sunshine | Standard | 1 - One | 10/10/2022 | 11/10/2022 | 2 - Two | 1 - One |
