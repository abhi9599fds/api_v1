package com.api.acadio.api_v1;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import com.api.acadio.api_v1.users.UserRepository;
import com.api.acadio.api_v1.users.Dto.UserGetDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class TestController
{
    @Autowired
    private UserRepository userRepository;
    @GetMapping(value="/test")
    public ResponseEntity<?> getMethodName() {
        UserGetDto dto = userRepository.getLoginDetails("test20@gamil.com");
        System.out.println(dto.getPassword());  
        return ResponseEntity.ok(dto);
    }    
}
