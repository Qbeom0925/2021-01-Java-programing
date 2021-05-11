package model;

import java.io.BufferedWriter;
import java.util.Scanner;

import valueObject.OBag;

public class MBag {

	private String id;
	private String lectureName;
	private String profName;
	private String credits;
	private String time;
	
	public void save(BufferedWriter bw, OBag oBag) {
		this.set(oBag);
		try {
			bw.write(id+"/"+lectureName+'/'+profName+'/'+credits+"/"+time);
			bw.newLine();
			bw.flush();
			bw.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void set(OBag oBag) {
		this.id=oBag.getId();
		this.lectureName=oBag.getLectureName();
		this.profName=oBag.getProfName();
		this.credits=oBag.getCredits();
		this.time=oBag.getTime();
				
	}
	private boolean read(Scanner scan) {
		if(scan.hasNext()) {
			this.id = scan.next();
			this.lectureName = scan.next();
			this.profName = scan.next();
			this.credits = scan.next();
			this.time = scan.next();
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

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

}
