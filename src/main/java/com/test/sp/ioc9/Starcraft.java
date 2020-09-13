package com.test.sp.ioc9;

import org.springframework.stereotype.Component;

@Component("star")
public class Starcraft implements Game {

	@Override
	public void start() {
		System.out.println("스타를 시작합니다.");		
	}

	@Override
	public void stop() {
		System.out.println("스타를 종료합니다.");		
	}

	@Override
	public void playing() {
		System.out.println("스타를 하는 중입니다.");		
	}

}
