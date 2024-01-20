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

public class BlogVideoSteps {
	
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

	@When("the user clicks the blog tab")
	public void the_user_clicks_the_blog_tab() {
		driver.findElement(By.xpath("/html/body/div[1]/div/header/div/div/div/div/div/div/div[2]/div[1]/nav/ul/li[4]/a")).click();
	}
	

	@When("the user clicks the blog entry")
	public void the_user_clicks_the_blog_entry() throws InterruptedException{
		
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("post-217801")));

		// Desplazar hasta el elemento
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

		// Enfocar en el elemento
		((JavascriptExecutor) driver).executeScript("arguments[0].focus();", element);

		// Hacer clic en el elemento
		element.click();
		
		Thread.sleep(2000);
	}

	@When("the user plays video")
	public void the_user_plays_video() throws InterruptedException {
		
		// Hacer clic en el elemento
		driver.findElement(By.partialLinkText("Local Execution of Large Language Models")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[starts-with(@src, 'https://www.youtube.com/embed')]")));
		driver.findElement(By.xpath("/html/body/div/div/div[4]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div/div[1]/video")).click();
	}

	@Then("the video is playing")
	public void the_video_is_playing() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		System.out.print(driver.findElement(By.xpath("/html/body/div/div/div[4]/div")).getAttribute("currentTime"));
		if (driver.findElement(By.xpath("/html/body/div/div/div[4]/div")).getAttribute("currentTime") != "0")
		{
			Thread.sleep(2000);
			//driver.quit();
		}
	}
}