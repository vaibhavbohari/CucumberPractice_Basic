package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {

	public WebDriver driver;
	
	@Given("I have login page facebook")
	public void i_have_login_page_facebook() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\VAIBHAV\\QAAutomation\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

	}

	@When("I will login with username {string} and password {string}")
	public void i_will_login_with_username_and_password(String username, String password) {
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("pass")).sendKeys(password);
		System.out.println("This step enter the Username and Passwword on the login page");
	    
	}

	@Then("login should be successful")
	public void login_should_be_successful() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("login")).click();
		System.out.println("login Successful");
		driver.close();
		
	}
}
