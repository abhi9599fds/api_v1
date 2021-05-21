package com.api.acadio.api_v1.follow;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.api.acadio.api_v1.users.UserModel;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(uniqueConstraints =  @UniqueConstraint( columnNames = {"follow_uid","following_oid"}))
public class FollowModel 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "follow_uid")
    @JsonIgnore
    private UserModel followUid;

    @ManyToOne
    @JoinColumn(name = "following_oid")
    @JsonIgnore
    private UserModel followingOid;

    public Integer getId() {
        return id;
    }
    public UserModel getFollowingOid() {
        return followingOid;
    }
    public void setFollowingOid(UserModel followingOid) {
        this.followingOid = followingOid;
    }
    public UserModel getFollowUid() {
        return followUid;
    }
    public void setFollowUid(UserModel followUid) {
        this.followUid = followUid;
    }
    public void setId(Integer id) {
        this.id = id;
    }
}
