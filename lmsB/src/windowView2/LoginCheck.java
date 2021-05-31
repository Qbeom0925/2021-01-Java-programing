package windowView2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Vector;

import control.CPassword;

public class LoginCheck {

	
	public static boolean LoginCheck(String id, String pass) {
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
    		   String password=CPassword.CLoginpw(inputArr[1]);
		       if(id.equals(inputArr[0])) {
			       if(pass.equals(password)) {
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
