package com.api.acadio.api_v1.contests.Dto;

import javax.validation.constraints.NotNull;

public class ContestInDto 
{
    @NotNull
    private Integer userId;
    @NotNull
    private String talent;
    @NotNull
    private Integer prize1;
    @NotNull
    private Integer prize2;
    @NotNull
    private Integer prize3;
    @NotNull
    private String contestName;
    @NotNull
    private String description;
    @NotNull
    private boolean certi;
    @NotNull
    private String curr;
    @NotNull
    private Float fees;
    @NotNull
    private String coverPic;

    public Integer getUserId() {
        return userId;
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
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
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
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

}
