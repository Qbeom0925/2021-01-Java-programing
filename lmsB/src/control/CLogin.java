package control;

import dataAccessObject.DHwewonDeungrok;
import valueObject.OHwewon;
import valueObject.OLogin;

public class CLogin {

	private DHwewonDeungrok dHwewonDeungrok;
	public CLogin() {
		this.dHwewonDeungrok = new DHwewonDeungrok();
	}

	public OHwewon validate(OLogin oLogin) {
		OHwewon oHwewon = this.dHwewonDeungrok.read(oLogin.getId());
		if(oHwewon != null) {
			if(oLogin.getPassword().equals(oHwewon.getPassword())) {
				return oHwewon;
			}
		}
		return null;
	}
}
