package windowView2;

import java.awt.event.ActionEvent;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.JTable;

import control.CHwewonDeungrok;
import control.CIndex;
import control.CLecture;
import control.CLogin;
import control.CMiridamgi;
import control.CSugansincheon;
import valueObject.OHwewon;
import valueObject.OIndex;
import valueObject.OLecture;
import valueObject.OLogin;

public class WEventListen {
	private static OHwewon oHwewon1;

	public WEventListen() {
		oHwewon1 = new OHwewon();
	}
	
	public static OHwewon getHwewon() {
    	return oHwewon1;
	}
	
	public static OHwewon login(ActionEvent e, String id_text, String pw_text) {
		OLogin oLogin;
		CLogin cLogin;
		oLogin = new OLogin();
		cLogin = new CLogin();
		oLogin.setId(id_text);
		oLogin.setPassword(pw_text);
	    OHwewon oHwewon = cLogin.validate(oLogin);
	    oHwewon1=oHwewon;
	    if(oHwewon!=null) {
	    	return oHwewon;
	    }else {
	    	return null;
	    }

	}
	
	public static void HwewonDeungrok(ActionEvent e, String id_text, String pw_text, String name_text, String add_text, String hak_text, String phone_text) {
	    OHwewon oHwewon = new OHwewon();
	    CHwewonDeungrok chwewonDeungrok = new CHwewonDeungrok();
		WVmain main = new WVmain();
	    oHwewon.setId(id_text);
	    oHwewon.setPassword(pw_text);
	    oHwewon.setName(name_text);
	    oHwewon.setAddress(add_text);
	    oHwewon.setHwakgwa(hak_text);
	    oHwewon.setPhoneNum(phone_text);
	    chwewonDeungrok.saveHwewon(oHwewon);
        JOptionPane.showMessageDialog(null, "회원가입 완료.");
	}
	
	public static String[] getIndex(String fileName) {
		CIndex cIndex;
		cIndex = new CIndex();
	    Vector<OIndex> indices2 = cIndex.getAll(fileName);
	      String campusarr[] = new String[indices2.size()];
	      int j=0;
	      for(OIndex oIndex2 : indices2) {
	    	  campusarr[j]=oIndex2.getFileName();
	         j++;
	      }
		return campusarr;
	}

	public static String[] getcollege(String fileName){
		String campusarr []= getIndex(fileName);
		return campusarr;
	}

	public String[] getdepartment(String fileName) {
//		String collegearr []= getIndex(fileName);
		String campusarr []= getIndex(fileName);
		return campusarr;
	}

	public void Msave(OHwewon oHwewon_1, JTable jtable) {		
		int row = jtable.getSelectedRow();
		String id = (String) jtable.getValueAt(row,0);
		String lecturename = (String) jtable.getValueAt(row,1);
		String profname =(String) jtable.getValueAt(row,2);
		String grade = (String) jtable.getValueAt(row,3);
		String timne = (String) jtable.getValueAt(row,4);
		String lecture=id+" "+lecturename+" "+profname+" "+grade+" "+timne;
		CMiridamgi cMiridamgi;
		cMiridamgi = new CMiridamgi(null);
		cMiridamgi.CWsave(oHwewon_1, lecture);
	}
	
	public void Msincheon(OHwewon oHwewon_1, JTable jtable) {
		int row = jtable.getSelectedRow();
		String id = (String) jtable.getValueAt(row,0);
		String lecturename = (String) jtable.getValueAt(row,1);
		String profname =(String) jtable.getValueAt(row,2);
		String grade = (String) jtable.getValueAt(row,3);
		String timne = (String) jtable.getValueAt(row,4);
		String lecture=id+" "+lecturename+" "+profname+" "+grade+" "+timne;
		CMiridamgi cMiridamgi;
		cMiridamgi = new CMiridamgi(null);
		cMiridamgi.CWsincheon(oHwewon_1, lecture);
	}
	
	public void Mdelete(OHwewon oHwewon_1, JTable table) {
		int row = table.getSelectedRow();
		String id = (String) table.getValueAt(row,0);
		CMiridamgi cMiridamgi;
		cMiridamgi = new CMiridamgi(null);
		cMiridamgi.CWdelete(oHwewon_1, id);
	}

	public void sincheon(OHwewon oHwewon_1, JTable table) {
		int row = table.getSelectedRow();
		String id = (String) table.getValueAt(row,0);
		String lecturename = (String) table.getValueAt(row,1);
		String profname =(String) table.getValueAt(row,2);
		String grade = (String) table.getValueAt(row,3);
		String timne = (String) table.getValueAt(row,4);
		String lecture=id+" "+lecturename+" "+profname+" "+grade+" "+timne;
		CSugansincheon cSugansincheon;
		cSugansincheon = new CSugansincheon(null);
		cSugansincheon.CWsave(oHwewon_1, lecture);		
	}
	
	public void Sdelete(OHwewon oHwewon_1, JTable table) {
		int row = table.getSelectedRow();
		String id = (String) table.getValueAt(row,0);
		CSugansincheon cSugansincheon;
		cSugansincheon = new CSugansincheon(null);
		cSugansincheon.CWdelete(oHwewon_1, id);
	}
	
	
}

