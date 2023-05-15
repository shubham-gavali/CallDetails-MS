package com.infosys.infytel.CallDetails.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CallDetails {

	@Id
	@GeneratedValue
	Long id;
	@Column(nullable = false)
	long calledBy;
	@Column(nullable = false)
	long calledTo;
	@Column(nullable = false)
	Date calledOn;
	@Column(nullable = false)
	int duration;
}
