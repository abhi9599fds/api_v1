package com.api.acadio.api_v1.contests.Dto;

import org.springframework.beans.factory.annotation.Value;

public interface ContestGetDto {

    @Value("#{target.user_id}")
    Integer getUserId();

    @Value("#{target.profile_pic}")
    String getProfilePic();

    @Value("#{target.academy}")
    String getAcademy();

    @Value("#{target.name}")
    String getName();

    @Value("#{target.contest_id}")
    Integer getContestId();

    @Value("#{target.talent}")
    String getTalent();

    @Value("#{target.prize1}")
    Integer getPrize1();
    @Value("#{target.prize2}")
    Integer getPrize2();
    @Value("#{target.prize3}")
    Integer getPrize3();

    @Value("#{target.contest_name}")
    String getContestName();
    @Value("#{target.description}")
    String getDescription();

    @Value("#{target.certi}")
    boolean getCerti();

    @Value("#{target.cover_pic}")
    String getCoverPic();

    @Value("#{target.fees}")
    Float getFees();

    @Value("#{target.curr}")
    String getCurr();



    
    
}
