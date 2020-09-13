package com.test.sp.ioc10;

import org.springframework.stereotype.Component;

@Component
public class Cgv implements Remote {

	@Override
	public void change() {
		System.out.println("채널을 돌리는 중입니다.");
	}

	@Override
	public void watch() {
		System.out.println("CGV를 시청중입니다.");
	}

	@Override
	public void channel() {
		System.out.println("21번입니다.");
		
	}

	@Override
	public void volume() {
		System.out.println("볼륨은 10 입니다.");
		
	}

}
