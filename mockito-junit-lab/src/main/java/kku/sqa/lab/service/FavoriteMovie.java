package kku.sqa.lab.service;

import java.util.ArrayList;
import java.util.List;

import kku.sqa.lab.api.MovieService;

public class FavoriteMovie {
	
	private MovieService movieService;
	
	public FavoriteMovie(MovieService movieService) {
		super();
		this.movieService = movieService;
	}
	
	public List<String> getActionMovies(String username){
		List<String> actionMovies = new ArrayList<String>();
		List<String> allMovieList = movieService.getMovies(username);
		
		for (String movie : allMovieList) {
			if (movie.contains("Action")) {
				actionMovies.add(movie);
			}
		}
		return actionMovies;
	}
}
