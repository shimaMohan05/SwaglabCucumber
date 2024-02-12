package swaglabrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/featurefiles/login.feature",
		"src/test/resources/featurefiles/inventory.feature",
		"src/test/resources/featurefiles/cart.feature",
		"src/test/resources/featurefiles/checkout.feature",
		"src/test/resources/featurefiles/review.feature"},
glue= {"stepdef","swaglabhooks"})
public class SwagLabRunner {

}
