package dataAccessObject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.Vector;

import model.MLecture;
import valueObject.OHwewon;
import valueObject.OLecture;

public class DGrade {
	private MLecture mLecture;
	
	public DGrade() {
	}
	

	public String SreadAll(OHwewon oHwewon) {
		String Grade = null ;
		try {
			File file = new File("user/" + oHwewon.getId() + "_sinchoen.txt");
			   Scanner scan = new Scanner(file);
			   this.mLecture = new MLecture();
			   int max = 0;
			  while(mLecture.read(scan)){
				    OLecture oLecture = new OLecture();
					oLecture.setCredits(mLecture.getCredits());
				 max = max + Integer.parseInt(oLecture.getCredits());
				   }
			  Grade=Integer.toString(max);

	}catch (Exception e) {
		
	}		
		return Grade;
	}

	
	public String MreadAll(OHwewon oHwewon) {
		String Grade = null ;
		try {
			File file = new File("user/" + oHwewon.getId() + "_bag.txt");
			   Scanner scan = new Scanner(file);
			   this.mLecture = new MLecture();
			   int max = 0;
			  while(mLecture.read(scan)){
				    OLecture oLecture = new OLecture();
					oLecture.setCredits(mLecture.getCredits());
				 max = max + Integer.parseInt(oLecture.getCredits());
				   }
			  Grade=Integer.toString(max);

	}catch (Exception e) {
		
	}		
		return Grade;
}
	}
