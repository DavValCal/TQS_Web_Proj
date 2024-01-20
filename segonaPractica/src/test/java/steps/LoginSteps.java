package steps;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
//import steps.SignupFromLoginSteps;

public class LoginSteps {
	
	private WebDriver driver;
	private WebDriverWait wait;
	//loadMethods = new SignupFromLoginSteps();
	
	@Before
	public void setUp() throws Exception {
		driver = webDriverSetUp.getDriver();
		wait = webDriverSetUp.getWait();
		driver.manage().window().maximize();
	}
	
	/*@Given("the user is in the index page")
	public void the_user_is_in_the_index_page_login() {
		System.setProperty("webdriver.gecko.driver", "Driver/geckodriver");
		driver = new FirefoxDriver();
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.navigate().to("https://ultimateqa.com/automation");
	}
	
	@When("the user clicks the login automation tab")
	public void the_user_clicks_the_login_automation_tab_login() {
		//loadMethods.the_user_clicks_the_login_automation_tab();
		driver.findElement(By.partialLinkText("Login automation")).click();
	}*/

	@When("the user fills the login form")
	public void the_user_fills_the_login_form(){
		WebElement first_form_element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("user[email]")));
		first_form_element.sendKeys("1598654@uab.ca");
		driver.findElement(By.id("user[password]")).sendKeys("Contrasena");
		driver.findElement(By.id("user[remember_me]")).click();
		driver.findElement(By.xpath("/html/body/main/div/div/article/form/div[5]/button")).click();
		//driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
	}

	@Then("the user clicks submit button")
	public void the_user_clicks_login_submit_button() throws InterruptedException {
		if (driver.findElement(By.xpath("/html/body/div[4]/div[1]")).isDisplayed() || driver.findElement(By.xpath("/html/body/main/div/div/article/form/div[1]/ul/li")).isDisplayed())
		{
			Thread.sleep(2000);
			//driver.quit();
		}
	}
}