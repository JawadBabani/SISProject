package sis.project.testbase;

import sis.project.pages.AddNewTeacher;
import sis.project.pages.AddParentDetails;
import sis.project.pages.AddStudentValidation;
import sis.project.pages.AssignmentsTabValidation;
import sis.project.pages.EnrollStudentValidation;
import sis.project.pages.LoginPageElements;
import sis.project.pages.LoginPageValidation;
import sis.project.pages.ParentAndTeacherTableValidation;
import sis.project.pages.ParentUserRoleLoginValidation;
import sis.project.pages.StudentsPageValidation;
import sis.project.pages.StudentTableValidation;
import sis.project.pages.StudentUserRoleLoginValidation;
import sis.project.pages.TeacherUserRoleLoginValidation;


public class PageInitializer extends BaseClass {
	
	public static AddNewTeacher addNewTeacherPage;
	public static AddParentDetails addParentDeatilsPage;
	public static AddStudentValidation addStudentValidationPage;
	public static AssignmentsTabValidation assignmentsTabValidationPage;
	public static EnrollStudentValidation enrollStudentPage;
	public static LoginPageElements loginPage;
	public static LoginPageValidation loginValidationPage;
	public static ParentAndTeacherTableValidation ParentAndTeacherValidationPage;
	public static ParentUserRoleLoginValidation parentUserRoleValidationPage;
	public static StudentsPageValidation studentValidationPage;
	public static StudentTableValidation studentTablePage;
	public static StudentUserRoleLoginValidation studentRoleLoginValidationPage;
	public static TeacherUserRoleLoginValidation teacherRoleLoginValidationPage;


	public static void initialize() {
		
		
		addNewTeacherPage = new AddNewTeacher();
		addParentDeatilsPage = new AddParentDetails();
		addStudentValidationPage = new AddStudentValidation();
		assignmentsTabValidationPage = new AssignmentsTabValidation();
		enrollStudentPage = new EnrollStudentValidation();
		loginPage = new LoginPageElements();
		loginValidationPage = new LoginPageValidation();
		ParentAndTeacherValidationPage = new ParentAndTeacherTableValidation();
		parentUserRoleValidationPage = new ParentUserRoleLoginValidation();
		studentValidationPage = new StudentsPageValidation();
		studentTablePage = new StudentTableValidation();
		studentRoleLoginValidationPage = new StudentUserRoleLoginValidation();
		teacherRoleLoginValidationPage = new TeacherUserRoleLoginValidation();
			
	}
	

}
