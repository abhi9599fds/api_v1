package com.api.acadio.api_v1.contests;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.api.acadio.api_v1.posts.PostModel;
import com.api.acadio.api_v1.users.UserModel;
import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class ContestModel 
{
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contest_id")
    @Id
    private Integer id;
    
    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonIgnore
    private UserModel user;

    @OneToMany(mappedBy = "contest")
    private List<PostModel> posts;

    private String talent;
    private Integer prize1;
    private Integer prize2;
    private Integer prize3;

    private String contestName;
    private String description;
    private boolean certi;
    private String curr;
    private Float fees;
    private String coverPic;
    
    @Column(nullable = true)
    private Date end_dt;
    
    private boolean endContest=false;

    public Integer getId() {
        return id;
    }

    public boolean isEndContest() {
        return endContest;
    }

    public void setEndContest(boolean endContest) {
        this.endContest = endContest;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<PostModel> getPosts() {
        return posts;
    }

    public void setPosts(List<PostModel> posts) {
        this.posts = posts;
    }

    public Date getEnd_dt() {
        return end_dt;
    }

    public void setEnd_dt(Date end_dt) {
        this.end_dt = end_dt;
    }

    public String getCoverPic() {
        return coverPic;
    }

    public void setCoverPic(String coverPic) {
        this.coverPic = coverPic;
    }

    public Float getFees() {
        return fees;
    }

    public void setFees(Float fees) {
        this.fees = fees;
    }

    public String getCurr() {
        return curr;
    }

    public void setCurr(String curr) {
        this.curr = curr;
    }

    public boolean isCerti() {
        return certi;
    }

    public void setCerti(boolean certi) {
        this.certi = certi;
    }

    public String getContestName() {
        return contestName;
    }

    public void setContestName(String contestName) {
        this.contestName = contestName;
    }

    public Integer getPrize3() {
        return prize3;
    }

    public void setPrize3(Integer prize3) {
        this.prize3 = prize3;
    }

    public Integer getPrize2() {
        return prize2;
    }

    public void setPrize2(Integer prize2) {
        this.prize2 = prize2;
    }

    public Integer getPrize1() {
        return prize1;
    }

    public void setPrize1(Integer prize1) {
        this.prize1 = prize1;
    }

    public String getTalent() {
        return talent;
    }

    public void setTalent(String talent) {
        this.talent = talent;
    }

    public UserModel getUser() {
        return user;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
}
