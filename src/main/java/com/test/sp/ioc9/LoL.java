package com.test.sp.ioc9;

import org.springframework.stereotype.Component;

@Component("lol")
public class LoL implements Game {

	@Override
	public void start() {
		System.out.println("롤을 시작합니다.");
	}

	@Override
	public void stop() {
		System.out.println("롤을 종료합니다");
	}

	@Override
	public void playing() {
		System.out.println("롤을 하고 있습니다.");
	}

}
