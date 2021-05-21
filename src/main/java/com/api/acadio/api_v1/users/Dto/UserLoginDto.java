package com.api.acadio.api_v1.users.Dto;

import javax.validation.constraints.NotNull;

public class UserLoginDto 
{
    @NotNull
    private String email;
    @NotNull
    private String password;
    
    public String getPassword() {
        return password;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
}
