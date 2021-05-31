package control;

import dataAccessObject.DAdmin;

public class CAdmin {
	private DAdmin dAdmin;
	
	public CAdmin() {
		this.dAdmin = new DAdmin();
	}

	public void selectHwewon() {
		dAdmin.DselectiHwewon();
	}
	
	public void deleteHwewon() {
		dAdmin.DdeleteHwewon();
		
	}

	public void changeHwewon() {
		dAdmin.DChangeHwewon();
	}


}
