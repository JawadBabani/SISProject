package sis.project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Then;
import sis.project.utils.CommonMethods;
import sis.project.utils.ConfigsReader;

public class LoginPageElements extends CommonMethods {
	
	//@When("I enter a valid username")
	//public void i_enter_a_valid_username() {
		@FindBy(id = "txtUsername")
		public WebElement username;
	
	//}
	//@When("I enter a valid password")
	//public void i_enter_a_valid_password() {
		@FindBy(id = "txtPassword")
		public WebElement password;
		
	//}    
	//@When("I click the login button")
	//public void i_click_the_login_button() {
		@FindBy(xpath = "//button")
		public WebElement loginBtn;
	   
	//}
	@Then("I validate I am logged in")
	public void i_validate_i_am_logged_in() {
	   
	}
	public LoginPageElements() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void adminLogin() {
		sendText(username, ConfigsReader.getProperty("username"));
		sendText(password, ConfigsReader.getProperty("password"));
		click(loginBtn);
	}

}
