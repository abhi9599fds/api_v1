package com.api.acadio.api_v1.comment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommentController {
    
    @Autowired
    private CommentRepository commentRepository;

    
}
