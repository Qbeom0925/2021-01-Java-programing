package valueObject;

import model.MLecture;
import model.MpastLecture;

public class OpastLecture {
	 private String id;
	 private String lectureName;
	 private String profName;
	 private String credits;
	 private String grade;
	 
	 public void set(MpastLecture mpastLecture) {
		  this.setId(mpastLecture.getId());
		  this.setLectureName(mpastLecture.getLectureName());
		  this.setProfName(mpastLecture.getProfName());
		  this.setCredits(mpastLecture.getCredits());
		  this.setGrade(mpastLecture.getGrade());
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
