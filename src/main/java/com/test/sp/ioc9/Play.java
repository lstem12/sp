package com.test.sp.ioc9;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("pl")
public class Play {
	private Game game;
	
	@Autowired
	public void setGame(@Qualifier("star")Game game) {
		this.game = game;
	}
	public void play() {
		this.game.start();
		this.game.playing();
		this.game.stop();
	}
}
