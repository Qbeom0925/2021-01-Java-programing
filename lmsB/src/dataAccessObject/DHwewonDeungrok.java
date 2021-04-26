package dataAccessObject;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import model.MHwewon;
import valueObject.OHwewon;

public class DHwewonDeungrok {
   public DHwewonDeungrok() {      
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

   public OHwewon read() {
      // mHwewon을 통해 Data read
      // oHwewon 생성
      // mHwewon에서 oHwewon으로 데이터 이동
      return null;
   }

}