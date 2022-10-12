package StepDefination;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageTest  {

	@Given("i am in background")
	public void i_am_in_background() 
	{
	    System.out.println("background");
	}
	@Given("open loginpage")
	public void open_loginpage() 
	{
		System.out.println("loginpage"); 
	}
	@When("enter uname and password")
	public void enter_uname_and_password()
	{
		System.out.println("password");
	 }
	@Then("user is on HomePage")
	public void user_is_on_home_page() 
	{
		System.out.println("homepage1"); 
	}
	
	@Given("homepage in home")
	public void homepage_in_home()
	{
		System.out.println("homepage2"); 
	}

	@Given("open th broweser")
	public void open_th_broweser()
	{
	    System.out.println("2nd feature file ");
	}
	


}
