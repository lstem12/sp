package com.test.sp.ioc9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Execute {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("ioc/ioc9.xml");
		Play p = (Play)ac.getBean("pl");
		p.play();
	}
}
