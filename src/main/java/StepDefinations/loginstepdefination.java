package StepDefinations;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class loginstepdefination 
{
	WebDriver driver;

	@Given("^User will open url in the browser$")
	public void user_already_loginpage()
	{
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://appdev.nvisionglobal.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	

	@Then("^User enter \"(.*)\" and \"(.*)\"$")
	public void emial_password(String username, String password)
	{
		driver.findElement(By.id("Email")).sendKeys(username);
		driver.findElement(By.id("Password")).sendKeys(password);
		String hiddenCaptchaVal = "";
		hiddenCaptchaVal = driver.findElement(By.id("HiddenCaptcha")).getAttribute("value");
		driver.findElement(By.id("Captcha")).sendKeys(hiddenCaptchaVal);
	}
	
	@Then("^User clicks on login button$")
	public void click_login()
	{
		driver.findElement(By.id("btnLogin")).click();
	}
	
	@And("^User login to the CustomerCorporate page$")
	public void ccpage()
	{
		Select oS = new Select(driver.findElement(By.id("SelectedCompanyId")));
		oS.selectByValue("5692");
		driver.findElement(By.className("newsc")).click();
	}
	
	@Then("^Close the browser$")
	public void close_browser()
	{
		driver.quit();
		
	}
		
}

