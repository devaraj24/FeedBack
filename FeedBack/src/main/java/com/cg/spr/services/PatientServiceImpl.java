package com.cg.spr.services;

import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.spr.entities.Feedback;
import com.cg.spr.entities.Patient;
import com.cg.spr.exception.PatientNotFoundException;
import com.cg.spr.repository.FeedbackRepository;
import com.cg.spr.repository.PatientRepository;

@Service
public class PatientServiceImpl implements IPatientService {

	

	Logger logger = LoggerFactory.getLogger(PatientServiceImpl.class);
	
	@Autowired
	private PatientRepository ptrepository;

	@Override
	public Patient addPatient(Patient pt) {
		logger.info("feedback is given by patient",pt);
		return ptrepository.save(pt);
	}

	
}