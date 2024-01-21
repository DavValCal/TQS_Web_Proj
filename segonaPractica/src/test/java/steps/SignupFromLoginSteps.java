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

public class SignupFromLoginSteps {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@Before
	public void setUp() throws Exception {
		driver = webDriverSetUp.getDriver();
		wait = webDriverSetUp.getWait();
		driver.manage().window().maximize();
	}
	
	/*@Given("the user is in the index page")
	public void the_user_is_in_the_index_page() {

		System.setProperty("webdriver.gecko.driver", "Driver/geckodriver");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.navigate().to("https://ultimateqa.com/automation");
	}

	@When("the user clicks the login automation tab")
	public void the_user_clicks_the_login_automation_tab() {
		driver.findElement(By.partialLinkText("Login automation")).click();
	}*/
	

	@When("the user clicks xpath button")
	public void the_user_clicks_xpath_button(){
		
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/main/div/div/aside/a")));

		// Desplazar hasta el elemento
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

		// Enfocar en el elemento
		((JavascriptExecutor) driver).executeScript("arguments[0].focus();", element);

		// Hacer clic en el elemento
		element.click();
		
		
		//WebElement signupElement = wait.until(ExpectedConditions.elementToBeClickable((By.xpath("/html/body/main/div/div/aside/a"))));
		//signupElement.click();
	}

	@When("the user fills the form signUp")
	public void the_user_fills_the_form() {
		WebElement first_form_element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("user[first_name]")));
		first_form_element.sendKeys("David");
		driver.findElement(By.id("user[last_name]")).sendKeys("Valencia Calderon");
		driver.findElement(By.id("user[email]")).sendKeys("1598654@uab.cat");
		driver.findElement(By.id("user[password]")).sendKeys("Contrasena");
		driver.findElement(By.id("user[terms]")).click();
		wait.until(ExpectedConditions.elementToBeClickable((By.xpath( "/html/body/main/div/div/article/form/div[6]/button")))).click();
	}

	@Then("the user clicks the submit button")
	public void the_user_clicks_the_submit_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		try {
	        Thread.sleep(2000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
		if (driver.findElement(By.xpath("/html/body/div[4]/div[1]")).isDisplayed() || driver.findElement(By.xpath("/html/body/main/div/div/article/form/div[1]/ul/li")).isDisplayed())
		{
			Thread.sleep(2000);
			//driver.quit();
		}
	}
}