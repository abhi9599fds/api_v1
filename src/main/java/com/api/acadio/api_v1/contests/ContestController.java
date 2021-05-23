package com.api.acadio.api_v1.contests;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import com.api.acadio.api_v1.contests.Dto.ContestGetDto;
import com.api.acadio.api_v1.contests.Dto.ContestGetInDto;
import com.api.acadio.api_v1.contests.Dto.ContestInDto;
import com.api.acadio.api_v1.contests.Dto.MessageDto;
import com.api.acadio.api_v1.users.UserModel;
import com.api.acadio.api_v1.users.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContestController 
{
    @Autowired
    private ContestRepository contestRepository;

    @Autowired
    private UserRepository userRepository;

    @PostMapping(value = "contest/create")
    public ResponseEntity<?> createContest(@Valid @RequestBody ContestInDto dto)  
    {
        try 
        {
            ContestModel data = new ContestModel();
            Optional<UserModel> user =  userRepository.findById(dto.getUserId());
            if(!user.isPresent())
            {
                return new ResponseEntity<MessageDto>(new MessageDto("User not found"), HttpStatus.BAD_REQUEST);    
            }

            if(!user.get().getTypeUser().equals("owner"))
            {
                return new ResponseEntity<MessageDto>(new MessageDto("Not Created"), HttpStatus.BAD_REQUEST);
            }

            data.setUser(user.get());
            data.setTalent(dto.getTalent());
            data.setContestName(dto.getContestName());
            data.setCoverPic(dto.getCoverPic());
            data.setCurr(dto.getCurr());
            data.setDescription(dto.getDescription());
            data.setFees(dto.getFees());
            data.setCerti(dto.isCerti());
            data.setPrize1(dto.getPrize1());
            data.setPrize2(dto.getPrize2());
            data.setPrize3(dto.getPrize3());
            data.setEndContest(false);
            contestRepository.save(data);
            return ResponseEntity.ok(new MessageDto("ok"));           
        } 
        catch (Exception e) 
        {
            return new ResponseEntity<MessageDto>(new MessageDto(e.getLocalizedMessage()), HttpStatus.BAD_REQUEST);
        }
        
    }

    @PostMapping(value = "contest/getContest")
    public ResponseEntity<?> getContest(@Valid @RequestBody ContestGetInDto dto) 
    {
        try 
        {
            Integer page_limit = 6;
            List<ContestGetDto> data = contestRepository.getContest(dto.getContestId(),page_limit , (dto.getMid() -1)*page_limit);
            return ResponseEntity.ok(data);
            
        } catch (Exception e) {
            return new ResponseEntity<MessageDto>(new MessageDto(e.getLocalizedMessage()), HttpStatus.BAD_REQUEST);
            
        }
        
    }
    
}
