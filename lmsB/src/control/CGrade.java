package control;

import java.util.Vector;

import dataAccessObject.DGrade;
import valueObject.OHwewon;
import valueObject.OLecture;

public class CGrade {
	
	private DGrade dGrade;

	public CGrade() {
	this.dGrade=new DGrade();
	}
	

	public String SgetAll(OHwewon oHwewon) {
		 String grade = this.dGrade.SreadAll(oHwewon);
		  return grade;
	}
	
	public String MgetAll(OHwewon oHwewon) {
		 String grade = this.dGrade.MreadAll(oHwewon);
		  return grade;
	}
}
