package com.cg.spr.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cg.spr.dto.FeedbackResponse;
import com.cg.spr.entities.Doctor;
import com.cg.spr.entities.Feedback;
import com.cg.spr.entities.Patient;
import com.cg.spr.exception.DoctorNotFoundException;
import com.cg.spr.exception.FeedbackNotFoundException;
import com.cg.spr.services.IDoctorService;
import com.cg.spr.services.IFeedbackService;
import com.cg.spr.services.IPatientService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/feedback")
public class FeedbackController {


    Logger logger = LoggerFactory.getLogger(FeedbackController.class);


    @Autowired
    private IFeedbackService service;// CustomerService is a dependency of CustomerContoller
    @Autowired 
    private IDoctorService docservice;
    
    @Autowired
    private IPatientService ptservice;
    
    @PostMapping("savefeedback/{fbd}")
    @ApiOperation("adding a new feedback ")
    public Feedback addfeedback(@Valid @RequestBody Feedback fbd) {
    return service.addFeedback(fbd);
    }
    
    
    @PostMapping("savepatient/{pt}")
    @ApiOperation("adding a new patient ")
    public Patient addpatient(@Valid @RequestBody Patient pt) {
    return ptservice.addPatient(pt);
    }
    
    @GetMapping("getfeedbackbyId/{feedbackId}")
    @ApiOperation("getting feedback by Id")
    public Feedback fetchById(@PathVariable int feedbackId) throws FeedbackNotFoundException {
    return service.getFeedback(feedbackId);
    }
	
    @GetMapping("/fetchAllFeedbacks")
    @ApiOperation("all feedbacks")
    public List<Feedback> fetch() {
    	return service.getAllFeedback();
    }
   
	@GetMapping("/feedbacksList/getByDoctor/{doctorid}")
	@ApiOperation("doctor feedback")
	public List<Feedback> findByDoctor( @PathVariable Doctor doctorid){
		return service.findFeedbackListByDoctor(doctorid);
	}
	

	/*@GetMapping("/getJoinInfo")
	public List<FeedbackResponse> getJoinInfo() {
		return docservice.getJoinInfo();
	}*/
}
