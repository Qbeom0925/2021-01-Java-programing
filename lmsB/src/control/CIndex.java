package control;

import java.util.Vector;

import dataAccessObject.DHwewonDeungrok;
import dataAccessObject.DIndex;
import valueObject.OHwewon;
import valueObject.OIndex;
import valueObject.OLogin;

public class CIndex {

	private DIndex dIndex;
	
	public CIndex() {
		this.dIndex = new DIndex();
	}

	public Vector<OIndex> getAll(String fileName){
		Vector<OIndex> indices = this.dIndex.readAll(fileName);
		return indices;
	}
}
