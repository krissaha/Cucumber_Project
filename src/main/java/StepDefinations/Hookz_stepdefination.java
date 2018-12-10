package StepDefinations;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Hookz_stepdefination 
{
	
	@Before
	public void setup()
	{
		System.out.println("Brower launched");
		System.out.println("Enter URL in the browser ...");
	}
	
	@After
	public void teardown()
	{
		System.out.println("Close the browser!! ");
	}
			
	@Given("^user is on the pricing page$")
	public void pricingpage()
	{
		System.out.println("User are in pricing page");
	}
	
	@When("^user add the pricing form$")
	public void addpricingpage()
	{
		System.out.println("User are adding pricing");
	}
	
	@Then("^user save the pricing$")
	public void savepricing()
	{
		System.out.println("User is saving pricing");
	}
	
	@Given("^user is on the Tariff page$")
	public void pricingpage1()
	{
		System.out.println("User are in Tariff page");
	}
	@Given("^user add the Tariff form$")
	public void pricingpage2()
	{
		System.out.println("User are adding Tariff page");
	}
	@Given("^user save the Tariff$")
	public void pricingpage3()
	{
		System.out.println("User is saving Tariff page");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
