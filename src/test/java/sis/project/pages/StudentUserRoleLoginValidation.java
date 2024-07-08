package sis.project.pages;

import org.openqa.selenium.support.PageFactory;

import sis.project.utils.CommonMethods;

public class StudentUserRoleLoginValidation extends CommonMethods{
	
	public StudentUserRoleLoginValidation () {
		
		PageFactory.initElements(driver, this);
	}

}
