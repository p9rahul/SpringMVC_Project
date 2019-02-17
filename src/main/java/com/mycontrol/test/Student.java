package com.mycontrol.test;

import java.util.ArrayList;
import java.util.Date;

import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;



public class Student {

	// properties
	@Pattern(regexp="[^0-9]*")   // only accept string
	private String studentName;
	
	@Size(min=2,max =20) @IsValidHobby()
	private String studentHobby;
	
//	@Pattern(regexp="^[7-9][0-9]{9}*")  //@Max(2222)
	private Long studentMobile;
	
	@Past					//@Future @min @notnull @ notEmpty
	private Date studentDOB;
	private ArrayList<String> studentSkill;
	
	private Address studentAddress;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentHobby() {
		return studentHobby;
	}
	public void setStudentHobby(String studentHobby) {
		this.studentHobby = studentHobby;
	}
	public Long getStudentMobile() {
		return studentMobile;
	}
	public void setStudentMobile(Long studentMobile) {
		this.studentMobile = studentMobile;
	}
	public Date getStudentDOB() {
		return studentDOB;
	}
	public void setStudentDOB(Date studentDOB) {
		this.studentDOB = studentDOB;
	}
	public ArrayList<String> getStudentSkill() {
		return studentSkill;
	}
	public void setStudentSkill(ArrayList<String> studentSkill) {
		this.studentSkill = studentSkill;
	}
	public Address getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(Address studentAddress) {
		this.studentAddress = studentAddress;
	}
}
