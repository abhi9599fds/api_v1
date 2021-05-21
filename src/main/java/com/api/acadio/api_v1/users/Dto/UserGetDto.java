package com.api.acadio.api_v1.users.Dto;

import org.springframework.beans.factory.annotation.Value;

public interface UserGetDto {

    @Value("#{target.password}")
    String getPassword();
    //@Value("#{target.password_salt}")
    //String getPasswordSalt();
    String getEmail();
}
