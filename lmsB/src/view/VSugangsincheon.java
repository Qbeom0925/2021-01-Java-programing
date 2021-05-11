package view;

import java.util.Scanner;
import java.util.Vector;

import control.CBag;
import control.CIndex;
import control.CLecture;
import valueObject.OBag;
import valueObject.OHwewon;
import valueObject.OLecture;

public class VSugangsincheon {

	private Scanner scanner;
	
	private VIndex vCampus;
	private VIndex vCollege;
	private VIndex vDepartment;
	private VLecture vLecture;
	private CLecture cLecture;
	private OBag oBag;
	private CBag cBag;
	
	public VSugangsincheon(Scanner scanner) {
		this.scanner = scanner;
		this.vCampus = new VIndex(this.scanner);
		this.vCollege=new VIndex(this.scanner);
		this.vDepartment=new VIndex(this.scanner);
		this.vLecture=new VLecture(this.scanner);
		
		this.cLecture=new CLecture();
		this.oBag=new OBag();
		this.cBag=new CBag();
	}
	
	public void show(OHwewon oHwewon) {
		System.out.println(oHwewon.getName()+"님 안녕하세요");
		System.out.println("수강 신청을 시작합니다.");

		
		String campusFileName = this.vCampus.show("root", "캠퍼스를");
		if(campusFileName != null) {
			String collegeFileName = this.vCollege.show(campusFileName, "대학를");
		if(campusFileName != null) {
			String departmentFileName = this.vDepartment.show(collegeFileName, "학과를");
		if(campusFileName != null) {
			OLecture oLecture = this.vLecture.show(departmentFileName, "강좌를");
		if(oLecture != null) {
			Vector<OLecture> lectures = cLecture.getAll(departmentFileName);
			System.out.println("미리담기 (1), 수강신청(2)");

			int input = this.scanner.nextInt();
			
			if(input==1) {
				for(OLecture lecture: lectures) {
					oBag.setId(lecture.getId());
					oBag.setLecturename(lecture.getLectureName());
					oBag.setProfName(lecture.getProfName());
					oBag.setCredits(lecture.getCredits());
					oBag.setTime(lecture.getTime());
				}
				this.cBag.saveLecutres(oBag, oHwewon);
				System.out.println("미리담기 완료");

				
				
				
			}else if(input==2){
				System.out.println("수강신청 완료");
			}else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
			
			
				}
			}
		}
	}
}