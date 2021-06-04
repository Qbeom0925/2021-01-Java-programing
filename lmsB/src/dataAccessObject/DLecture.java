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

import model.MIndex;
import model.MLecture;
import model.MpastLecture;
import valueObject.OHwewon;
import valueObject.OIndex;
import valueObject.OLecture;
import valueObject.OpastLecture;

public class DLecture {
	private MLecture mLecture;
	private MpastLecture mpastLecture;
	private static final String PATHNAME="data/";
 public DLecture() {	 
	 
 }
 
 public Vector<OLecture> readAll(String fileName){
  Vector<OLecture> lectures = new Vector<OLecture>();
  
  try {
   File file = new File(PATHNAME+fileName);
   Scanner scan = new Scanner(file);
   this.mLecture = new MLecture();
   while(mLecture.read(scan)){
    OLecture oLecture = new OLecture();
    oLecture.set(mLecture);
    lectures.add(oLecture);
   }
   scan.close();
  } catch (FileNotFoundException e) {
   e.printStackTrace();
  }
  return lectures;
 }


 public float readpast(OHwewon oHwewon) {
	 float Avggrade = 0;
	    int sumcredit=0;
	    String grade;
	    float Sumgrade = 0;
	 Vector<OpastLecture> lectures = new Vector<OpastLecture>();
	  try {
	   File file = new File("user/" + oHwewon.getId() + "_past.txt");
	   Scanner scan = new Scanner(file);
	   this.mpastLecture = new MpastLecture();
	   while(mpastLecture.read_past(scan)){
	    OpastLecture opastLecture = new OpastLecture();
	    opastLecture.set(mpastLecture);
	    grade=opastLecture.getGrade();
	    if("A+".equals(grade)) {
	    	 Sumgrade+=(float) 4.5*Integer.parseInt(opastLecture.getCredits());
	    }else if("A0".equals(grade)){
	    	 Sumgrade+=(float) 4.0*Integer.parseInt(opastLecture.getCredits());
	    }else if("B+".equals(grade)) {
	    	 Sumgrade+=(float) 3.5*Integer.parseInt(opastLecture.getCredits());
	    }else if("B0".equals(grade)) {
	    	 Sumgrade+=(float) 3.0*Integer.parseInt(opastLecture.getCredits());
	    }else if("C+".equals(grade)) {
	    	 Sumgrade+=(float) 2.5*Integer.parseInt(opastLecture.getCredits());
	    }else if("C0".equals(grade)) {
	    	 Sumgrade+=(float) 2.0*Integer.parseInt(opastLecture.getCredits());
	    }else if("D+".equals(grade)) {
	    	 Sumgrade+=(float) 1.5*Integer.parseInt(opastLecture.getCredits());
	    }else if("D0".equals(grade)) {
	    	 Sumgrade+=(float) 1.0*Integer.parseInt(opastLecture.getCredits());
	    }else if("F".equals(grade)) {
	    	 Sumgrade+=(float) 0*Integer.parseInt(opastLecture.getCredits());
	    }
	    sumcredit +=  Integer.parseInt(opastLecture.getCredits());
	    lectures.add(opastLecture);
	   }
	   Avggrade=(float) (Sumgrade/sumcredit);
	   scan.close();
	  } catch (FileNotFoundException e) {
	   e.printStackTrace();
	  }
	  return Avggrade;
 }

	public void DaddLecture(String fileName) {
		Scanner scan = new Scanner(System.in);
		 String id;
		 String lectureName;
		 String profName;
		 String credits;
		 String time;
		
		System.out.println("과목의 번호를 입력하세요.");
		id=scan.next();
		System.out.println("과목의 이름을 입력하세요.");
		lectureName=scan.next();
		System.out.println("과목의 교수이름을 입력하세요.");
		profName=scan.next();
		System.out.println("과목의 학점을 입력하세요.");
		credits=scan.next();
		System.out.println("과목의 시간을 입력하세요.");
		time=scan.next();
		
		try {
		File file = new File("data/" + fileName);
		FileWriter filewriter = new FileWriter(file, true);
		BufferedWriter bw = new BufferedWriter(filewriter);
		bw.newLine();
		bw.write(id + ' ' + lectureName + ' ' + profName + ' '+ credits + ' ' + time);
		bw.newLine();
		bw.flush();
		bw.close();
		filewriter.close();
		bw.close();
		System.out.println("강의 추가 완료");
		}catch (Exception e) {
		// TODO: handle exception
		}
	}

