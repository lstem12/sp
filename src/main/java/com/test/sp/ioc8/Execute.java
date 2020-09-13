package com.test.sp.ioc8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Execute {
	
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("ioc/ioc8.xml");
		TestService ts = (TestService)ac.getBean("testService");
		TestVO tvo = ts.getTestVO();
		System.out.println(tvo);
	}
}
