package sis.project.pages;

import org.openqa.selenium.support.PageFactory;

import sis.project.utils.CommonMethods;

public class ParentAndTeacherTableValidation extends CommonMethods{
	
	public ParentAndTeacherTableValidation () {
		
		PageFactory.initElements(driver, this);
	}

}
