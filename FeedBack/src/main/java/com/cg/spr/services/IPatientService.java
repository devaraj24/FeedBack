package com.cg.spr.services;
	
import java.util.List;

import com.cg.spr.entities.Feedback;
import com.cg.spr.entities.Patient;
import com.cg.spr.exception.PatientNotFoundException;
	
	public interface IPatientService {

	Patient addPatient(Patient pt);
	}

