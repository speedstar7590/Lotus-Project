package com.lotus.db.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lotus.db.entity.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

}