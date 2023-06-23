Feature: Verifying Adactin Hotel App login details

  Scenario Outline: Verifying Adactin login with Valid Credentials
    Given User is on the adactin hotel page
    When User should perform login "<username>", "<password>"
    Then User should verifying after login message "Hello Sathish257!"

    Examples: 
      | username   | password |
      | sathish257 | CAC67K   |

  Scenario Outline: Verifying Adactin login with Valid Credentials
    Given User is on the adactin hotel page
    When User should perform login "<username>", "<password>" with Enter key
    Then User should verifying after login message "Hello Sathish257!"

    Examples: 
      | username   | password |
      | sathish257 | CAC67K   |

  Scenario Outline: Verifying Adactin login with Invalid Credentials
    Given User is on the adactin hotel page
    When User should perform login "<username>", "<password>"
    Then User should verifying after login with invalid message "Invalid Login details or Your Password might have expired."

    Examples: 
      | username   | password |
      | sathish257 | CAC67K34 |
