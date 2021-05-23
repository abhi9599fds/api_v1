package com.api.acadio.api_v1.users;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Email;

import com.api.acadio.api_v1.comment.CommentModel;
import com.api.acadio.api_v1.contests.ContestModel;
import com.api.acadio.api_v1.follow.FollowModel;
import com.api.acadio.api_v1.like.LikeModel;
import com.api.acadio.api_v1.posts.PostModel;

import org.hibernate.annotations.ColumnDefault;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"email"}))
public class UserModel 
{    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer id;
    private String name;
    private String phn;
    @Email
    private String email;
    private String password;
    private String academy;
    private String typeUser;
    private String profilePic;
    private String bio;
    private String socialHandle;
    
    private Integer followers = 0;
    private Integer following = 0;

    @OneToMany(mappedBy = "user")
    private List<CommentModel> comments;
    @OneToMany(mappedBy = "user")
    private List<LikeModel> likes;
    
    @OneToMany(mappedBy = "user")
    private List<PostModel> posts;
    @OneToMany(mappedBy = "user")
    private List<ContestModel> contests;

    @OneToMany(mappedBy = "followUid")
    private List<FollowModel> followUid;
    
    @OneToMany(mappedBy = "followingOid")
    private List<FollowModel> followingOid;

    protected UserModel(){

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<CommentModel> getComments() {
        return comments;
    }

    public void setComments(List<CommentModel> comments) {
        this.comments = comments;
    }

    public List<LikeModel> getLikes() {
        return likes;
    }

    public void setLikes(List<LikeModel> likes) {
        this.likes = likes;
    }

    public List<FollowModel> getFollowingOid() {
        return followingOid;
    }

    public void setFollowingOid(List<FollowModel> followingOid) {
        this.followingOid = followingOid;
    }

    public List<FollowModel> getFollowUid() {
        return followUid;
    }

    public void setFollowUid(List<FollowModel> followUid) {
        this.followUid = followUid;
    }

    public List<ContestModel> getContests() {
        return contests;
    }

    public void setContests(List<ContestModel> contests) {
        this.contests = contests;
    }

    public List<PostModel> getPosts() {
        return posts;
    }

    public void setPosts(List<PostModel> posts) {
        this.posts = posts;
    }

    public Integer getFollowing() {
        return following;
    }

    public void setFollowing(Integer following) {
        if(this.following + following >= 0)
            this.following = following;
        else {
            this.following = 0;
        }
    }

    public Integer getFollowers() {
        return followers;
    }

    public void setFollowers(Integer followers) {
        if(this.followers + followers >= 0)
            this.followers = followers;
        else {
            this.followers = 0;
        }
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


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhn() {
        return phn;
    }

    public void setPhn(String phn) {
        this.phn = phn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // public UserModel(String name ,String phn,String email,byte[] passwordHash,byte[] passwordSalt,String academy,
    //                  String typeUser,String profilePic,String bio,String socialHandle)
    // {
    //     this.setName(name);
    //     this.setPhn(phn);
    //     this.setEmail(email);
    //     this.setPasswordHash(passwordHash);
    //     this.setPasswordSalt(passwordSalt);
    //     this.setAcademy(academy);
    //     this.setTypeUser(typeUser);
    //     this.setProfilePic(profilePic);
    //     this.setBio(bio);
    //     this.setSocialHandle(socialHandle);
    // }
    
}
