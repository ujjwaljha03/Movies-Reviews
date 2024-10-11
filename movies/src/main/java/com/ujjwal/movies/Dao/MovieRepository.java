package com.ujjwal.movies.Dao;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ujjwal.movies.Model.Movie;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId>{

	Optional<Movie> findMovieByImdbId(String imdbId);

}
