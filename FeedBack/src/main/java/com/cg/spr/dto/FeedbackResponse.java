package com.cg.spr.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class FeedbackResponse {

	
	private String feedbackComments;
	
	private String doctorname;
}
