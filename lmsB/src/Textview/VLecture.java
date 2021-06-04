	package Textview;
	
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

	public void VaddLecture(String FileName) {
		System.out.println("현재 존재하는 과목입니다.");
		  
		  Vector<OLecture> lectures = cLecture.getAll(FileName);
		  for(OLecture lecture: lectures) {
		   System.out.println(lecture.getId()+ " "
				   				+lecture.getLectureName()+" "
				   				+lecture.getProfName()+" "
				   				+lecture.getCredits()+" "
				   				+lecture.getTime());
		  }
		this.cLecture.CaddLecture(FileName);
	}

	public void VdelteLecture(String FileName) {
		this.cLecture.Cdeletelecture(FileName);
	}

	public void VchangeLecture(String FileName) {
		this.cLecture.CchangeLecture(FileName);		
	}
	 
}