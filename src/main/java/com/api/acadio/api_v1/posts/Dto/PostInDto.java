package com.api.acadio.api_v1.posts.Dto;

import javax.validation.constraints.NotNull;

public class PostInDto 
{
    @NotNull
    private Integer userId;
    @NotNull
    private Integer contestId;
    @NotNull
    private String path;
    @NotNull
    private String coverPic;
    @NotNull
    private String caption;
    @NotNull
    private String postType;
    
    public Integer getUserId() {
        return userId;
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
    public Integer getContestId() {
        return contestId;
    }
    public void setContestId(Integer contestId) {
        this.contestId = contestId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    
}
