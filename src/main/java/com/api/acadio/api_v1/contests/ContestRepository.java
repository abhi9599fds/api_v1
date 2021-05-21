

package com.api.acadio.api_v1.contests;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ContestRepository extends JpaRepository<ContestModel,Integer> {
    
}
