package com.infosys.infytel.CallDetails.Dto;

import java.sql.Date;

import com.infosys.infytel.CallDetails.entity.CallDetails;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CallDetailsDto {

	long calledBy;

	long calledTo;

	Date calledOn;

	int duration;
	
	
	// Converts Entity into DTO
		public static CallDetailsDto valueOf(CallDetails callDetails) {
			CallDetailsDto callsDTO = new CallDetailsDto();
			callsDTO.setCalledBy(callDetails.getCalledBy());
			callsDTO.setCalledOn(callDetails.getCalledOn());
			callsDTO.setCalledTo(callDetails.getCalledTo());
			callsDTO.setDuration(callDetails.getDuration());
			return callsDTO;
		}

}
