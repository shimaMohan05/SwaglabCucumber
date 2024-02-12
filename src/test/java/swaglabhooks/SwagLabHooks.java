package swaglabhooks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.Before;
import stepdef.SetUpBrowser;

public class SwagLabHooks {
	public WebDriver driver;
	@Before
	public void setUp()
	{
		driver=SetUpBrowser.setDriver();
		System.out.println("driver opened");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.saucedemo.com/");
		getWait();
	

	}
	@Before("@Inventory")
	public void startingMethod()
	{       System.out.println(driver.getCurrentUrl());
		    driver.findElement(By.id("user-name")).sendKeys("standard_user");
		    driver.findElement(By.id("password")).sendKeys("secret_sauce");
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			getWait();
		}

		@Before("@Cart")
		public void startingMethodCart() {
			System.out.println(driver.getCurrentUrl());
			driver.findElement(By.id("user-name")).sendKeys("standard_user");
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			driver.findElement(By.xpath("(//button[text()='Add to cart'])[1]")).click();
			driver.findElement(By.id("shopping_cart_container")).click();
			getWait();

		}
		@Before("@Checkout" )
		public void startingMethodCheckout() {
			System.out.println(driver.getCurrentUrl()+"in checkout");
			driver.findElement(By.id("user-name")).sendKeys("standard_user");
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			driver.findElement(By.xpath("(//button[text()='Add to cart'])[1]")).click();
			driver.findElement(By.id("shopping_cart_container")).click();
			driver.findElement(By.xpath("//button[text()='Checkout']")).click();
			getWait();}
		@Before("@Review")
		public void startingMethodReview() {
			System.out.println(driver.getCurrentUrl()+"in review page");
			driver.findElement(By.id("user-name")).sendKeys("standard_user");
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			driver.findElement(By.xpath("(//button[text()='Add to cart'])[1]")).click();
			driver.findElement(By.id("shopping_cart_container")).click();
			driver.findElement(By.xpath("//button[text()='Checkout']")).click();
			getWait();
			driver.findElement(By.id("first-name")).sendKeys("Shima");
			driver.findElement(By.id("last-name")).sendKeys("Mohan");

			driver.findElement(By.id("postal-code")).sendKeys("560060");
			getWait();
			driver.findElement(By.id("continue")).click();
			getWait();

		}

		public static void getWait() {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
