package sis.project.pages;

import org.openqa.selenium.support.PageFactory;

import sis.project.utils.CommonMethods;

public class AddNewTeacher extends CommonMethods {
	
	public AddNewTeacher(){
		
		PageFactory.initElements(driver,this);
	}

}
