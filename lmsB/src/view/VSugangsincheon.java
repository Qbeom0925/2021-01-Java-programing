package view;

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
	private VMiridamgi vMridamgi;


	public VSugangsincheon(Scanner scanner) {
		this.scanner = scanner;
		this.vCampus = new VIndex(this.scanner);
		this.vCollege=new VIndex(this.scanner);
		this.vDepartment=new VIndex(this.scanner);
		this.vLecture=new VLecture(this.scanner);
		this.vMridamgi=new VMiridamgi(this.scanner);
		this.cLecture=new CLecture();
	}

	public void show(OHwewon oHwewon) {
		System.out.println(oHwewon.getName()+"님 안녕하세요..");
		System.out.println("수강신청 및 미리담기(1) 미리담기에서 강의 삭제(2) 수강신청에서 강의 삭제(3)");
		int input = this.scanner.nextInt();
		if(input == 1) {
			System.out.println("수강 신청을 시작합니다");
			String campusFileName = this.vCampus.show("root", "캠퍼스를");
			if(campusFileName != null) {
				String collegeFileName = this.vCollege.show(campusFileName, "대학를");
				if(campusFileName != null) {
					String departmentFileName = this.vDepartment.show(collegeFileName, "학과를");
					if(campusFileName != null) {
						OLecture oLecture = this.vLecture.show(departmentFileName, "강좌를");
						if(oLecture != null) {
							System.out.println("미리담기 (1), 수강신청(2)");
							input = this.scanner.nextInt();
							if(input==1) {
								vMridamgi.get(oLecture, oHwewon);
							}else if(input==2){
								this.save(oLecture, oHwewon);
								System.out.println("수강신청 완료");
							}else {
								System.out.println("잘못 입력하셨습니다.");
							}
						}
					}
				}
			}
		}else if(input == 2) {
			vMridamgi.Mdelete(oHwewon);
		}else if(input ==3) {
			this.Sdelete(oHwewon);
		}else if(input==4) {
		}
	}

	public void save(OLecture oLecture, OHwewon oHwewon) {
		try {
			File file = new File("user/"+oHwewon.getId()+"_sinchoen.txt");
			FileWriter filewriter = new FileWriter(file, true);
			BufferedWriter bw = new BufferedWriter(filewriter);

			bw.write(oLecture.getId()+"/"+oLecture.getLectureName()+'/'+oLecture.getProfName()+'/'+oLecture.getCredits()+'/'+oLecture.getTime());
			bw.newLine();
			bw.flush();
			bw.close();
			filewriter.close();
			bw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}	

	public void Sdelete(OHwewon oHwewon) {
		Vector v = new Vector();
		int index=0;
	        try{
	            File file = new File("user/"+oHwewon.getId()+"_sinchoen.txt");
	            FileReader filereader = new FileReader(file);
	            BufferedReader bufReader = new BufferedReader(filereader);
	            String line = "";
	            while((line = bufReader.readLine()) != null){
	                System.out.println('['+String.valueOf(index)+']'+line);
	                v.add(line);
	                index++;
	            }
	            System.out.println("삭제할 과목의 번호를 입력하세요...");
	    		int input = this.scanner.nextInt();
	    		v.remove(input);
	    		file.delete();
	    		
	            File Newfile = new File("user/"+oHwewon.getId()+"_sinchoen.txt");
	            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(Newfile));
	            for(int i= 0; i<v.size();i++) {
	            String inputString = (String) v.get(i);
	            bufferedWriter.write(inputString);
	            bufferedWriter.newLine();
	            }
	            
                bufferedWriter.close();
	            bufReader.close();
	        }catch (FileNotFoundException e) {
	            // TODO: handle exception
	        }catch(IOException e){
	            System.out.println(e);
	        }
	        System.out.print("삭제 완료.");
	}
}