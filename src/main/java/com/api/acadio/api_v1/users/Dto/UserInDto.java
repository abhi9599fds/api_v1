package com.api.acadio.api_v1.users.Dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

public class UserInDto 
{
    @NotNull
    private String name;
    @NotNull
    private String phn;
    @Email
    private String email;
    @NotNull
    private String password;
    @NotNull
    private String academy;
    @NotNull
    private String typeUser;
    @NotNull
    private String profilePic;
    @NotNull
    private String bio;
    @NotNull
    private String socialHandle;

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getName() {
        return name;
    }
    public String getSocialHandle() {
        return socialHandle;
    }
    public void setSocialHandle(String socialHandle) {
        this.socialHandle = socialHandle;
    }
    public String getBio() {
        return bio;
    }
    public void setBio(String bio) {
        this.bio = bio;
    }
    public String getProfilePic() {
        return profilePic;
    }
    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }
    public String getTypeUser() {
        return typeUser;
    }
    public void setTypeUser(String typeUser) {
        this.typeUser = typeUser;
    }
    public String getAcademy() {
        return academy;
    }
    public void setAcademy(String academy) {
        this.academy = academy;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPhn() {
        return phn;
    }
    public void setPhn(String phn) {
        this.phn = phn;
    }
    public void setName(String name) {
        this.name = name;
    }
}
