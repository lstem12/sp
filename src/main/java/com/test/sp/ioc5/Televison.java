package com.test.sp.ioc5;

public class Televison implements Watch {
	private Movie movie;
	@Override
	public void setMovie(Movie movie) {
		this.movie = movie; 
		
	}

	@Override
	public void startMovie() {
		System.out.println(this.movie.getMovieName() + "영화가 시작되었습니다.");
		
	}

	@Override
	public void endMovie() {
		System.out.println(this.movie.getPlayTime() + "분 이 지나" + this.movie.getMovieName() + "영화 종료");
		
	}

	@Override
	public void viewCount() {
		System.out.println("조회수는 " + this.movie.getViewCount() + " 입니다.");
		
	}

	@Override
	public void makePerson() {
		System.out.println("감독은 " + this.movie.getMakePerson() + " 입니다.");
		
	}

}
