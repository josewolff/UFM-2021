Feature: CREATE NEW ACCOUNT TEST

  Background: Go to the page
    Given that we create a new account on "http://localhost:8081/register.html"


  Scenario: Fill firstname and lastname.
    When we add the firstname as "Gerson"
    And we add the lastname as "beltran"
    And we add the email as "gerson.beltran@core-code.com"
    And we add the password as "beltran1234"
    And we add the repeat password as "beltran1234"
    And we clicks the register account button
    Then the page should have the url "/login.html"


  Scenario: Fill firstname and lastname.
    When we clicks the button register with google
    Then the page should have the url "/index.html"