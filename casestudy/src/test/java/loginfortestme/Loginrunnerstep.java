package loginfortestme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import usecase.test.Utility;

public class Loginrunnerstep

{
	
	WebDriver driver; 
	  String user;
	
	
	@Given("user in the login page")
	public void user_in_the_login_page()
	{
		  driver=Utility.getDriver("chrome");
	       driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	       driver.findElement(By.xpath("//*[@id=\'header\']/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	
	}

	@When("user enter the username {string}")
	public void user_enter_the_username(String string)
	{
		driver.findElement(By.id("userName")).sendKeys(string);   
	}
	@And("user give the password {string}")
	public void user_give_the_password(String string) {
		driver.findElement(By.id("password")).sendKeys(string);

	}

	
	
	
	@Then("user clicks the login button")
	  public void user_clicks_the_login_button()
	{
		  driver.findElement(By.name("Login")).click();
	}
	@Then("the home page is displayed")
	public void the_home_page_is_displayed()
	{
		System.out.println("User reached the home page successfully");
	}
}
