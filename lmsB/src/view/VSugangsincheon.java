package view;

import java.util.Scanner;

import control.CIndex;
import valueObject.OHwewon;
import valueObject.OLecture;

public class VSugangsincheon {

	private Scanner scanner;
	
	private VCampus vCampus;
	private VCollege vCollege;
	private VDepartment vDepartment;
	private VLecture vLecture;
	
	public VSugangsincheon(Scanner scanner) {
		this.scanner = scanner;
		this.vCampus = new VCampus(this.scanner);
		this.vCollege=new VCollege(this.scanner);
		this.vDepartment=new VDepartment(this.scanner);
		this.vLecture=new VLecture(this.scanner);

	}
	
	public void show(OHwewon oHwewon) {
		System.out.println(oHwewon.getName()+"님 안녕하세요");
		System.out.println("수강 신청을 시작합니다.");

		
		String campusFileName = this.vCampus.show("src/data/root");
		String collegeFileName = this.vCollege.show(campusFileName);
		String departmentFileName = this.vDepartment.show(collegeFileName);
		OLecture oLecture = this.vLecture.show(departmentFileName);

	}
}
