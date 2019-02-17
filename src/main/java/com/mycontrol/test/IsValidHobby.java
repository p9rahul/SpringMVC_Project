package com.mycontrol.test;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy = HobbyValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface IsValidHobby {
	
	String listofValidHobbies() default "Music|Football|Cricket|Hockey";
	
	String message() default "Please provide a valid hobby accepted hobbies are - Music, cricket,football and Hockey";

	Class<?>[] groups() default {};
	
	Class<? extends Payload>[] payload() default{};
}
