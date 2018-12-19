package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "course_fees")
@EntityListeners(AuditingEntityListener.class) 
@JsonIgnoreProperties(value = { "createdAt", "updatedAt" }, allowGetters = true)

public class Coursefees implements Serializable {
	// this needs to be made a  ordinary column and a new id column added like fee id.
	//it should be made auto generated too..
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long course_fee_id;
	
	@Column(name="course_type")
	private String course_type;
	
	@Column(name="course_duration")
	private String course_duration;
	
	@Column(name="course_fees")
	private int course_fees;
	
	
	@OneToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name ="courseinfo_course_code", nullable =false)
	private Courseinfo courseinfo;
	
	@Override
	public String toString() {
		return "Coursefees [Course_fee_id =" + course_fee_id + ",CourseType =" + course_type + ", CourseDuration =" + course_duration + ", CourseFees =" + course_fees + 
				 "]";
	}
	
	
	public Long getCourse_fee_id() {
		return course_fee_id;
	}

	public void setCourse_fee_id(Long course_fee_id) {
		this.course_fee_id = course_fee_id;
	}

	public String getCourse_type() {
		return course_type;
	}
	public void setCourse_type(String course_type) {
		this.course_type = course_type;
	}
	public String getCourse_duration() {
		return course_duration;
	}
	public void setCourse_duration(String course_duration) {
		this.course_duration = course_duration;
	}
	public int getCourse_fees() {
		return course_fees;
	}
	public void setCourse_fees(int course_fees) {
		this.course_fees = course_fees;
	}
	public Courseinfo getCourseinfo() {
		return courseinfo;
	}
	public void setCourseinfo(Courseinfo courseinfo) {
		this.courseinfo = courseinfo;
	}

}

