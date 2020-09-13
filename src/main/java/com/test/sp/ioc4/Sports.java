package com.test.sp.ioc4;

public class Sports implements Action{
	private Game game;
	@Override
	public void setGame(Game game) {
		this.game = game;
	}

	@Override
	public void startGame() {
		System.out.println(this.game.getGameName() + "이 시작되었습니다.");
	}

	@Override
	public void endGame() {
		System.out.println(this.game.getPlayTime() + "시간이 지나" + this.game.getGameName() + "이 종료됨");
		
	}

	@Override
	public void run() {
		System.out.println(this.game.getGameName() + "이 진행중입니다.");
		
	}

}
