package control;

import java.util.Scanner;

import dataAccessObject.DSugansincheon;
import valueObject.OHwewon;
import valueObject.OLecture;

public class CSugansincheon {

	private Scanner scanner;
	private DSugansincheon dSugansincheon;
	
	public CSugansincheon(Scanner scanner) {
		this.scanner = scanner;
		this.dSugansincheon = new DSugansincheon(this.scanner);
	}
	
	public void save(OLecture oLecture, OHwewon oHwewon) {
		this.dSugansincheon.save(oLecture,oHwewon);

	}
	
	public void delete(OHwewon oHwewon) {
		this.dSugansincheon.Sdelete(oHwewon);
	}

	public void SList(OHwewon oHwewon, String grade) {
		this.dSugansincheon.sList(oHwewon, grade);
	}
	
	


	public boolean SCheck(OLecture oLecture, OHwewon oHwewon) {
		if(this.dSugansincheon.SDchekc(oLecture, oHwewon)==true) {
			return true;
		}else{
			return false;
		}
	}
}
