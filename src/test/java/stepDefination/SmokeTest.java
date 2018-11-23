package stepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class SmokeTest {

@Given("^Launch Chrome$")
public void launch_Chrome() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("Hello");
}

@Given("^Enter Search Criteria$")
public void enter_Search_Criteria() throws Throwable {
	System.out.println("Hello");
}

@When("^I press the Search button$")
public void i_press_the_Search_button() throws Throwable {
	System.out.println("Hello");
}

@Then("^I should be able to see search results$")
public void i_should_be_able_to_see_search_results() throws Throwable {
	System.out.println("Hello");
}


	
}