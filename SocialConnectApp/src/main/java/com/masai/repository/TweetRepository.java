package com.masai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.model.Tweet;
import com.masai.model.User;


@Repository
public interface TweetRepository extends JpaRepository<Tweet, Integer>{

}
