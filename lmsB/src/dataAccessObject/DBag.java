package dataAccessObject;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import model.MBag;
import model.MHwewon;
import valueObject.OBag;
import valueObject.OHwewon;

public class DBag {

	public void save(OBag oBag, OHwewon oHwewon) {
		 try {
			   File file = new File("user/"+oHwewon.getId()+"_bag.txt");
			   FileWriter filewriter = new FileWriter(file, true);
			   BufferedWriter bw = new BufferedWriter(filewriter);
			   MBag mBag = new MBag();
			   mBag.save(bw, oBag);
			   filewriter.close();
			   bw.close();
			   
	}catch(IOException e){
		e.printStackTrace();
	}

}
}
