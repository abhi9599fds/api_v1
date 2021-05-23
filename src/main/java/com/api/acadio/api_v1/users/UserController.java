package com.api.acadio.api_v1.users;

// import java.nio.charset.StandardCharsets;
// import java.security.MessageDigest;
// import java.security.SecureRandom;

import javax.validation.Valid;

import com.api.acadio.api_v1.users.Dto.MessageDto;
import com.api.acadio.api_v1.users.Dto.UserGetDto;
import com.api.acadio.api_v1.users.Dto.UserInDto;
import com.api.acadio.api_v1.users.Dto.UserLoginDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController 
{
    @Autowired
    private UserRepository userRepository;

    @PostMapping(value="user/create")
    
    public ResponseEntity<?> createUser(@Valid @RequestBody UserInDto dto)
    {
        try 
        {
            UserModel user = new UserModel();
            // byte[] salt = new byte[16];
            // SecureRandom secureRandom = new SecureRandom();
            // secureRandom.nextBytes(salt);

            // MessageDigest messageDigest =  MessageDigest.getInstance("SHA-512");
            // messageDigest.update(salt);
            
            user.setProfilePic(dto.getProfilePic());
            user.setSocialHandle(dto.getSocialHandle());
            user.setEmail(dto.getEmail());
            user.setPhn(dto.getPhn());
            user.setAcademy(dto.getAcademy());
            user.setBio(dto.getBio());
            user.setName(dto.getName());
            user.setTypeUser(dto.getTypeUser());
            user.setPassword(dto.getPassword());
            //user.setPasswordHash(new String(messageDigest.digest(dto.getPassword().getBytes())));
            userRepository.save(user);
            return ResponseEntity.ok(new MessageDto("User Created"));
        } 
        catch (Exception e) 
        {
            return new ResponseEntity<MessageDto>(new MessageDto(e.getMessage()), HttpStatus.BAD_REQUEST);
        }
        
    }

    @PostMapping(value = "user/login")
    public ResponseEntity<?> login(@Valid @RequestBody UserLoginDto dto)
    {
        try 
        {
            UserGetDto user = userRepository.getLoginDetails(dto.getEmail());
            if(user == null)
            {
                return new ResponseEntity<MessageDto>(new MessageDto("User not found"), HttpStatus.BAD_REQUEST);  
            }
            if(dto.getPassword().equals(user.getPassword()))
            {
                return ResponseEntity.ok(new MessageDto("Valid User"));
            }
            else{
                return new ResponseEntity<MessageDto>(new MessageDto("User Password Incorrect"), HttpStatus.BAD_REQUEST);
            }
                       
        } 
        catch (Exception e) 
        {
            return new ResponseEntity<MessageDto>(new MessageDto(e.getLocalizedMessage()), HttpStatus.BAD_REQUEST);            
        }


    }    



}
