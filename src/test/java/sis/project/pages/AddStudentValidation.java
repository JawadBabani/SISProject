package sis.project.pages;

import org.openqa.selenium.support.PageFactory;

import sis.project.utils.CommonMethods;

public class AddStudentValidation extends CommonMethods {
	
	public AddStudentValidation () {
		
		PageFactory.initElements(driver,this);
	}

}
