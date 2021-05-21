package com.api.acadio.api_v1.comment;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<CommentModel, Integer> 
{
    
}
