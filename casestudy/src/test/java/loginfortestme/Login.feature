

Feature: Login
@login

    Scenario Outline: Login successfully 
    Given user in the login page 
    When user enter the username "<username>"
    And  user give the password "<password>"
    Then user clicks the login button
    Then the home page is displayed

    Examples: 
      | username     | password | 
      | madhavan1234 |  abc123  | 
      
