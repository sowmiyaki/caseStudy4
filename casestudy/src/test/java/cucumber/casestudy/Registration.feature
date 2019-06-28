

Feature: Registration

  @Regist
  Scenario: Login for TestMeApp
  
    Given User enter in the TestMeApp
    When  user click the signup button for registration
    Then  user enter the username as "madhavan33"
    Then  user enter the firstname as"vignesh"
    Then  user enter the lastname as"sivan"
    Then  user enter the password as"abc123"
    Then  user enter the confirm password as"abc123"
    Then  user click the gender as "Male"
    Then  user enter the email as"abcd1234@gmail.com"
    Then  user enter the mobile number as"9751688269"
    Then  user enter the date of birth as"09/19/2002"
    Then  user enter the address as"Nehru street,Vellore"
    Then  user choose the security question as"What is your favorite colour?" 
    Then  user enter the answer as "blue"
    Then  user click the register button
    And   login page is displayed
    
     
      
