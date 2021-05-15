package view;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import valueObject.OHwewon;
import valueObject.OLecture;

public class VMiridamgi {
	private String id;
	 private String lectureName;
	 private String profName;
	 private String credits;
	 private String time;
	

	
	
	public VMiridamgi(Scanner scanner) {
		// TODO Auto-generated constructor stub
	}

	public void get(OLecture oLecture, OHwewon oHwewon) {
			this.id=oLecture.getId();
			this.lectureName=oLecture.getLectureName();
			this.profName=oLecture.getProfName();
			this.credits=oLecture.getCredits();
			this.time=oLecture.getTime();
		
		this.save(oHwewon);
	}
	

	public void save(OHwewon oHwewon) {
	      try {
	          File file = new File("user/"+oHwewon.getId()+"_bag.txt");
	          FileWriter filewriter = new FileWriter(file, true);
	          BufferedWriter bw = new BufferedWriter(filewriter);
	          
				bw.write(id+'/'+lectureName+'/'+profName+'/'+credits+'/'+time);
				bw.newLine();
				bw.flush();
				bw.close();
	          filewriter.close();
	          bw.close();
	          // oHwewond에서 mHwewon으로 데이터를 이동
	          // mHwewon을 통해서 파일에 저장
	          } catch (IOException e) {
	             e.printStackTrace();
	          }
	}
}