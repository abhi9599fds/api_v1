package com.api.acadio.api_v1.posts;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.api.acadio.api_v1.comment.CommentModel;
import com.api.acadio.api_v1.contests.ContestModel;
import com.api.acadio.api_v1.like.LikeModel;
import com.api.acadio.api_v1.users.UserModel;
import com.fasterxml.jackson.annotation.JsonIgnore;




@Entity
public class PostModel 
{    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "post_id")
    private Integer id;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "contest_id")
    private ContestModel contest;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "user_id")
    private UserModel user;

    
    private String path;
    private String coverPic;
    private String caption;
    private String postType;

    @OneToMany(mappedBy = "post")
    private List<CommentModel> comments;
    
    @OneToMany(mappedBy = "post")
    private List<LikeModel> likemodels;
    
    private Integer likes = 0;

    protected PostModel(){}

    public UserModel getUser() {
        return user;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }

    public List<CommentModel> getComments() {
        return comments;
    }

    public void setComments(List<CommentModel> comments) {
        this.comments = comments;
    }

    public ContestModel getContest() {
        return contest;
    }

    public void setContest(ContestModel contest) {
        this.contest = contest;
    }

    protected PostModel(String path,String coverPic,String caption, String postType){
        this.path = path;
        this.coverPic = coverPic;
        this.caption = caption;
        this.postType = postType;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        if(this.likes + likes >= 0)
            this.likes = likes;
        else
            this.likes = 0;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getCoverPic() {
        return coverPic;
    }

    public void setCoverPic(String coverPic) {
        this.coverPic = coverPic;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }


    
}
