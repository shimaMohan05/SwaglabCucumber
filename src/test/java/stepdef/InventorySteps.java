package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import swaglabhooks.SwagLabHooks;

public class InventorySteps {
	public WebDriver driver=SetUpBrowser.getDriver();
	@Given("login swaglab using valid credentials")
	public void login_swaglab_using_valid_credentials() {
	    
	}
	@When("select a product from inventory page and click on addto cart button")
	public void select_a_product_from_inventory_page_and_click_on_addto_cart_button() {
		  SwagLabHooks.getWait();
	    driver.findElement(By.xpath("(//button[text()='Add to cart'])[1]")).click();
	}

	@When("Click on addtocart link")
	public void click_on_addtocart_link() {
	    driver.findElement(By.id("shopping_cart_container")).click();
	}

	@Then("user can able to get acess on cart page")
	public void user_can_able_to_get_acess_on_cart_page() {
	   Assert.assertTrue(driver.getCurrentUrl().contains("cart"));
	   System.out.println("Added to cart successfully");
	   
	}
}
