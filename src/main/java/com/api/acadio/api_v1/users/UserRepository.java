package com.api.acadio.api_v1.users;

import com.api.acadio.api_v1.users.Dto.UserGetDto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;



@Repository
public interface UserRepository extends JpaRepository<UserModel ,Integer> 
{
    @Query( nativeQuery = true,value = "select email,password from user_model where email =:email")
    UserGetDto getLoginDetails(@Param("email") String email);
}
