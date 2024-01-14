package Steps;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistePage {
	
	@Before
	public void a1() {
		System.out.println("Before All");
	}

	  WebDriver driver;
	@Given("user is on registerpage")
	public void user_is_on_registerpage() {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaibhav\\OneDrive\\Desktop\\chromeDriver path\\chromedriver-win64\\chromedriver.exe");
	     driver = new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	     driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	     driver.manage().deleteAllCookies();
	     driver.get("https://demo.guru99.com/test/newtours/register.php");
	
	}

	@When("user enter valid {string}, {string}, {string} and {string}")
	public void user_enter_valid_and(String fname, String lname, String phone, String email) {
	   driver.findElement(By.name("firstName")).sendKeys(fname);
	   driver.findElement(By.name("lastName")).sendKeys(lname);
	   driver.findElement(By.name("phone")).sendKeys(phone);
	   driver.findElement(By.name("userName")).sendKeys(email);

	
	}

	@When("user enter valid {string}, {string}, {string}, {string} and {string}")
	public void user_enter_valid_and(String address, String city, String state, String postalcode, String country) {
		   driver.findElement(By.name("address1")).sendKeys(address);
		   driver.findElement(By.name("city")).sendKeys(city);
		   driver.findElement(By.name("state")).sendKeys(state);
		   driver.findElement(By.name("postalCode")).sendKeys(postalcode);
		   WebElement country1 = driver.findElement(By.name("country"));
		   Select sel = new Select(country1);
		   sel.selectByVisibleText(country);
		   
	}

	@When("user enter valid {string}, {string}, {string} and click on submit button")
	public void user_enter_valid_and_click_on_submit_button(String username, String password, String confirmpassword) {
		   driver.findElement(By.name("email")).sendKeys(username);
		   driver.findElement(By.name("password")).sendKeys(password);
		   driver.findElement(By.name("confirmPassword")).sendKeys(confirmpassword);
		   driver.findElement(By.name("submit")).click();

	}

	@Then("validate user is on register success page by passing url")
	public void validate_user_is_on_register_success_page_by_passing_url() {
	String a = driver.getCurrentUrl();
	System.out.println(a);
	
	boolean b = a.contains("success");
	Assert.assertTrue(b);
	}

	@After
	public void a2() {
		System.out.println("After All");
	}

}
