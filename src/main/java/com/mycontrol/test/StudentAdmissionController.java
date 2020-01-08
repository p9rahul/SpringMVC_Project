package com.mycontrol.test;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class StudentAdmissionController {
	
	@InitBinder
	public void initBinder(WebDataBinder binder){
//		binder.setDisallowedFields(new String[] {"studentMobile"});
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		binder.registerCustomEditor(Date.class, "studentDOB", new CustomDateEditor(dateFormat, false));
		binder.registerCustomEditor(String.class, "studentName", new StudentNameEditor());
	}
	
	@RequestMapping(value="/admissionFormNew.html" , method= RequestMethod.GET)
	public ModelAndView gerAddmissonForm(){
		
//		//Forcing to throw exception
//		String exceptionOccur = "NULL_POINTER";
//		if(exceptionOccur.equalsIgnoreCase("NULL_POINTER"))
//		{
//			throw new NullPointerException("null pointer exception");
//		}
		
		ModelAndView modelAndView = new ModelAndView("AdmissionFormNew"); 
		return modelAndView;
	}
	 
	@ModelAttribute
	public void addCommonsMessage(Model model1)
	{
		model1.addAttribute("headerMessage", "Bettiah Engineering college");
	}
	
	
	//javax.validation.Valid
	@RequestMapping(value="/submitAdmissionFormNew.html" , method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@Valid @ModelAttribute("student1") Student student1, BindingResult result){
		 
		if(result.hasErrors()){
			ModelAndView modelAndView1 = new ModelAndView("AdmissionFormNew");
			return modelAndView1;
		}
		
		ModelAndView modelAndView = new ModelAndView("AdmissionSuccessNew");
		
		return modelAndView;
	}
	
}
 