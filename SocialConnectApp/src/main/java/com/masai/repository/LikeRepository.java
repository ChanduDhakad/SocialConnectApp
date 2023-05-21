package com.masai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.model.Like;


@Repository
public interface LikeRepository extends JpaRepository<Like, Integer>{

}
