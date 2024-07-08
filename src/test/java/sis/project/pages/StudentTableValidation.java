package sis.project.pages;

import org.openqa.selenium.support.PageFactory;

import sis.project.utils.CommonMethods;

public class StudentTableValidation extends CommonMethods {
	
	public StudentTableValidation () {
		
		PageFactory.initElements(driver, this);
	}

}
