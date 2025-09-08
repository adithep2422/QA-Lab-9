package kku.sqa.lab.test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import kku.sqa.lab.api.MovieService;
import kku.sqa.lab.service.FavoriteMovie;

class FavoriteMovieMockTest {

	@Test
	public void testGetActionMoviesWithMock() {
		
		MovieService movieService = mock(MovieService.class);
		List<String> allMovieList = Arrays.asList(
                "Romantic Love",
                "Action Hero",
                "Comedy Night",
                "Sci-fi Adventure",
                "Action Reloaded",
                "Drama Tears"
        );

		when(movieService.getMovies("user123")).thenReturn(allMovieList);

		FavoriteMovie favoriteMovie = new FavoriteMovie(movieService);
		List<String> actionMovies = favoriteMovie.getActionMovies("user123");

		assertEquals(2, actionMovies.size());


	}
}
