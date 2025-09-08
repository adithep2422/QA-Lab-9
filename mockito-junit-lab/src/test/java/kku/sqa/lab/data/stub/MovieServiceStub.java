package kku.sqa.lab.data.stub;

import java.util.Arrays;
import java.util.List;

import kku.sqa.lab.api.MovieService;

public class MovieServiceStub implements MovieService{
	
	public List<String> getMovies(String username){
		return Arrays.asList(
                "Romantic Love",
                "Action Hero",
                "Comedy Night",
                "Sci-fi Adventure",
                "Action Reloaded",
                "Drama Tears"
        );
	}
}
