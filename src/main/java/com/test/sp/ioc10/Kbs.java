package com.test.sp.ioc10;

import org.springframework.stereotype.Component;

@Component
public class Kbs implements Remote{

	@Override
	public void change() {
		System.out.println("채널을 돌리는중");
		
	}

	@Override
	public void watch() {
		System.out.println("KBS를 시청중입니다.");
		
	}

	@Override
	public void channel() {
		System.out.println("7번 입니다.");
		
	}

	@Override
	public void volume() {
		System.out.println("볼륨은 10 입니다.");
		
	}
	
}
