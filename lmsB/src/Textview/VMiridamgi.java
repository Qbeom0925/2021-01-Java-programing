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

import model.MLecture;
import valueObject.OHwewon;
import valueObject.OLecture;

public class VMiridamgi {
	private String id;
	private String lectureName;
	private String profName;
	private String credits;
	private String time;
	private MLecture mLecture;
	private Scanner scanner;
	private VSugangsincheon vSugangsincheon;

	public VMiridamgi(Scanner scanner) {
		this.scanner = scanner;
	}

	public void get(OLecture oLecture, OHwewon oHwewon) {
		this.id = oLecture.getId();
		this.lectureName = oLecture.getLectureName();
		this.profName = oLecture.getProfName();
		this.credits = oLecture.getCredits();
		this.time = oLecture.getTime();

		this.Check(oHwewon);
		this.save(oHwewon);
	}

	public void save(OHwewon oHwewon) {
		try {
			File file = new File("user/" + oHwewon.getId() + "_bag.txt");
			FileWriter filewriter = new FileWriter(file, true);
			BufferedWriter bw = new BufferedWriter(filewriter);

			bw.write(id + '/' + lectureName + '/' + profName + '/' + credits + '/' + time);
			bw.newLine();
			bw.flush();
			filewriter.close();
			bw.close();
			System.out.println("미리담기 완료");

			// oHwewond에서 mHwewon으로 데이터를 이동
			// mHwewon을 통해서 파일에 저장
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void Mdelete(OHwewon oHwewon) {
		Vector v = new Vector();
		int index = 0;
		try {
			File file = new File("user/" + oHwewon.getId() + "_bag.txt");
			FileReader filereader = new FileReader(file);
			BufferedReader bufReader = new BufferedReader(filereader);
			String line = "";
			while ((line = bufReader.readLine()) != null) {
//				System.out.println('[' + String.valueOf(index) + ']' + line);
				v.add(line);
				index++;
			}
			System.out.println("삭제할 과목의 번호를 입력하세요...");
			int input = this.scanner.nextInt();
			v.remove(input);
			file.delete();

			File Newfile = new File("user/" + oHwewon.getId() + "_bag.txt");
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(Newfile));
			for (int i = 0; i < v.size(); i++) {
				String inputString = (String) v.get(i);
				bufferedWriter.write(inputString);
				bufferedWriter.newLine();
			}
			bufferedWriter.close();
			bufReader.close();
		} catch (FileNotFoundException e) {
			// TODO: handle exception
		} catch (IOException e) {
			System.out.println(e);
		}
		System.out.println("삭제 완료.");
	}

	public void sincheon(OHwewon oHwewon) {
		Vector v = new Vector();
		int index = 0;
		try {
			File file = new File("user/" + oHwewon.getId() + "_bag.txt");
			FileReader filereader = new FileReader(file);
			BufferedReader bufReader = new BufferedReader(filereader);
			String line = "";
			while ((line = bufReader.readLine()) != null) {
				System.out.println('[' + String.valueOf(index) + ']' + line);
				v.add(line);
				index++;
			}
			System.out.println("신청할 과목의 번호를 선택하세요..");
			int input = this.scanner.nextInt();

			File Newfile = new File("user/" + oHwewon.getId() + "_sinchoen.txt");
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(Newfile));
			String inputString = (String) v.get(input);
			bufferedWriter.write(inputString);
			bufferedWriter.newLine();

			bufferedWriter.close();
			bufReader.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	public void Check(OHwewon oHwewon) {
		Vector v = new Vector();
		int index = 0;
		try {
			File file = new File("user/" + oHwewon.getId() + "_bag.txt");
			FileReader filereader = new FileReader(file);
			BufferedReader bufReader = new BufferedReader(filereader);
			String line;
			while ((line = bufReader.readLine()) != null) {
				v.add(line.replace('/', ' '));
				index++;
			}

			File Newfile = new File("user/" + oHwewon.getId() + "_bag_D.txt");
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(Newfile));
			for (int i = 0; i < v.size(); i++) {
				String inputString = (String) v.get(i);
				bufferedWriter.write(inputString);
				bufferedWriter.newLine();
			}
			bufferedWriter.close();

			this.vSugangsincheon = new VSugangsincheon(this.scanner);
			int i = 0;

			if (this.equal( index, Newfile, oHwewon)) {
				System.out.println("중복되는 과목입니다. 다시 선택해주세요..");
				vSugangsincheon.show(oHwewon);
			} else if (this.equal( index, Newfile,oHwewon)) {
				this.save(oHwewon);
			}

		} catch (IOException e) {
			System.out.println(e);
		}
	}

	public boolean equal(int index,File Newfile, OHwewon oHwewon) {
		try {
			String lectures;
			Scanner scan;
			scan = new Scanner(Newfile);
			mLecture = new MLecture();
		for (int i = 0; i < index; i++) {
			mLecture.read(scan);
			OLecture oLecture = new OLecture();
			oLecture.setId(mLecture.getId());
			lectures = oLecture.getId();
			
			if (this.id.equals(lectures)) {
				return true;
			}
			
		}
		scan.close();
	
	}catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}		
		return false;

//	catch (FileNotFoundException e) {
//		   e.printStackTrace();
//	}
}
}

