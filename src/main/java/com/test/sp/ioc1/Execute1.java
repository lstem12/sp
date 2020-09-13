package com.test.sp.ioc1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class Execute1 {
	public static void main(String[] args) {
		Resource r = new FileSystemResource("src/main/resources/ioc/ioc1.xml");
		BeanFactory bf = new XmlBeanFactory(r);
		Object obj = bf.getBean("c");
		System.out.println(obj);
		
	}
}
