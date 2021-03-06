package control;

import java.util.Scanner;

import dataAccessObject.DMiridamgi;
import valueObject.OHwewon;
import valueObject.OLecture;

public class CMiridamgi {
	private Scanner scanner;
	private DMiridamgi dMiridamgi;
	
	public CMiridamgi(Scanner scanner) {
		this.scanner = scanner;
		this.dMiridamgi = new DMiridamgi(scanner);
	}
	
	public void CMget(OLecture oLecture, OHwewon oHwewon) {
		this.dMiridamgi.CMget(oLecture, oHwewon);
	}

	public void MList(OHwewon oHwewon) {
		this.dMiridamgi.DMlist(oHwewon);
	}
	
	public void CMsincheon(OHwewon oHwewon, String grade) {
		this.dMiridamgi.sincheon(oHwewon, grade);
	}
	
	public void CMdelte(OHwewon oHwewon) {
		this.dMiridamgi.Mdelete(oHwewon);
	}

	public void CWsave(OHwewon oHwewon, String lecture) {
		this.dMiridamgi.DWSave(oHwewon, lecture);
	}
	
	public void CWsincheon(OHwewon oHwewon, String lecture) {
		this.dMiridamgi.DWSincheon(oHwewon, lecture);
	}
	
	public void CWdelete(OHwewon oHwewon, String id) {
		this.dMiridamgi.DWDelte(oHwewon, id);
	}
}
