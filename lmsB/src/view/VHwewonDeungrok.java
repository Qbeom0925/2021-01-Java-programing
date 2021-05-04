package view;

import control.CHwewonDeungrok;
import valueObject.OHwewon;

public class VHwewonDeungrok {

	private CHwewonDeungrok cHwewonDeungrok;
	public VHwewonDeungrok() {
		this.cHwewonDeungrok = new CHwewonDeungrok();
	}

	public void show() {
		System.out.println("LHwewonDeungrok::show()");
		OHwewon oHwewon = new OHwewon();
		// 사용자 정보 입력 받아
		// oHwewon에 저장
		this.cHwewonDeungrok.saveHwewon(oHwewon);
	}
}
