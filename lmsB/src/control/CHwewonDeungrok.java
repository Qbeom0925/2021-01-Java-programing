package control;

import dataAccessObject.DHwewonDeungrok;
import valueObject.OHwewon;

public class CHwewonDeungrok {

	private DHwewonDeungrok dHwewonDeungrok;
	public CHwewonDeungrok() {
		this.dHwewonDeungrok = new DHwewonDeungrok();
	}

	public OHwewon readHwewon() {
		OHwewon oHwewon = this.dHwewonDeungrok.read();
		return oHwewon;
	}
	public void saveHwewon(OHwewon oHwewon) {
		this.dHwewonDeungrok.save(oHwewon);
	}
}
