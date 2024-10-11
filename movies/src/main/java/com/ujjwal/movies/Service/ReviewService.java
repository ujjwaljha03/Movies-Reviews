package com.ujjwal.movies.Service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.ujjwal.movies.Dao.ReviewRepository;
import com.ujjwal.movies.Model.Movie;
import com.ujjwal.movies.Model.Review;

@Service
public class ReviewService {
	
	@Autowired
	private ReviewRepository repository;
	
	@Autowired
	private MongoTemplate mongoTemplate;
	
	public Review createReview(String reviewBody,String imdbId) {
		Review review = repository.insert(new Review(reviewBody,LocalDateTime.now(),LocalDateTime.now())); 
		
		mongoTemplate.update(Movie.class)
		.matching(Criteria.where("imdbId").is(imdbId))
		.apply(new Update().push("reviewIds").value(review.getId()))
		.first();
		
		return review;
	}
}
