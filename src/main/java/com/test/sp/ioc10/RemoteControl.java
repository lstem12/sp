package com.test.sp.ioc10;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("ck")
public class RemoteControl {
	
	@Autowired
	private List<Remote> chs;
	
	public void channelControl() {
		for(Remote ch : chs) {
			ch.change();
			ch.channel();
			ch.volume();
			ch.watch();
		}

	}
}
