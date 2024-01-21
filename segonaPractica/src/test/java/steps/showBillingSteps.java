package steps;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class showBillingSteps {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@Before
	public void setUp() throws Exception {
		driver = webDriverSetUp.getDriver();
		wait = webDriverSetUp.getWait();
	}
	
	/*
	@Given("the user is in the index page")
	public void theUserIsInTheIndexPage()
	{
		System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.navigate().to("https://ultimateqa.com/automation");
		
	}
	
	@When("the user clicks the login automation tab")
	public void the_user_clicks_the_login_automation_tab() {
		driver.findElement(By.partialLinkText("Login automation")).click();
	}

	
	@When("the user fills the form")
	public void theUserFillsTheForm() 
	{
		WebElement first_form_element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("user[email]")));
		first_form_element.sendKeys("jheremmyMat@gmail.com");
		driver.findElement(By.id("user[password]")).sendKeys("12345678");		
		
	}
	
	
	@When("the user clicks the SignIn button")
	public void theUserClicksTheSignInButton() 
	{
		
		driver.findElement(By.xpath("/html/body/main/div/div/article/form/div[5]/button")).click();
	}
	
	
	@When("the user clicks his name")
	public void theUserClicksHisName() 
	{
		try {
	        Thread.sleep(10000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/header/div[2]/div/nav/ul/li[2]/button")));
		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/ul/li[2]/button")).click();
	}
	
	@When("the user clicks the MyAccount button")
	public void theUserClicksTheMyAccountButton() 
	{
		driver.findElement(By.partialLinkText("My Account")).click();
	}
	*/
	@When("the user clicks the Billing option")
	public void theUserClicksTheBillingOption() 
	{
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div/div/nav/ul/li[5]/a")));
		driver.findElement(By.xpath("/html/body/div[2]/div/div/nav/ul/li[5]/a")).click();
	}
		
	
	@Then("the billing page appears")
	public void theBillingPageAppears()
	{
		String title = driver.findElement(By.className("my-account__heading")).getText();
		Assert.assertEquals(title, "Billing");
	}
	
	
	
	
}