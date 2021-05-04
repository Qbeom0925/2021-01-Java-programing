package view;

import java.io.IOException;

public class VInitial {

	private VHwewonDeungrok hwewonDeungrok;
	public VInitial() {
		this.hwewonDeungrok = new VHwewonDeungrok();
	}

	public void show() {
		System.out.println("다음 기능을 선택 하세요");
		System.out.println("로그인(1), 회원등록(2)");

		try {
			int input = System.in.read();
			if (input == '1') {
				// login dialog show
			} else if (input == '2') {
				this.hwewonDeungrok.show();
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
