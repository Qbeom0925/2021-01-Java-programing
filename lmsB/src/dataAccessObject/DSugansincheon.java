package dataAccessObject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

import model.MLecture;
import valueObject.OHwewon;
import valueObject.OLecture;

public class DSugansincheon {
	private Scanner scanner;
	private MLecture mLecture;
	
	public DSugansincheon(Scanner scanner) {
		this.scanner = scanner;
		this.mLecture = new MLecture();
	}

	public void save(OLecture oLecture, OHwewon oHwewon) {
		// TODO Auto-generated method stub
		try {
			File file = new File("user/" + oHwewon.getId() + "_sincheon.txt");
			FileWriter filewriter = new FileWriter(file, true);
			BufferedWriter bw = new BufferedWriter(filewriter);

			bw.write(oLecture.getId() + ' ' + oLecture.getLectureName() + ' ' + oLecture.getProfName() + ' '
					+ oLecture.getCredits() + ' ' + oLecture.getTime());
			bw.newLine();
			bw.flush();
			bw.close();
			filewriter.close();
			bw.close();
			System.out.println("수강신청완료");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void Sdelete(OHwewon oHwewon) {
		Vector v = new Vector();
		int index = 0;
		try {
			File file = new File("user/" + oHwewon.getId() + "_sincheon.txt");
			FileReader filereader = new FileReader(file);
			BufferedReader bufReader = new BufferedReader(filereader);
			String line = "";
			while ((line = bufReader.readLine()) != null) {
				System.out.println('[' + String.valueOf(index) + ']' + line);
				v.add(line);
				index++;
			}
			System.out.println("삭제할 과목의 번호를 입력하세요.");
			int input = this.scanner.nextInt();
			v.remove(input);
			file.delete();

			File Newfile = new File("user/" + oHwewon.getId() + "_sincheon.txt");
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(Newfile));
			for (int i = 0; i < v.size(); i++) {
				String inputString = (String) v.get(i);
				bufferedWriter.write(inputString);
				bufferedWriter.newLine();
			}

			bufferedWriter.close();
			bufReader.close();
		} catch (FileNotFoundException e) {

		} catch (IOException e) {
			System.out.println(e);
		}
		System.out.println("삭제 완료.");
	}

	public void sList(OHwewon oHwewon, String grade) {
		  try{
			  	System.out.println("현재 수강신청 학점: "+grade);
			  	File file = new File("user/" + oHwewon.getId() + "_sincheon.txt");
	            FileReader filereader = new FileReader(file);
	            BufferedReader bufReader = new BufferedReader(filereader);
	            String line = "";
	            while((line = bufReader.readLine()) != null){
	                System.out.println(line);
	            }
              System.out.println();
	            bufReader.close();
	        }catch (FileNotFoundException e) {
	            // TODO: handle exception
	        }catch(IOException e){
	            System.out.println(e);
	        }
	}

	
	public boolean SDchekc(OLecture oLecture, OHwewon oHwewon) {
		Vector v = new Vector();
		int index = 0;
		try {
			File file = new File("user/" + oHwewon.getId() + "_sincheon.txt");
			FileReader filereader = new FileReader(file);
			BufferedReader bufReader = new BufferedReader(filereader);
			String line;
		
			while ((line = bufReader.readLine()) != null) {
				System.out.println(line);
				v.add(line);
				index++;
			}
			
			int i = 0;

			if (this.equal(index, file, oHwewon, oLecture)) {
				System.out.println("중복되는 과목입니다. 다시 선택해주세요...");
				return false;
			}else {
				return true;		
			}

		} catch (IOException e) {
			System.out.println(e);
		}
		return true;		
	}
	
	public boolean equal(int index, File Newfile, OHwewon oHwewon, OLecture oLecture) {
		try {
			String lectures;
			Scanner scan;
			scan = new Scanner(Newfile);
			mLecture = new MLecture();
			for (int i = 0; i < index; i++) {
				mLecture.read(scan);
				OLecture oLecture1 = new OLecture();
				oLecture1.setId(mLecture.getId());
				lectures = oLecture1.getId();
				if (oLecture.getId().equals(lectures)) {
					return true;
				}

			}
			Newfile.delete();
			scan.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return false;
	}

	public void DWsave(OHwewon oHwewon_1, String lecture) {
		// TODO Auto-generated method stub
				try {
					File file = new File("user/" + oHwewon_1.getId() + "_sincheon.txt");
					FileWriter filewriter = new FileWriter(file, true);
					BufferedWriter bw = new BufferedWriter(filewriter);

					bw.write(lecture);
					bw.newLine();
					bw.flush();
					bw.close();
					filewriter.close();
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}		
	}

	public void DWdelete(OHwewon oHwewon, String id) {
		Vector v = new Vector();
		int index = 0;
		try {
			File file = new File("user/" + oHwewon.getId() + "_sincheon.txt");
			FileReader filereader = new FileReader(file);
			BufferedReader bufReader = new BufferedReader(filereader);
			String line;
			String input;
			while ((line = bufReader.readLine()) != null) {
				input=line.substring(0, line.indexOf(' '));
				if(input.equals(id)) {
				}else {
					v.add(line);
				}
				index++;
			}
			
			File Newfile = new File("user/" + oHwewon.getId() + "_sincheon.txt");
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(Newfile));
			for (int i = 0; i < v.size(); i++) {
				String inputString = (String) v.get(i);
				bufferedWriter.write(inputString);
				bufferedWriter.newLine();
			}
			bufferedWriter.close();
			bufReader.close();
			
			
	}catch (Exception e) {
		// TODO: handle exception
	}		
	}
	
}
	
	


