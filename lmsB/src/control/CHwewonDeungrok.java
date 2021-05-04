package control;

import dataAccessObject.DHwewonDeungrok;
import valueObject.OHwewon;

public class CHwewonDeungrok {

	private DHwewonDeungrok dHwewonDeungrok;
	public CHwewonDeungrok() {
		this.dHwewonDeungrok = new DHwewonDeungrok();
	}

	public OHwewon readHwewon(String id) {
		OHwewon oHwewon = this.dHwewonDeungrok.read(id);
		return oHwewon;
	}
	public void saveHwewon(OHwewon oHwewon) {
		this.dHwewonDeungrok.save(oHwewon);
	}
}
