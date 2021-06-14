package com.cg.spr.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.spr.entities.Feedback;
import com.cg.spr.exception.DoctorNotFoundException;
import com.cg.spr.exception.FeedbackNotFoundException;
import com.cg.spr.dto.FeedbackResponse;
import com.cg.spr.entities.Doctor;
import com.cg.spr.entities.Feedback;
import com.cg.spr.exception.FeedbackNotFoundException;
import com.cg.spr.repository.FeedbackRepository;

@Service
public class FeedbackServiceImpl implements IFeedbackService{

	
	Logger logger = LoggerFactory.getLogger(FeedbackServiceImpl.class);

	@Autowired
	private FeedbackRepository repository;// repository is a dependency of feedbackserviceimpl

	
	
	@Override
	public Feedback addFeedback(Feedback fbd) {
		logger.info("feedback is given by patient",fbd);
		return repository.save(fbd);
	}

	@Override
	public Feedback getFeedback(int feedbackId) throws FeedbackNotFoundException {
		logger.info("got feedback by id",feedbackId);
		Optional<Feedback> feedback = repository.findById(feedbackId);
		if (!feedback.isPresent())
			throw new FeedbackNotFoundException();
		return feedback.get();
	}

	@Override
	public List<Feedback> getAllFeedback() {
	logger.info("list of all feedback");
		return repository.findAll();
	}

	/*@Override
	public List<FeedbackResponse> getJoinInfo() {
		return repository.getJoinInfo();
	}*/
	
	@Override
	public List<Feedback> findFeedbackListByDoctor(Doctor doctorId) {
		List<Feedback> docs = new ArrayList<>();
		repository.findFeedbackListByDoctor(doctorId).forEach(docs :: add);
		return docs;
	}
	

}
