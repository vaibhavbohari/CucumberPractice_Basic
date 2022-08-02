package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepsforHooks {
	
	public WebDriver driver;
	@Before 
	public void browserSetup() {
		System.out.println("I am inside browserSetup ");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\VAIBHAV\\QAAutomation\\chromedriver.exe");
		driver = new ChromeDriver();   
	}
	@BeforeStep
	public void beforeSteps() {
		System.out.println("I am inside beforeSteps....");
	}
	@AfterStep
	public void afterSteps() {
		System.out.println("I am inside afterSteps....");
	}
	
	

	@Given("user is on login page")
	public void user_is_on_login_page() {
		driver.get("https://www.facebook.com/");
		System.out.println("Open Facbook LoginPage");
	}

	@When("user enters valid   username {string} and password {string}")
	public void user_enters_valid_username_and_password(String username, String password) {
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("pass")).sendKeys(password);
		System.out.println("This step enter the Username and Passwword on the login page");
	}

	@And("clicks on login button")
	public void clicks_on_login_button() throws InterruptedException {
		driver.findElement(By.name("login")).click();
		System.out.println("login Successful");
		Thread.sleep(2000);
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() throws InterruptedException {
		System.out.println("user is navigated to the home page");
		Thread.sleep(2000);
	}
	@After
	public void teardown() {
		System.out.println("I am inside teardown");
		driver.close();
		driver.quit(); 
	}

}
