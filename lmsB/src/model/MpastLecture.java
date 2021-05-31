package model;

import java.util.Scanner;

public class MpastLecture {
	 private String id;
	 private String lectureName;
	 private String profName;
	 private String credits;
	 private String grade;
	// private String grade;
	 
	 
	 public boolean read_past(Scanner scan) {
	  if(scan.hasNext()) {
		   this.id = scan.next();
		   this.lectureName = scan.next();
		   this.profName = scan.next();
		   this.credits = scan.next();
		   this.grade = scan.next();
		return true;
		}
		  return false;
	 }
	 
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLectureName() {
		return lectureName;
	}
	public void setLectureName(String lectureName) {
		this.lectureName = lectureName;
	}
	public String getProfName() {
		return profName;
	}
	public void setProfName(String profName) {
		this.profName = profName;
	}
	public String getCredits() {
		return credits;
	}
	public void setCredits(String credits) {
		this.credits = credits;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
}
