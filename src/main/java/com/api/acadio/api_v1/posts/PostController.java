package com.api.acadio.api_v1.posts;

import java.util.Optional;

import javax.validation.Valid;

import com.api.acadio.api_v1.contests.ContestModel;
import com.api.acadio.api_v1.contests.ContestRepository;
import com.api.acadio.api_v1.posts.Dto.MessageDto;
import com.api.acadio.api_v1.posts.Dto.PostInDto;
import com.api.acadio.api_v1.users.UserModel;
import com.api.acadio.api_v1.users.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController 
{
    @Autowired
    private PostRepository postRepository;
    @Autowired
    private ContestRepository contestRepository;
    @Autowired
    private UserRepository userRepository;


    @PostMapping(value = "post/create")
    public ResponseEntity<?> createPost(@Valid @RequestBody PostInDto dto ) 
    {
        try 
        {
            Optional<UserModel> user = userRepository.findById(dto.getUserId());
            if(!user.isPresent()){
                return new ResponseEntity<MessageDto>(new MessageDto("user not found"), HttpStatus.BAD_REQUEST);
            }

            Optional<ContestModel>contest =  contestRepository.findById(dto.getContestId());
            if(!contest.isPresent()){
                return new ResponseEntity<MessageDto>(new MessageDto("user not found"), HttpStatus.BAD_REQUEST);
            }

            PostModel data = new PostModel();
            data.setCaption(dto.getCaption());
            data.setCoverPic(dto.getCoverPic());
            data.setUser(user.get());
            data.setContest(contest.get());
            data.setPath(dto.getPath());
            data.setPostType(dto.getPostType());

            postRepository.save(data);
            return ResponseEntity.ok(new MessageDto("Post created"));   
        } catch (Exception e) 
        {
            return new ResponseEntity<MessageDto>(new MessageDto(e.getMessage()), HttpStatus.BAD_REQUEST);
        }
        
    }

    
}
