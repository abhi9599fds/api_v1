package com.api.acadio.api_v1.like;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.api.acadio.api_v1.posts.PostModel;
import com.api.acadio.api_v1.users.UserModel;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"post_id","user_id"}))
public class LikeModel 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    
    @ManyToOne
    @JoinColumn(name = "post_id")
    @JsonIgnore
    private PostModel post;


    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonIgnore
    private UserModel user;

    private boolean liked;

    public PostModel getPost() {
        return post;
    }

    public boolean isLiked() {
        return liked;
    }

    public void setLiked(boolean liked) {
        this.liked = liked;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public UserModel getUser() {
        return user;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }

    public void setPost(PostModel post) {
        this.post = post;
    }
    
}
