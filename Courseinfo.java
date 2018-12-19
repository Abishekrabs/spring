package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "course_info")
@EntityListeners(AuditingEntityListener.class) 
@JsonIgnoreProperties(value = { "createdAt", "updatedAt" }, allowGetters = true)

public class Courseinfo implements Serializable {
	
	@Id
	private String course_code;
	
	@OneToOne(fetch = FetchType.LAZY,
			  cascade = CascadeType.ALL,
			  mappedBy = "courseinfo")
	private Coursefees coursefees;
	
	@Column(name="course_name")
	private String course_name;
	
	@Column(name="participant_strength")
	private int participant_strength;
	
	@Column(name="course_description")
	private String course_description;

	@Override
	public String toString() {
		return "Courseinfo [CourseCode =" + course_code + ", CourseName =" + course_name + ", ParticipantStrength =" + participant_strength + ", CourseDesc =" + course_description + 
				"]";
	}
	
	public String getCourse_code() {
		return course_code;
	}

	public void setCourse_code(String course_code) {
		this.course_code = course_code;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public int getParticipant_strength() {
		return participant_strength;
	}

	public void setParticipant_strength(int participant_strength) {
		this.participant_strength = participant_strength;
	}

	public String getCourse_description() {
		return course_description;
	}

	public void setCourse_description(String course_description) {
		this.course_description = course_description;
	}

	public Coursefees getCoursefees() {
		return coursefees;
	}

	public void setCoursefees(Coursefees coursefees) {
		this.coursefees = coursefees;
	}

}

