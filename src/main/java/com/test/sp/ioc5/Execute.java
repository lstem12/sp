package com.test.sp.ioc5;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class Execute {
	public static void main(String[] args) {
		Resource r = new FileSystemResource("src/main/resources/ioc/ioc5.xml");
		BeanFactory bf = new XmlBeanFactory(r);
		Watch wat = (Watch)bf.getBean("movieTheater");
		Watch wat2 = (Watch)bf.getBean("televison");
		wat.startMovie();
		wat.endMovie();
		wat.viewCount();
		wat.makePerson();
		
	}
}
