package Textview;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;
import control.CLecture;
import control.CMiridamgi;
import control.CSugansincheon;
import model.MLecture;
import valueObject.OHwewon;
import valueObject.OLecture;

public class VSugangsincheon {

	private static final char[] Text = null;

	private Scanner scanner;

	private VIndex vCampus;
	private VIndex vCollege;
	private VIndex vDepartment;
	private VLecture vLecture;
	private CLecture cLecture;
//	private VMiridamgi vMridamgi;
	private MLecture mLecture;
	private VGrade vGrade;
	private CSugansincheon cSugansincheon;
	private CMiridamgi cMiridamgi;

	public VSugangsincheon(Scanner scanner) {
		this.scanner = scanner;
		this.vCampus = new VIndex(this.scanner);
		this.vCollege = new VIndex(this.scanner);
		this.vDepartment = new VIndex(this.scanner);
		this.vLecture = new VLecture(this.scanner);
//		this.vMridamgi = new VMiridamgi(this.scanner);
		this.cLecture = new CLecture();
		this.mLecture = new MLecture();
		this.vGrade = new VGrade();
		this.cSugansincheon = new CSugansincheon(this.scanner);
		this.cMiridamgi = new CMiridamgi(scanner);
	}

	public void show(OHwewon oHwewon) {
		System.out.println(oHwewon.getName() + "님 안녕하세요..");

		int choice;
		while (true) {
			String grade = vGrade.Sshow(oHwewon);
			System.out.println("수강신청 및 미리담기(1) 미리담기에서 수강신청(2) 미리담기에서 강의 삭제(3) 수강신청에서 강의 삭제(4) 미리담기 목록 조회(5) 수강신청 목록 조회(6) 프로그램 종료(7)");
			int input = this.scanner.nextInt();
			if (input == 1) {
				System.out.println("수강 신청을 시작합니다");
				String campusFileName = this.vCampus.show("root", "캠퍼스를");
				if (campusFileName != null) {
					String collegeFileName = this.vCollege.show(campusFileName, "대학를");
					if (campusFileName != null) {
						String departmentFileName = this.vDepartment.show(collegeFileName, "학과를");
						if (campusFileName != null) {
							OLecture oLecture = this.vLecture.show(departmentFileName, "강좌를");

							if (oLecture != null) {
								System.out.println("미리담기 (1), 수강신청(2)");
								input = this.scanner.nextInt();
								if (input == 1) {
									this.cMiridamgi.CMget(oLecture, oHwewon);
									System.out.println("추가 신청및 담기 하시겠습니까? 예(1) 아니요(2)");
									choice = this.scanner.nextInt();
									if (choice == 1) {
										System.out.println("-------추가신청-------");
									} else if (choice == 2) {
										System.out.println("프로그램 종료합니다.");
										continue;
									}
								}else if (input == 2) {
									File f = new File("user/" + oHwewon.getId() + "_sinchoen.txt");
									if (f.exists()) {
										this.SGradeCheck(oLecture, oHwewon, grade);
										if(this.cSugansincheon.SCheck(oLecture, oHwewon)==true){
											this.cSugansincheon.save(oLecture, oHwewon);
										}else {
											continue;
										}
									} else {
										this.cSugansincheon.save(oLecture, oHwewon);
									}
									System.out.println("추가 신청및 담기 하시겠습니까? 예(1) 아니요(2)");
									choice = this.scanner.nextInt();
									if (choice == 1) {
										System.out.println("-------추가신청-------");
									} else if (choice == 2) {
										System.out.println("프로그램 종료합니다.");
										continue;
									}
								}
							}

						}
					}

				}

			} else if (input == 2) {
				this.cMiridamgi.CMsincheon(oHwewon, grade);
			} else if (input == 3) {
				while (true) {
					this.cMiridamgi.CMdelte(oHwewon);
					System.out.println("추가 삭제를 하시겠습니까? 예(1) 아니요(2)");
					choice = this.scanner.nextInt();
					if (choice == 1) {
						System.out.println("-------추가삭제-------");
					}

					if (choice == 2) {
						System.out.println("프로그램 종료합니다.");
						continue;
					}

				}
			} else if (input == 4) {
				while (true) {
					this.cSugansincheon.delete(oHwewon);
					System.out.println("추가 삭제를 하시겠습니까? 예(1) 아니요(2)");
					choice = this.scanner.nextInt();
					if (choice == 1) {
						System.out.println("-------추가삭제-------");
					}

					if (choice == 2) {
						System.out.println("프로그램 종료합니다.");
						continue;
					}
				}
			} else if (input == 5) {
				System.out.println("미리 담기 목록 조회");
				this.cMiridamgi.MList(oHwewon);
				continue;
			} else if (input == 6) {
				System.out.println("현재 수강신청 목록 조회");
				this.cSugansincheon.SList(oHwewon, grade);
				continue;
			} else if (input==7) {
				System.out.println("프로그램 종료합니다.");
				break;
			}

		} // while
	}


	private boolean SGradeCheck(OLecture oLecture, OHwewon oHwewon, String grade) {
		if(Integer.parseInt(oLecture.getCredits()) > 20-Integer.parseInt(grade)) {
			System.out.println("학점초과입니다.");
			System.out.println("다시 선택해주세요.");
			this.show(oHwewon);
			System.exit(0);
		}else {
			
		}
		return true;
	}

}