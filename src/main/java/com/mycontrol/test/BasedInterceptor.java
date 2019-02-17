package com.mycontrol.test;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class BasedInterceptor extends HandlerInterceptorAdapter {

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException
	{
		
		Calendar cal= Calendar.getInstance();
		int dayOfWeek = cal.get(cal.DAY_OF_WEEK);
		
		if(dayOfWeek == 6)
		{
			response.getWriter().write("This website is closed on sunday");
			return false;
		}
		return true;
		
		//if this method returns true then - application will further execute otherwise not
	}
	
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,ModelAndView modelAndView)
	{
		// this method would be called after spring mvc executes the request handler method for the request
		System.out.println("HandlerInterceptorAdapter - spring MVC called postHandle() for " + request.getRequestURI().toString());
	}
	
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,ModelAndView modelAndView)
	{
		// this method would be called after spring mvc executes the request handler method for the request
		System.out.println("HandlerInterceptorAdapter - spring MVC called afterCompletion() for " + request.getRequestURI().toString());
	}
}
