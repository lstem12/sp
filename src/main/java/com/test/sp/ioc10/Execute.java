package com.test.sp.ioc10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Execute {
	
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("ioc/ioc10.xml");
		Tv tv = (Control)ac.getBean("control");
		RemoteControl ch = (RemoteControl)ac.getBean("ck");
		tv.on();
		ch.channelControl();
		tv.off();
	}
}
