package com.student.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Numetry_student")
public class Student implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@SequenceGenerator(name = "gen1", sequenceName = "student_seq", allocationSize = 1, initialValue = 1)
	@GeneratedValue(generator = "gen1", strategy = GenerationType.SEQUENCE)
	@Column(name = "STUD_ROLL_NO")
	private Integer studRollNo;
	
	@Column(name = "STUD_NAME", length = 50)
	private String studName;
	
	@Column(name = "SCHOOL_NAME", length = 50)
	private String schoolName;
	
	@Column(name = "STUD_ADDRS", length = 50)
	private String studAddrs;
	
	@Column(name = "PARENTS_NAME", length = 50)
	private String parentsName;

	public Integer getStudRollNo() {
		return studRollNo;
	}

	public void setStudRollNo(Integer studRollNo) {
		this.studRollNo = studRollNo;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getStudAddrs() {
		return studAddrs;
	}

	public void setStudAddrs(String studAddrs) {
		this.studAddrs = studAddrs;
	}

	public String getParentsName() {
		return parentsName;
	}

	public void setParentsName(String parentsName) {
		this.parentsName = parentsName;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
