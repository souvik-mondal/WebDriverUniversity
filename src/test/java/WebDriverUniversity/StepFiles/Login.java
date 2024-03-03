package WebDriverUniversity.StepFiles;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class Login {
	WebDriver driver;
	@Before
	public void setup() {
		this.driver= new EdgeDriver();
	}
	@Given("User navigates to WebDriverUniversity.com")
	public void user_navigates_to_web_driver_university_com() {
	    this.driver.get("https://www.webdriveruniversity.com");
	    this.driver.manage().window().maximize();
	}

	@Given("user clicks on log in portal link")
	public void user_clicks_on_log_in_portal_link() {
	    this.driver.findElement(By.xpath("//*[@id=\"login-portal\"]")).click();
	    ArrayList<String> tabs=new ArrayList<String>(this.driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));
	}

	@When("user enters valid username")
	public void user_enters_valid_username() {
	    this.driver.findElement(By.xpath(".//*[@id=\"text\"]")).sendKeys("Tom");
	}

	@When("user enters {string} password")
	public void user_enters_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
		this.driver.findElement(By.xpath(".//*[@id=\"password\"]")).sendKeys(string);
	}

	@When("user clicks on log in button")
	public void user_clicks_on_log_in_button() {
		this.driver.findElement(By.xpath(".//*[@id=\"login-button\"]")).click();
	}

	@Then("user ables to log in")
	public void user_ables_to_log_in() {
	    this.driver.switchTo().alert().accept();
	}
	@Then("user is not able to log in")
	public void user_is_not_able_to_log_in() {
		this.driver.switchTo().alert().accept();
	}
}
