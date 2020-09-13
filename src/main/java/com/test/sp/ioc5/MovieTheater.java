package com.test.sp.ioc5;

public class MovieTheater implements Watch {
	private Movie movie;
	@Override
	public void setMovie(Movie movie) {
		this.movie = movie;
		
	}

	@Override
	public void startMovie() {
		System.out.println(movie.getMovieName() + " 영화시작");
		
	}

	@Override
	public void endMovie() {
		System.out.println(movie.getMovieName() + " 끝");
		
	}

	@Override
	public void viewCount() {
		System.out.println(movie.getViewCount() + " 명의 조회수");
		
	}

	@Override
	public void makePerson() {
		System.out.println(movie.getMakePerson() + " : 감독");
		
	}

}
