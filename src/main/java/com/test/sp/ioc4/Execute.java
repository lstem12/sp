package com.test.sp.ioc4;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class Execute {
	public static void main(String[] args) {
		Resource r = new FileSystemResource("src/main/resources/ioc/ioc4.xml");
		BeanFactory bf = new XmlBeanFactory(r);
		Action a = (Sports)bf.getBean("sports");
		a.startGame();
		a.run();
		a.endGame();
	}	
}
