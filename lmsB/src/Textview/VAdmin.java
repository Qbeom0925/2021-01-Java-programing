package Textview;

import java.util.Scanner;

import control.CAdmin;
import valueObject.OHwewon;

public class VAdmin {
	
	private Scanner scanner;
	private CAdmin cAdmin;
	
	public VAdmin(Scanner scanner) {
		this.scanner = scanner;
		this.cAdmin = new CAdmin();
	}

	
	public void show(OHwewon oHwewon) {
		System.out.println("회원출력(1) 회원삭제(2) 회원정보 수정(3)");
		int choice = this.scanner.nextInt();
		if(choice==1) {
			cAdmin.selectHwewon();
		}else if (choice==2) {
			cAdmin.deleteHwewon();
		}else if (choice==3) {
			cAdmin.changeHwewon();
		}
	}
}
