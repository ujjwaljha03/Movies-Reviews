package com.ujjwal.movies.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ujjwal.movies.Dao.MovieRepository;
import com.ujjwal.movies.Model.Movie;

@Service
public class MovieService {

	@Autowired
	private MovieRepository repository;
	
	
	public List<Movie> findAllMovies(){
		return repository.findAll();
	}
	
	public Optional<Movie> findMovieByImdbId( String imdbId) {
		return repository.findMovieByImdbId(imdbId);
	}
}
