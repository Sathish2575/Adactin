Feature: Verifying Adactin Hotel App search details

  Scenario Outline: Verifying Adactin searchhotel with Valid Credentials
    Given User is on the adactin hotel page
    When User should perform login "<username>", "<password>"
    Then User should verifying after login message "Hello Sathish257!"
    And User should select "<location>","<hotels>","<roomtype>","<roomno>","<checkin>","<checkout>","<adult>" and "<child>"
    Then User should verifying after search "Select Hotel"

    Examples: 
      | username   | password | location | hotels         | roomtype | roomno  | checkin    | checkout   | adult   | child   |
      | sathish257 | CAC67K   | Paris    | Hotel Sunshine | Standard | 1 - One | 10/10/2022 | 11/10/2022 | 2 - Two | 1 - One |

  Scenario Outline: Verifying Adactin searchhotel with Valid Credentials
    Given User is on the adactin hotel page
    When User should perform login "<username>", "<password>"
    Then User should verifying after login message "Hello Sathish257!"
    And User should select only madatory field "<location>","<roomno>","<checkin>","<checkout>" and "<adult>"
    Then User should verifying after search "Select Hotel"

    Examples: 
      | username   | password | location | roomtype | roomno  | checkin    | checkout   | adult   |
      | sathish257 | CAC67K   | Paris    | Standard | 1 - One | 10/10/2022 | 11/10/2022 | 2 - Two |

  Scenario Outline: Verifying Adactin searchhotel with Invalid Credentials
    Given User is on the adactin hotel page
    When User should perform login "<username>", "<password>"
    Then User should verifying after login message "Hello Sathish257!"
    And User should select "<location>","<hotels>","<roomtype>","<roomno>","<checkin>","<checkout>","<adult>" and "<child>"
    Then User should verifying after search date error "Check-In Date shall be before than Check-Out Date" and "Check-Out Date shall be after than Check-In Date"

    Examples: 
      | username   | password | location | hotels         | roomtype | roomno  | checkin   | checkout   | adult   | child   |
      | sathish257 | CAC67K   | Paris    | Hotel Sunshine | Standard | 1 - One | 10/9/2023 | 11/10/2022 | 2 - Two | 1 - One |

  Scenario Outline: Verifying Adactin searchhotel with Invalid Credentials
    Given User is on the adactin hotel page
    When User should perform login "<username>", "<password>"
    Then User should verifying after login message "Hello Sathish257!"
    And User should select without entering fields
    Then User should verifying after search error  "Please Select a Location"

    Examples: 
      | username   | password |
      | sathish257 | CAC67K   |
