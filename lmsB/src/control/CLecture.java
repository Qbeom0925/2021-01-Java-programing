package control;

import java.util.Vector;

import dataAccessObject.DLecture;
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

}