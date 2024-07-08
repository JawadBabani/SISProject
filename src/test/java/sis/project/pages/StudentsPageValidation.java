package sis.project.pages;

import org.openqa.selenium.support.PageFactory;

import sis.project.utils.CommonMethods;

public class StudentsPageValidation extends CommonMethods{
	
	public StudentsPageValidation () {
		
		PageFactory.initElements(driver, this);
	}

}
