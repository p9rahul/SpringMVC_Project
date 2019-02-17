package com.mycontrol.test;

import java.beans.PropertyEditorSupport;

public class StudentNameEditor extends PropertyEditorSupport {

	//when you will submit the admission form.
	//spring mvc will run setAsText method of this class
	//before performing data binding task for studentName property of student object
	
	public void setAsText(String studentName) throws IllegalArgumentException
	{
		if(studentName.contains("Mr.") || studentName.contains("Ms."))
		{
			setValue(studentName);
		}
		else{
			studentName = "Ms." + studentName;
			setValue(studentName);
		}
	}
}
