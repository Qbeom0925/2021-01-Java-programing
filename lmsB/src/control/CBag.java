package control;

import dataAccessObject.DBag;
import valueObject.OBag;
import valueObject.OHwewon;

public class CBag {
	
	private DBag dBag;
	
	public CBag() {
		this.dBag=new DBag();
	}

	public void saveLecutres(OBag oBag, OHwewon oHwewon) {
		this.dBag.save(oBag, oHwewon);		
	}

}
