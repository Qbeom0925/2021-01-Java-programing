package dataAccessObject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.Vector;

import control.CPassword;
import valueObject.OHwewon;

public class DPassword {

	public static boolean DIdsearch(String id, String name, String phone) {
			Vector v = new Vector();
			int index = 0;
			try {
				File file = new File("hwewon");
				FileReader filereader = new FileReader(file);
				BufferedReader bufReader = new BufferedReader(filereader);
				String line;

				while ((line = bufReader.readLine()) != null) {
					v.add(line);
					index++;
				}
				 for(int i = 0; i<v.size(); i++) {
			       String input = (String)v.get(i);
			       String [] inputArr = input.split(" ");
			       if(id.equals(inputArr[0])) {
				       if(name.equals(inputArr[2])) {
				    	   if(phone.equals(inputArr[5])){
				    		   String password=CPassword.CLoginpw(inputArr[1]);
				    		   System.out.println("비밀번호: "+password);
				    		   return true;
				    	   }
				       }
			       }
			       }
				
			}catch (Exception e) {
				// TODO: handle exception
			}
			return false;
	}

	public static void DPwchange(OHwewon oHwewon) {
		Vector v = new Vector();
		int index = 0;
		try {
			File file = new File("hwewon");
			FileReader filereader = new FileReader(file);
			BufferedReader bufReader = new BufferedReader(filereader);
			String line;

			while ((line = bufReader.readLine()) != null) {
				v.add(line);
				index++;
			}
			System.out.println("변경 할 비밀번호를 입력해주세요");
			Scanner sc = new Scanner(System.in);
			String newPw = sc.next();
			
			 for(int i = 0; i<v.size(); i++) {
		       String input = (String)v.get(i);
		       String [] inputArr = input.split(" ");
			       if(oHwewon.getId().equals(inputArr[0])) {
								 newPw = CPassword.CDpw(newPw);
								 inputArr[1]=newPw;
								 
								String newinput ="";
								for(int j=0; j<inputArr.length; j++) {
									newinput += inputArr[j]+' ';
								}
								v.set(i,newinput);
								break;
							
			       }
		       }
				File Newfile = new File("hwewon");
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
}
