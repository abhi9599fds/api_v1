

package com.api.acadio.api_v1.contests;

import java.util.List;

import com.api.acadio.api_v1.contests.Dto.ContestGetDto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface ContestRepository extends JpaRepository<ContestModel,Integer> {

    @Query(nativeQuery = true , value = "select user_model.profile_pic as profile_pic ,user_model.academy as academy,user_model.name as name,contest_model.* " 
                                         +"from user_model , contest_model  where user_model.user_id = contest_model.user_id and contest_model.contest_id =:contest_id " 
                                         +"order by contest_id desc limit :limit offset :offset")
    List<ContestGetDto> getContest(@Param("contest_id") Integer contest_id,@Param("limit") Integer limit, @Param("offset") Integer offset);

    
}
