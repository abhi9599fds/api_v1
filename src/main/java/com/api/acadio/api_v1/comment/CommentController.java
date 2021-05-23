package com.api.acadio.api_v1.comment;

import com.api.acadio.api_v1.comment.Dto.MessageDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommentController {
    
    @Autowired
    private CommentRepository commentRepository;

    public ResponseEntity<?> createComment() 
    {
        try 
        {
            return ResponseEntity.ok("ok");
            
        } 
        catch (Exception e) 
        {
            return new ResponseEntity<MessageDto>(new MessageDto(e.getLocalizedMessage()), HttpStatus.BAD_REQUEST);
        }
    }
}
