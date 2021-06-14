package com.cg.spr.exception;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.cg.spr.dto.FeedbackResponse;

public class FeedbackNotFoundException extends Exception{

	

  //  @Query("SELECT new com.cg.cms.dto.FeedbackResponse(c.firstName, p.pName) FROM Customer c JOIN c.products p")
   // public List<FeedbackResponse> getJoinInfo();
    
}
