package com.mycontrol.test;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class HobbyValidator implements ConstraintValidator<IsValidHobby, String>{

	private String listOfValidHobby;  //add this line
	
	@Override
	public void initialize(IsValidHobby isValidHobby) {
		this.listOfValidHobby=isValidHobby.listofValidHobbies(); // add this line
		
	}

	@Override
	public boolean isValid(String studentHobby, ConstraintValidatorContext ctx) {
		
		if(studentHobby == null)
		{
			return false;
		}
		if(studentHobby.matches(listOfValidHobby)) //pass argument
		{
			return true;
		}else{
			return false;
		}
	}
}
