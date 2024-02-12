package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import swaglabhooks.SwagLabHooks;

public class CheckoutSteps {
	public WebDriver driver=SetUpBrowser.getDriver();
	
	@Given("click on the checkout button in cart page")
	public void click_on_the_checkout_button_in_cart_page() {
	   
	}

	@When("enter fname {string} lname {string} zip\"{int}\"")
	public void enter_fname_lname_zip(String fname, String lname, Integer zip) {
		  SwagLabHooks.getWait();
		System.out.println(driver.getCurrentUrl()+"in checkoutpage");
	    driver.findElement(By.id("first-name")).sendKeys(fname);
	    driver.findElement(By.id("last-name")).sendKeys(lname);
	    String zip1=String.valueOf(zip);
	    driver.findElement(By.id("postal-code")).sendKeys(zip1);
	}

	@When("Click on cancel button")
	public void click_on_cancel_button() {
		  SwagLabHooks.getWait();
		 driver.findElement(By.id("cancel")).click();
	}

	@Then("it will redirected to cart page")
	public void it_will_redirected_to_cart_page() {
		// Assert.assertTrue(driver.getCurrentUrl().contains("cart"));
		   System.out.println("redirect to cart page");
	}
	@When("click on checkout button again")
	public void click_on_checkout_button_again() {
		  SwagLabHooks.getWait();
		driver.findElement(By.xpath("//button[text()='Checkout']")).click();
	}

	@Then("user will redirected to checkout  page")
	public void user_will_redirected_to_checkout_page() {
	    System.out.println("again redirected to checkout page");
	}

	

	@When("click on continue button button")
	public void click_on_continue_button_button() {
		  SwagLabHooks.getWait();
		 driver.findElement(By.id("first-name")).sendKeys("Shima");
		    driver.findElement(By.id("last-name")).sendKeys("Mohan");
		    driver.findElement(By.id("postal-code")).sendKeys("560060");
		    SwagLabHooks.getWait();
		driver.findElement(By.id("continue")).click();
	}
	

	@Then("user will redirected to review  page")
	public void user_will_redirected_to_review_page() {
		System.out.println("afer continue"+driver.getCurrentUrl());
		Assert.assertTrue(driver.getCurrentUrl().contains("checkout-step-two"));
		   System.out.println("checkout process successfully completed ");
		
	}


}
