package dataAccessObject;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import model.MHwewon;
import valueObject.OHwewon;

public class DHwewonDeungrok {
   public DHwewonDeungrok() {      
   }
   

   public OHwewon read(String id) {
	   
	   try {
		   File file = new File("hwewon");
		   Scanner scanner = new Scanner(file);
		   MHwewon mHwewon = new MHwewon();
		   while(mHwewon.read(scanner)) {
			   if(mHwewon.getId().equals(id)) {
				   OHwewon oHwewon = new OHwewon();
				   oHwewon.setAddress(mHwewon);
				   return oHwewon;
			   }
		   }
		   scanner.close();
	   } catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      return null;
   }


   public void save(OHwewon oHwewon) {
      try {
      File file = new File("hwewon");
      FileWriter filewriter = new FileWriter(file, true);
      BufferedWriter bw = new BufferedWriter(filewriter);
      MHwewon mHwewon = new MHwewon();
      mHwewon.save(bw, oHwewon);
      filewriter.close();
      bw.close();
      // oHwewond에서 mHwewon으로 데이터를 이동
      // mHwewon을 통해서 파일에 저장
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

}