package dataAccessObject;

import model.MHwewon;
import valueObject.OHwewon;

public class DHwewonDeungrok {
	public DHwewonDeungrok() {		
	}

	public void save(OHwewon oHwewon) {
		MHwewon mHwewon = new MHwewon();
		// oHwewond에서 mHwewon으로 데이터를 이동
		// mHwewon을 통해서 파일에 저장
	}

	public OHwewon read() {
		// mHwewon을 통해 Data read
		// oHwewon 생성
		// mHwewon에서 oHwewon으로 데이터 이동
		return null;
	}

}
