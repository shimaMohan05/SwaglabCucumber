package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class CartSteps {
	public WebDriver driver=SetUpBrowser.getDriver();
			@Given("Select the product from inventory page and click on addtocart link")
	public void select_the_product_from_inventory_page_and_click_on_addtocart_link() {
	    
	}

	@When("click on remove button")
	public void click_on_remove_button() {
	    driver.findElement(By.xpath("//button[text()='Remove']")).click();
	    System.out.println("item removed");
	}

	@When("Click on continue shopping")
	public void click_on_continue_shopping() {
		driver.findElement(By.xpath("//button[text()='Continue Shopping']")).click();
		System.out.println("continue shopping");
		
	}

	@When("select product from inventory and click on addtocart link")
	public void select_product_from_inventory_and_click_on_addtocart_link() {
		driver.findElement(By.xpath("(//button[text()='Add to cart'])[3]")).click();
		driver.findElement(By.id("shopping_cart_container")).click();
		System.out.println("select the product");
	}

	@When("click on checkout button")
	public void click_on_checkout_button() {
		driver.findElement(By.xpath("//button[text()='Checkout']")).click();
		System.out.println("click on checkout");
	}

	@Then("user will redirected to checkout page")
	public void user_will_redirected_to_checkout_page() {
		Assert.assertTrue(driver.getCurrentUrl().contains("checkout"));
		   System.out.println("checkout the product successfully");
	}


}
