package com.cg.spr.services;
import java.util.ArrayList;
import java.util.List;


import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.spr.dto.FeedbackResponse;
import com.cg.spr.entities.Doctor;
import com.cg.spr.entities.Feedback;
import com.cg.spr.exception.DoctorNotFoundException;
import com.cg.spr.exception.FeedbackNotFoundException;
import com.cg.spr.repository.DoctorRepository;
import com.cg.spr.repository.FeedbackRepository;

@Service
public  class DoctorServiceImpl implements IDoctorService {

	
	@Autowired
	private DoctorRepository  docrepository;

	/*@Override
	public List<FeedbackResponse> getJoinInfo() {
		return docrepository.getJoinInfo();
		
	}	*/
}


