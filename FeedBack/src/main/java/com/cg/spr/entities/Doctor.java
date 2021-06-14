package com.cg.spr.entities;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.cg.spr.entities.Feedback;

import lombok.Data;
	import lombok.NoArgsConstructor;

	@Data
	@NoArgsConstructor
	@Entity
	@Table(name ="doctor_table")
	public class Doctor {
		
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		public int doctorId;
		
		@Column(name = "doctorName")
		@NotNull
		@Size(min = 4 , message = "Please enter atleast 4 characters in your name ")
		public String doctorName;
		
		@NotNull
		public String speciality;
		
		public String location;
		public String hospitalName;
		
		@Column(name = "mobileNo")
		@NotNull
		@Size(min = 10,message = "please enter 10 digits of your moblie number")
		@Pattern(regexp = "[0-9]{10}")
		public String mobileNo;
		
		@Column(name ="email")
		@Email
		public String email;
		@Column (name= "chargedPerVisit")
		private double chargedPerVisit;
	
		/*@OneToMany(targetEntity = Feedback.class, cascade = CascadeType.ALL)
	    @JoinColumn(name = "cp_fk",referencedColumnName = "id")
	    private List<Feedback> feedback;*/
		
		}

	
