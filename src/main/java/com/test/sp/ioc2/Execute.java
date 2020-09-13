package com.test.sp.ioc2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class Execute {
	public static void main(String[] args) {
		Resource r = new FileSystemResource("src/main/resources/ioc/ioc2.xml");
		BeanFactory bf = new XmlBeanFactory(r);
		Cafe c = (Cafe) bf.getBean("cafe");
		System.out.println(c);
	}
}
