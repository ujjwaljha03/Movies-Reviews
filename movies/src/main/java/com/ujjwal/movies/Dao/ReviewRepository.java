package com.ujjwal.movies.Dao;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ujjwal.movies.Model.Review;

@Repository
public interface ReviewRepository extends MongoRepository<Review, ObjectId> {

}
