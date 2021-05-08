package dataAccessObject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

import model.MIndex;
import model.MLecture;
import valueObject.OIndex;
import valueObject.OLecture;

public class DLecture {
 
 public DLecture() {}
 
 public Vector<OLecture> readAll(String fileName){
  
  Vector<OLecture> lectures = new Vector<OLecture>();
  
  try {
   File file = new File(fileName);
   Scanner scan = new Scanner(file);
   MLecture mLecture = new MLecture();
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