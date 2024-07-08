package sis.project.pages;

import org.openqa.selenium.support.PageFactory;

import sis.project.utils.CommonMethods;

public class AssignmentsTabValidation extends CommonMethods {
	
	public AssignmentsTabValidation () {
		
		PageFactory.initElements(driver, this);
	}

}
