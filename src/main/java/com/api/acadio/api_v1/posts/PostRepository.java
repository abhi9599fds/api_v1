package com.api.acadio.api_v1.posts;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<PostModel,Integer> {
    
}
