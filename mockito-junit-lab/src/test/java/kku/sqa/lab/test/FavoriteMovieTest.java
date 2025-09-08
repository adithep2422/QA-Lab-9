package kku.sqa.lab.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import kku.sqa.lab.api.MovieService;
import kku.sqa.lab.data.stub.MovieServiceStub;
import kku.sqa.lab.service.FavoriteMovie;

class FavoriteMovieTest {

	@Test
    public void testGetActionMovies() {
        MovieService stub = new MovieServiceStub();
        FavoriteMovie favoriteMovie = new FavoriteMovie(stub);

        List<String> actionMovies = favoriteMovie.getActionMovies("user123");

        assertEquals(2, actionMovies.size());
    }

}
