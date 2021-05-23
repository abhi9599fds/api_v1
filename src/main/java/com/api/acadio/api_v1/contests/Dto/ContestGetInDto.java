package com.api.acadio.api_v1.contests.Dto;

import javax.validation.constraints.NotNull;


public class ContestGetInDto 
{
    @NotNull
    private Integer contestId;
    @NotNull
    private Integer mid;
    
    
    public Integer getMid() {
        return mid;
    }
    public Integer getContestId() {
        return contestId;
    }
    public void setContestId(Integer contestId) {
        this.contestId = contestId;
    }
    public void setMid(Integer mid) {
        this.mid = mid;
    }
}