	public void DdelteLecture(String fileName) {
		Vector v = new Vector();
		int index = 0;
		try {
			File file = new File("data/" + fileName);
			FileReader filereader = new FileReader(file);
			BufferedReader bufReader = new BufferedReader(filereader);
			String line = "";
			while ((line = bufReader.readLine()) != null) {
				System.out.println('[' + String.valueOf(index) + ']' + line);
				v.add(line);
				index++;
			}
			System.out.println("삭제할 과목의 번호를 입력하세요.");
			Scanner scan = new Scanner(System.in);
			int input = scan.nextInt();
			v.remove(input);
			file.delete();

			File Newfile = new File("data/" + fileName);
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

	
	public void DchangeLecture(String fileName) {
		Vector v = new Vector();
		int index = 0;
		try {
			File file = new File("data/" + fileName);
			FileReader filereader = new FileReader(file);
			BufferedReader bufReader = new BufferedReader(filereader);
			String line;

			while ((line = bufReader.readLine()) != null) {
				System.out.println(line);
				v.add(line);
				index++;
			}
			System.out.println("수정할 회원의 ID를 입력해주세요");
			Scanner sc = new Scanner(System.in);
			String id = sc.next();
			
			 for(int i = 0; i<v.size(); i++) {
		       String input = (String)v.get(i);
		       String [] inputArr = input.split(" ");
			       if(id.equals(inputArr[0])) {
						System.out.println("강좌번호 수정(1) 강좌이름 수정(2) 강좌 담당교수 수정(3) 강좌학점 수정(4) 강좌시간 수정(5)");
						int choice =sc.nextInt();
							if(choice==1) {
								System.out.println("현재 강좌 번호: "+inputArr[0]);
								System.out.println("변경 강좌 번호를 입력해주세요.");
								String newname = sc.next();
								inputArr[0]=newname;
								System.out.println("변경 후: "+inputArr[0]);
								String newinput ="";
								for(int j=0; j<inputArr.length; j++) {
									newinput += inputArr[j]+' ';
								}
								System.out.println(newinput);
								v.set(i,newinput);
								break;
							}else if(choice==2) {
								System.out.println("현재 강좌 이름: "+inputArr[1]);
								System.out.println("변경 강좌 이름를 입력해주세요");
								String newdepart = sc.next();
								inputArr[1]=newdepart;
								System.out.println("변경 후: "+inputArr[1]);
								String newinput ="";
								for(int j=0; j<inputArr.length; j++) {
									newinput += inputArr[j]+' ';
								}
								System.out.println(newinput);
								v.set(i,newinput);
								break;
							}else if(choice==3) {
								System.out.println("현재 강좌 담당교수: "+inputArr[4]);
								System.out.println("변경 강좌 담당교수를 입력해주세요");
								String newdnum = sc.next();
								inputArr[4]=newdnum;
								System.out.println("변경 후: "+inputArr[4]);
								String newinput ="";
								for(int j=0; j<inputArr.length; j++) {
									newinput += inputArr[j]+' ';
								}
								System.out.println(newinput);
								v.set(i,newinput);
								break;
							}else if(choice==4) {
								System.out.println("현재 강좌 학점: "+inputArr[5]);
								System.out.println("변경 강좌 학점를 입력해주세요");
								String newdnum = sc.next();
								inputArr[5]=newdnum;
								System.out.println("변경 후: "+inputArr[5]);
								String newinput ="";
								for(int j=0; j<inputArr.length; j++) {
									newinput += inputArr[j]+' ';
								}
								System.out.println(newinput);
								v.set(i,newinput);
								break;							
								}else if(choice==5) {
									System.out.println("현재 강좌 학점: "+inputArr[6]);
									System.out.println("변경 강좌 학점를 입력해주세요");
									String newdnum = sc.next();
									inputArr[6]=newdnum;
									System.out.println("변경 후: "+inputArr[6]);
									String newinput ="";
									for(int j=0; j<inputArr.length; j++) {
										newinput += inputArr[j]+' ';
									}
									System.out.println(newinput);
									v.set(i,newinput);
									break;
								}
			       }
		       }
				File Newfile = new File("data/"+fileName);
				BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(Newfile));
				for (int i = 0; i < v.size(); i++) {
					String inputString = (String) v.get(i);
					bufferedWriter.write(inputString);
					bufferedWriter.newLine();
				}

				bufferedWriter.close();						
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

	public Vector<OLecture> WMiridamgiAll(String fileName) {
		Vector<OLecture> lectures = new Vector<OLecture>();
		  
		  try {
		   File file = new File("user/"+fileName+"_bag.txt");
		   Scanner scan = new Scanner(file);
		   this.mLecture = new MLecture();
		   while(mLecture.read(scan)){
		    OLecture oLecture = new OLecture();
		    oLecture.set(mLecture);
		    lectures.add(oLecture);
		   }
		   scan.close();
		  } catch (FileNotFoundException e) {
		   e.printStackTrace();
		  }
		  return lectures;
	}

	public Vector<OLecture> WSincheon(String fileName) {
		Vector<OLecture> lectures = new Vector<OLecture>();
		  
		  try {
		   File file = new File("user/"+fileName+"_sinchoen.txt");
		   Scanner scan = new Scanner(file);
		   this.mLecture = new MLecture();
		   while(mLecture.read(scan)){
		    OLecture oLecture = new OLecture();
		    oLecture.set(mLecture);
		    lectures.add(oLecture);
		   }
		   scan.close();
		  } catch (FileNotFoundException e) {
		   e.printStackTrace();
		  }
		  return lectures;
	}
	
	


}