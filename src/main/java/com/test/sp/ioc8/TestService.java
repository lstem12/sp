package com.test.sp.ioc8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
	
	private TestVO tvo;
	
	@Autowired
	public void setTestVO(TestVO tvo) {
		this.tvo = tvo;
	}
	public TestVO getTestVO() {
		return tvo;
	}
}
