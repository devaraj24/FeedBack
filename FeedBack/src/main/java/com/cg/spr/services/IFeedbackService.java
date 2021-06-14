package com.cg.spr.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.spr.dto.FeedbackResponse;
import com.cg.spr.entities.Doctor;
import com.cg.spr.entities.Feedback;
import com.cg.spr.exception.DoctorNotFoundException;
import com.cg.spr.exception.FeedbackNotFoundException;

@Service
public interface IFeedbackService {


	Feedback addFeedback(Feedback fbd);
	
	Feedback getFeedback(int feedbackId) throws FeedbackNotFoundException;
	
	public List<Feedback> findFeedbackListByDoctor(Doctor doctorId); 
	
	//List<FeedbackResponse> getJoinInfo();

	List<Feedback> getAllFeedback();
	
}
