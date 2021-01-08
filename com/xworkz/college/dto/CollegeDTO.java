package com.xworkz.college.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="collegedb")
public class CollegeDTO implements java.io.Serializable{
	@Id
	@Column(name="COLLEGE_ID")
	private int college_id;
	
	@Column(name="CNAME")
	private String cname;
	
	@Column(name="CLOCATION")
	private String clocation;
	
	@Column(name="NOOFSTUDENT")
	private int noofstudent;
	
	@Column(name="NOOFROOMS")
	private int noofrooms;
	
	@Column(name="NOOFBRANCHES")
	private int noofbranches;
	
	public CollegeDTO() {
		System.out.println(this.getClass().getSimpleName() + "Default Constructor");
	}
	
	public CollegeDTO(int collegeID, String cname, String clocation, int noofstudent, int noofrooms, int noofbranches) {
		super();
		this.college_id = collegeID;
		this.cname = cname;
		this.clocation = clocation;
		this.noofstudent = noofstudent;
		this.noofrooms = noofrooms;
		this.noofbranches = noofbranches;
	}

	public int getCollegeID() {
		return college_id;
	}

	public void setCollegeID(int college_id) {
		this.college_id = college_id;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getClocation() {
		return clocation;
	}

	public void setClocation(String clocation) {
		this.clocation = clocation;
	}

	public int getNoofstudent() {
		return noofstudent;
	}

	public void setNoofstudent(int noofstudent) {
		this.noofstudent = noofstudent;
	}

	public int getNoofrooms() {
		return noofrooms;
	}

	public void setNoofrooms(int noofrooms) {
		this.noofrooms = noofrooms;
	}

	public int getNoofbranches() {
		return noofbranches;
	}

	public void setNoofbranches(int noofbranches) {
		this.noofbranches = noofbranches;
	}

	@Override
	public String toString() {
		
		String formattedata = String.format("%-6s%-6s%-8s%-8s%-9s%s",college_id,cname,clocation,noofstudent,noofrooms,noofbranches);
		return formattedata;
	}
	
	
	
	

}
