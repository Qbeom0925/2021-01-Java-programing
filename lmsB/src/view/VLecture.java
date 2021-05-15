	package view;
	
	import java.util.Scanner;
	import java.util.Vector;
	
	import control.CIndex;
	import control.CLecture;
	import valueObject.OLecture;
	
	public class VLecture {
	 private Scanner scan;
	 private CLecture cLecture;
	
	 public VLecture(Scanner scan) {
	  this.scan = scan;
	  this.cLecture = new CLecture();
	 }
	
	 public OLecture show(String FileName, String message) {
	  System.out.println(message+" 선택하세요..");
	  
	  Vector<OLecture> lectures = cLecture.getAll(FileName);
	  for(OLecture lecture: lectures) {
	   System.out.println(lecture.getId()+ " "
			   				+lecture.getLectureName()+" "
			   				+lecture.getProfName()+" "
			   				+lecture.getCredits()+" "
			   				+lecture.getTime());
	  }
	  String id = this.scan.next();
	  for(OLecture lecture: lectures) {
	   if(lecture.getId().equals(id)) {
	    return lecture;
	   }
	  }
	  return null;
	 }
}