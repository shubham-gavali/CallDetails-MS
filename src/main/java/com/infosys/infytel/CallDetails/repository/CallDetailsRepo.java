package com.infosys.infytel.CallDetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infosys.infytel.CallDetails.entity.CallDetails;

public interface CallDetailsRepo extends JpaRepository<CallDetails, Long>{

}
