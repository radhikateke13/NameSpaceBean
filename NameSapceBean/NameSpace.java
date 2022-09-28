package com.spring.NameSapceBean;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class NameSpace {
	 @SuppressWarnings("resource")
		 public static void main(String[] args) {
		 String configFile = 
		"/com/spring/NameSapceBean/applicationcontext.xml";
		 ApplicationContext context = new ClassPathXmlApplicationContext(configFile);
		 Employee emp = (Employee) context.getBean("emp");
		 System.out.println(emp);
		 }
		}

	


