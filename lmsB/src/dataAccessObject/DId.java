package dataAccessObject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Vector;

public class DId {
	
	public static boolean DIdChek(String id){
		Vector v = new Vector();
		int index = 0;
		try {
			File file = new File("hwewon");
			FileReader filereader = new FileReader(file);
			BufferedReader bufReader = new BufferedReader(filereader);
			String line;

			while ((line = bufReader.readLine()) != null) {
//				System.out.println('[' + String.valueOf(index) + ']' + line);
				v.add(line);
				index++;
			}
			 for(int i = 0; i<v.size(); i++) {
		       String text1 = (String)v.get(i);
		       String [] text2 = text1.split(" ");
		       if(id.equals(text2[0])) {
		    	   return false;
		       }
		       }
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		return true;
	}
	
	public static boolean DIdsearch(String name, String phone) {
		Vector v = new Vector();
		int index = 0;
		try {
			File file = new File("hwewon");
			FileReader filereader = new FileReader(file);
			BufferedReader bufReader = new BufferedReader(filereader);
			String line;

			while ((line = bufReader.readLine()) != null) {
//				System.out.println('[' + String.valueOf(index) + ']' + line);
				v.add(line);
				index++;
			}
			 for(int i = 0; i<v.size(); i++) {
		       String input = (String)v.get(i);
		       String [] inputArr = input.split(" ");
		       if(name.equals(inputArr[2])) {
		    	   if(phone.equals(inputArr[5])){
		    		   System.out.println("ID: "+inputArr[0]);
		    		   return true;
		    	   }
		       }
		       }
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}
}

