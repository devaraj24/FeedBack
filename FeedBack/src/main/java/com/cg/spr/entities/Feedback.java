package com.cg.spr.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

@Entity
@Table(name="feedback_tbl")
public class Feedback {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="feedback_id")
	private int feedbackId;
	@Column(name="rating_col")
	@NotNull
	private int rating;
	@Column(name="feedback_comment")
	@NotNull
	private String feedbackComment;
	
	
	@ManyToOne(cascade=CascadeType.MERGE)
	private Doctor doctor;
	
	
	@OneToOne(cascade=CascadeType.MERGE)
	private Patient patient;
	
}
