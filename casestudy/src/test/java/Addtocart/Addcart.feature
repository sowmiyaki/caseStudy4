
Feature: Add to cart
  Scenario Outline: Add to cart success
   Given user in login page
   
    Given  user give the login "<username>"
    Then  user give the password "<password>"
     Then user click the login button 
    Then user in the homepage 
    When user search for the product"Headphone" 
     Then user click  the find details button
     Then user click  the Add to cart 
    Examples: 
      | username      | password | 
      | madhavan1234  | abc123   | 
     
