package sis.project.pages;

import org.openqa.selenium.support.PageFactory;

import sis.project.utils.CommonMethods;

public class AddParentDetails extends CommonMethods {
	
	public AddParentDetails () {
		
		PageFactory.initElements(driver,this);
	}

}
