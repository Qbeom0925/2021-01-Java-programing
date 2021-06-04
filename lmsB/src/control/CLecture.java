package control;

import java.util.Vector;

import dataAccessObject.DLecture;
import valueObject.OHwewon;
import valueObject.OIndex;
import valueObject.OLecture;

public class CLecture {
 
 private DLecture dLecture;
 
 public CLecture() {
  this.dLecture = new DLecture();
 }

 public Vector<OLecture> getAll(String departmentFileName) {
  Vector<OLecture> lectures = this.dLecture.readAll(departmentFileName);
  return lectures;
 }
 
 public Vector<OLecture> WMiridamgi(String departmentFileName) {
	  Vector<OLecture> lectures = this.dLecture.WMiridamgiAll(departmentFileName);
	  return lectures;
}
	 
public float getpast(OHwewon oHwewon) {
	
	float avggrade = this.dLecture.readpast(oHwewon);
	  return avggrade;
}

public void CaddLecture(String fileName) {
	this.dLecture.DaddLecture(fileName);
	
}

public void Cdeletelecture(String fileName) {
	this.dLecture.DdelteLecture(fileName);
	
}

public void CchangeLecture(String fileName) {
	this.dLecture.DchangeLecture(fileName);
}

public Vector<OLecture> WSincheon(String departmentFileName) {
	Vector<OLecture> lectures = this.dLecture.WSincheon(departmentFileName);
	  return lectures;
}


}