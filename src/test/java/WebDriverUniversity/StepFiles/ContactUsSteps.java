package WebDriverUniversity.StepFiles;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.junit.*;

public class ContactUsSteps {
	WebDriver driver;
	@Before
	public void setup() {
		driver = new EdgeDriver();
	}

	@Given("User navigates to WebDriverUniversity.com")
	public void user_navigates_to_web_driver_university_com() {
		this.driver.get("https://www.webdriveruniversity.com");
		this.driver.manage().window().maximize();
	}
	@Given("user clicks on contact us link")
	public void user_clicks_on_contact_us_link() {
		System.out.println(driver);
		this.driver.findElement(By.xpath(".//*[@id=\"contact-us\"]")).click();
		ArrayList<String> tabs=new ArrayList<String>(driver.getWindowHandles());
		this.driver.switchTo().window(tabs.get(1));
	}

	@Given("user enters first name")
	public void user_enters_first_name() {
		this.driver.findElement(By.xpath("//*[@name=\"first_name\"]")).sendKeys("abc");
	}

	@Given("user enters last name")
	public void user_enters_last_name() {
		this.driver.findElement(By.xpath("//*[@name=\"last_name\"]")).sendKeys("xyz");
	}

	@Given("user enters email address")
	public void user_enters_email_address() {
		this.driver.findElement(By.xpath("//*[@name=\"email\"]")).sendKeys("test@test.com");
	}

	@Given("user enters comments")
	public void user_enters_comments(DataTable datatable) {
		this.driver.findElement(By.xpath("//*[@name=\"message\"]")).sendKeys(datatable.row(0).get(0));
	}

	@When("user clicks on submit button")
	public void user_clicks_on_submit_button() {
		this.driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
	}

	@Then("thank you message should be displayed")
	public void thank_you_message_should_be_displayed() {
		Assert.assertEquals("Thank You for your Message!", driver.findElement(By.xpath(".//h1[contains(text(),\"Thank You for your Message!\")]")).getText());
	}
	@When("user clicks on reset button")
	public void user_clicks_on_reset_button() {
		this.driver.findElement(By.xpath("//*[@type=\"reset\"]")).click();
	}

	@Then("first name field should be cleared")
	public void first_name_field_should_be_cleared() {
	    Assert.assertEquals("", this.driver.findElement(By.xpath("//*[@name=\"first_name\"]")).getText());
	}

	@Then("last name field should be cleared")
	public void last_name_field_should_be_cleared() {
		Assert.assertEquals("", this.driver.findElement(By.xpath("//*[@name=\"last_name\"]")).getText());
	}

	@Then("email address field should be cleared")
	public void email_address_field_should_be_cleared() {
		Assert.assertEquals("", this.driver.findElement(By.xpath("//*[@name=\"email\"]")).getText());
	}

	@Then("comments field should be cleared")
	public void comments_field_should_be_cleared() {
		Assert.assertEquals("", this.driver.findElement(By.xpath("//*[@name=\"message\"]")).getText());
	}
}
