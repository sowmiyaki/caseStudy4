package Addtocart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import usecase.test.Utility;

public class RunnerAddtocart
{ 
	WebDriver driver;
	@Given("user in login page")
	public void user_in_login_page()
	{
		 System.out.println("user enters into loginpage");
	     driver=Utility.getDriver("chrome");
	       driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	       driver.findElement(By.xpath("//*[@id=\'header\']/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	      
	}
	@Given("user give the login {string}")
	public void user_give_the_login(String string)
	{
		driver.findElement(By.id("userName")).sendKeys(string);
	}
	
	

	@Then("user give the password {string}")
	public void user_give_the_password(String string) 
	{
		driver.findElement(By.id("password")).sendKeys(string);
		
	}
	@Then("user click the login button")
	  public void user_click_the_login_button()
	{
		  driver.findElement(By.name("Login")).click();
	}

	@Then("user in the homepage")
	public void user_in_the_homepage()
	{
		 Assert.assertEquals("Home", driver.getTitle());
	}

	@When("user search for the product{string}")
	public void user_search_for_the_product(String string)
	{
		driver.findElement(By.id("myInput")).sendKeys(string); 
	}

	@Then("user click  the find details button")
	public void user_click_the_find_details_button()
	{
		 driver.findElement(By.xpath("/html/body/div[1]/form/input")).click(); 
	}

	@Then("user click  the Add to cart")
	public void user_click_the_Add_to_cart()
	{
		  Assert.assertEquals("Search", driver.getTitle());
		     System.out.println("user navigates to AddToCart Page");
	}
}
