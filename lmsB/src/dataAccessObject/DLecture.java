package dataAccessObject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

import model.MIndex;
import model.MLecture;
import model.MpastLecture;
import valueObject.OHwewon;
import valueObject.OIndex;
import valueObject.OLecture;
import valueObject.OpastLecture;

public class DLecture {
	private MLecture mLecture;
	private MpastLecture mpastLecture;
	
	private static final String PATHNAME="data/";
 public DLecture() {
	 
 }
 
 public Vector<OLecture> readAll(String fileName){
  Vector<OLecture> lectures = new Vector<OLecture>();
  
  try {
   File file = new File(PATHNAME+fileName);
   Scanner scan = new Scanner(file);
   this.mLecture = new MLecture();
   while(mLecture.read(scan)){
    OLecture oLecture = new OLecture();
    oLecture.set(mLecture);
    lectures.add(oLecture);
   }
   scan.close();
  } catch (FileNotFoundException e) {
   e.printStackTrace();
  }
  return lectures;
 }


 public float readpast(OHwewon oHwewon) {
	 float Avggrade = 0;
	    int sumcredit=0;
	    String grade;
	    float Sumgrade = 0;
	 Vector<OpastLecture> lectures = new Vector<OpastLecture>();
	  try {
	   File file = new File("user/" + oHwewon.getId() + "_past.txt");
	   Scanner scan = new Scanner(file);
	   this.mpastLecture = new MpastLecture();
	   while(mpastLecture.read_past(scan)){
	    OpastLecture opastLecture = new OpastLecture();
	    opastLecture.set(mpastLecture);
	    grade=opastLecture.getGrade();
	    if("A+".equals(grade)) {
	    	 Sumgrade+=(float) 4.5*Integer.parseInt(opastLecture.getCredits());
	    }else if("A0".equals(grade)){
	    	 Sumgrade+=(float) 4.0*Integer.parseInt(opastLecture.getCredits());
	    }else if("B+".equals(grade)) {
	    	 Sumgrade+=(float) 3.5*Integer.parseInt(opastLecture.getCredits());
	    }else if("B0".equals(grade)) {
	    	 Sumgrade+=(float) 3.0*Integer.parseInt(opastLecture.getCredits());
	    }else if("C+".equals(grade)) {
	    	 Sumgrade+=(float) 2.5*Integer.parseInt(opastLecture.getCredits());
	    }else if("C0".equals(grade)) {
	    	 Sumgrade+=(float) 2.0*Integer.parseInt(opastLecture.getCredits());
	    }else if("D+".equals(grade)) {
	    	 Sumgrade+=(float) 1.5*Integer.parseInt(opastLecture.getCredits());
	    }else if("D0".equals(grade)) {
	    	 Sumgrade+=(float) 1.0*Integer.parseInt(opastLecture.getCredits());
	    }else if("F".equals(grade)) {
	    	 Sumgrade+=(float) 0*Integer.parseInt(opastLecture.getCredits());
	    }
	    sumcredit +=  Integer.parseInt(opastLecture.getCredits());
	    lectures.add(opastLecture);
	   }
	   Avggrade=(float) (Sumgrade/sumcredit);
	   scan.close();
	  } catch (FileNotFoundException e) {
	   e.printStackTrace();
	  }
	  return Avggrade;
 }




}