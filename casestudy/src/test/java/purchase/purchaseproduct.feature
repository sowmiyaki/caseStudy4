
Feature: product purchasing

 
@PurchaseFail
  Scenario: PurchaseScenario
    Given User registered in TestMeApp
    
     When User searches a particular product "headphone"
     And User trys to proceed to payment page without adding the item in add to cart
     Then TestMeApp dosen't display the cart icon
     
  
  
   
   @PurchasePass
   Scenario: PurchaseScenario
     Given User login to testmeapp
    
     When User searches a product "headphone"
     And User Add the item to cart
   
     
     Then User purchased the product successfully



      