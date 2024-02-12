package stepdef;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.*;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import swaglabhooks.SwagLabHooks;

public class ReviewSteps {
	public WebDriver driver=SetUpBrowser.getDriver();
	List<WebElement> list;
	@Given("Enter user details and enter continue button")
	public void enter_user_details_and_enter_continue_button() {
	    
	}

	@When("fetch the billing summary")
	public void fetch_the_billing_summary() {
	    list = driver.findElements(By.xpath("//div[@class='summary_info']//div[contains(@class,'summary')]"));
	}

	@Then("print the summary details")
	public void print_the_summary_details() {
	   for(WebElement i:list)
	   {SwagLabHooks.getWait();
		   System.out.println(i.getText());}
	}

	@When("Click on Finish button")
	public void click_on_finish_button() {
		SwagLabHooks.getWait();
	    driver.findElement(By.xpath("//button[text()='Finish']")).click();
	}

	@Then("user will redirected to checkout copleate  page")
	public void user_will_redirected_to_checkout_copleate_page() {
	  Assert.assertTrue(driver.getCurrentUrl().contains("checkout-complete"),"Failed");
	  System.out.println("successfully printed");
	}


}
