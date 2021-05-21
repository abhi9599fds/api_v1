package com.api.acadio.api_v1.comment;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.api.acadio.api_v1.posts.PostModel;
import com.api.acadio.api_v1.users.UserModel;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class CommentModel 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonIgnore
    private UserModel user;


    @ManyToOne
    @JoinColumn(name = "post_id")
    @JsonIgnore
    private PostModel post;

    private String comment;

    @JsonFormat(pattern = "dd-MM-yyyy  HH:mm:ss.SSSZ")
    private Date dateNow;

    public UserModel getUser() {
        return user;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Date getDateNow() {
        return dateNow;
    }
    public void setDateNow(Date dateNow) {
        this.dateNow = dateNow;
    }
    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }
    public PostModel getPost() {
        return post;
    }
    public void setPost(PostModel post) {
        this.post = post;
    }
    public void setUser(UserModel user) {
        this.user = user;
    }    
}
