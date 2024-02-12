package stepdef;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	public WebDriver driver=SetUpBrowser.getDriver();
	@Given("open SwagLab application")
	public void open_swag_lab_application() {
	   
	}

	@When("Enter usename={string} and password={string}")
	public void enter_usename_and_password(String username, String password) {
	    driver.findElement(By.id("user-name")).sendKeys(username);
	    driver.findElement(By.id("password")).sendKeys(password);
	  
	}

	@When("Click on submit button")
	public void click_on_submit_button() {
		  driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("user can able to login")
	public void user_can_able_to_login() {
	    Assert.assertTrue(driver.getCurrentUrl().contains("inventory"), "failed to login");
	    System.out.println("login successfully");
	}

}
