package sis.project.pages;

import org.openqa.selenium.support.PageFactory;

import sis.project.utils.CommonMethods;

public class EnrollStudentValidation extends CommonMethods{
	
	public EnrollStudentValidation() {
		
		PageFactory.initElements(driver, this);
	}

}
