package Textview;

import java.util.Scanner;

import control.CAdmin;
import control.CLecture;
import control.CLogin;
import valueObject.OHwewon;
import valueObject.OLecture;
import windowView.VCampus;
import windowView.VCollege;
import windowView.VDepartment;

public class VAdmin {
	
	private Scanner scanner;
	private CAdmin cAdmin;
	private VLecture vLecture;
	private VIndex vCampus;
	private VIndex vCollege;
	private VIndex vDepartment;
	
	public VAdmin(Scanner scanner) {
		this.scanner = scanner;
		this.cAdmin = new CAdmin();
		this.vLecture = new VLecture(scanner);
		this.vCampus = new VIndex(scanner);
		this.vCollege = new VIndex(scanner);
		this.vDepartment = new VIndex(scanner);	
	}

	
	public void show(OHwewon oHwewon) {
		System.out.println("회원출력(1) 회원삭제(2) 회원정보 수정(3) 강의 추가,삭제,수정(4) 이전메뉴(5) ");
		int choice = this.scanner.nextInt();
		if(choice==1) {
			cAdmin.selectHwewon();
			return;
		}else if (choice==2) {
			cAdmin.deleteHwewon();
			return;
		}else if (choice==3) {
			cAdmin.changeHwewon();
			return;
		}else if(choice==4) {
			System.out.println("강의 추가(1), 강의 삭제(2), 강의 수정(3)");
			int j = this.scanner.nextInt();
			String campusFileName = this.vCampus.show("root", "캠퍼스를");
			if (campusFileName != null) {
				String collegeFileName = this.vCollege.show(campusFileName, "대학를");
				if (campusFileName != null) {
					String departmentFileName = this.vDepartment.show(collegeFileName, "학과를.");
					if (campusFileName != null) {
						if(j==1) {
						this.vLecture.VaddLecture(departmentFileName);
						}else if (j==2) {
							this.vLecture.VdelteLecture(departmentFileName);
						}else if (j==3) {
							this.vLecture.VchangeLecture(departmentFileName);
						}
					}
				}
			}
		}
	}
}