package com.test.sp.ioc10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class TvControl {
	private Tv tv;
	
	@Autowired
	public void setTv(@Qualifier("control")Tv tv) {
		this.tv = tv;
	}
	
	public void watching() {
		this.tv.on();
		this.tv.off();
	}
}
