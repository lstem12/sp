package com.test.sp.ioc10;

import org.springframework.stereotype.Component;

@Component
public class Control implements Tv {

	@Override
	public void on() {
		System.out.println("tv를 켭니다.");
		
	}

	@Override
	public void off() {
		System.out.println("tv을 끕니다.");
		
	}

}
