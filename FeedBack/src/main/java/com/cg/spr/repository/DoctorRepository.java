package com.cg.spr.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.spr.dto.FeedbackResponse;
import com.cg.spr.entities.Doctor;
import com.cg.spr.entities.Feedback;

@Repository
public interface DoctorRepository  extends JpaRepository<Doctor,Integer>{

	
}
