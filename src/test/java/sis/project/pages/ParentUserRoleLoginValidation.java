package sis.project.pages;

import org.openqa.selenium.support.PageFactory;

import sis.project.utils.CommonMethods;

public class ParentUserRoleLoginValidation extends CommonMethods{
	
	public ParentUserRoleLoginValidation () {
		
		PageFactory.initElements(driver, this);
	}

}
