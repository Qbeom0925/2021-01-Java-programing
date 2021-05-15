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

import valueObject.OHwewon;
import valueObject.OLecture;

public class VMiridamgi {
	private String id;
	 private String lectureName;
	 private String profName;
	 private String credits;
	 private String time;
	
	private Scanner scanner;


	
	
	public VMiridamgi(Scanner scanner) {
		this.scanner = scanner;
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
	
	public void Mdelete(OHwewon oHwewon) {
		Vector v = new Vector();
		int index=0;
	        try{
	            File file = new File("user/"+oHwewon.getId()+"_bag.txt");
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
	    		
	            File Newfile = new File("user/"+oHwewon.getId()+"_bag.txt");
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