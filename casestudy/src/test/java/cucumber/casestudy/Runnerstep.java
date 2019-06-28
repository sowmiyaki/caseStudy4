package cucumber.casestudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import usecase.test.Utility;

public class Runnerstep 
{
	WebDriver driver; 
	  String user;
	
	@Test
	
	@Given("User enter in the TestMeApp")
	public void user_enter_in_the_TestMeApp()
	{
		    driver=Utility.getDriver("Chrome");
		    driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");	
	}

	@When("user click the signup button for registration")
	public void user_click_the_signup_button_for_registration()
	{
		 driver.findElement(By.linkText("SignUp")).click(); 
	}

	@Then("user enter the username as {string}")
	public void user_enter_the_username_as(String string) {
	    
		driver.findElement(By.id("userName")).sendKeys(string);  
	}

	@Then("user enter the firstname as{string}")
	public void user_enter_the_firstname_as(String string)
	{
		 driver.findElement(By.name("firstName")).sendKeys(string); 
	}

	@Then("user enter the lastname as{string}")
	public void user_enter_the_lastname_as(String string)
	{
		driver.findElement(By.name("lastName")).sendKeys(string);  
	}

	@Then("user enter the password as{string}")
	public void user_enter_the_password_as(String string)
	{
		 driver.findElement(By.id("password")).sendKeys(string);  
	}

	@Then("user enter the confirm password as{string}")
	public void user_enter_the_confirm_password_as(String string)
	{
		driver.findElement(By.id("pass_confirmation")).sendKeys(string);
	}

	@Then("user click the gender as {string}")
	public void user_click_the_gender_as(String string)
    {
		 driver.findElement(By.xpath("//*[@id='gender']")).click(); 
	}

	@Then("user enter the email as{string}")
	public void user_enter_the_email_as(String string)
	{
		 driver.findElement(By.id("emailAddress")).sendKeys(string);
	}

	@Then("user enter the mobile number as{string}")
	public void user_enter_the_mobile_number_as(String string)
	{
		driver.findElement(By.id("mobileNumber")).sendKeys(string); 
		
	}
	@Then ("user enter the date of birth as{string}")
    public void user_enter_the_date_of_birth_as(String string)
	{ 
		driver.findElement(By.name("dob")).sendKeys(string);
	}
	
	@Then("user enter the address as{string}")
	public void user_enter_the_address_as(String string)
	{
		driver.findElement(By.id("address")).sendKeys(string); 
	}

	@Then("user choose the security question as{string}")
	public void user_choose_the_security_question_as(String string)
	{
		 Select question = new Select(driver.findElement(By.id("securityQuestion")));
		   question.selectByValue("411011");
	}

	@Then("user enter the answer as {string}")
	public void user_enter_the_answer_as(String string)
	{
		 driver.findElement(By.name("answer")).sendKeys(string); 
	}

	
	@Then("user click the register button")
	public void user_click_the_register_button() {
		driver.findElement(By.name("Submit")).click();
	}

	@Then("login page is displayed")
	public void login_page_is_displayed()
    {
		System.out.println("Regestration done successfully");
	 }

}
	  
	   
	    
	  
	  
	   
	  
	

