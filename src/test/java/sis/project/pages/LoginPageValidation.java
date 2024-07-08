package sis.project.pages;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sis.project.utils.CommonMethods;

public class LoginPageValidation extends CommonMethods {
	
	@When("I clicked on the page url")
	public void i_clicked_on_the_page_url() {
	    
	}
	@Then("I landed on the log in page")
	public void i_landed_on_the_log_in_page() {
	  
	    
	}
	
	
	public LoginPageValidation() {
		
		PageFactory.initElements(driver, this);
	}

}
