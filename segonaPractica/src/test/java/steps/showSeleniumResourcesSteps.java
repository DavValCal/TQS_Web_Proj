package steps;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class showSeleniumResourcesSteps {
	
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
	}*/

	@When("the user clicks the SeleniumResources tab")
	public void the_user_clicks_the_SeleniumResources_tab() {
		driver.findElement(By.xpath("/html/body/div[1]/div/div/footer/div/div[1]/div/div[2]/div[2]/div/div/div[1]/nav/ul/li[4]/a")).click();
	}
	

	
	@Then("the selenium resources page appears")
	public void the_selenium_resources_page_appears() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		
		String title = driver.findElement(By.className("entry-title")).getText();
		Assert.assertEquals(title, "Top 57 Resources to Learn Selenium Webdriver [2020]");
	}
}