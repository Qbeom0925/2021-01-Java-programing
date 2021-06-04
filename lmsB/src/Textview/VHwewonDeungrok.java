package Textview;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.InvalidParameterSpecException;
import java.util.Scanner;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

import control.CHwewonDeungrok;
import control.CId;
import valueObject.OHwewon;

public class VHwewonDeungrok {
   
   private Scanner scanner;
   private CHwewonDeungrok cHwewonDeungrok;
   
   public VHwewonDeungrok(Scanner scanner) {
      this.scanner = scanner;
      this.cHwewonDeungrok = new CHwewonDeungrok();
   }

   public void show(){
      System.out.println("회원정보를 입력하세요:");
      OHwewon oHwewon = new OHwewon();
      
      System.out.print("아이디: ");
      String id = scanner.next();
      while(true) {
    	  if(CId.Idcheck(id)==true) {
    		  break;
          }else {
        	  System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
        	  id = scanner.next();
        	  continue;
          }

      }
      oHwewon.setId(id);
      
      System.out.print("비밀번호: ");
      String password = scanner.next();
      while(true) {
	      if(password.length()<4) {
	    	  System.out.println("비밀번호는 4자리 이상 입력해야합니다.");
	    	  password = scanner.next();;
	      }else {
	    	  break;
	      	}
	      }
      oHwewon.setPassword(password);
      
      System.out.print("이름: ");
      String name = scanner.next();
      oHwewon.setName(name);
      
      System.out.print("주소: ");
      String address = scanner.next();
      oHwewon.setAddress(address);
      
      System.out.print("학과: ");
      String hwakgwa = scanner.next();
      oHwewon.setHwakgwa(hwakgwa);
      
      System.out.print("전화번호: ");
      String PhoneNum = scanner.next();
      oHwewon.setPhoneNum(PhoneNum);
      // 사용자 정보 입력 받아
      // oHwewon에 저장
      System.out.print("회원등록이 완료되었습니다.");

      try {
          File file_s = new File("user/" + oHwewon.getId() + "_sincheon.txt");
		file_s.createNewFile();
	      File file_b = new File("user/" + oHwewon.getId() + "_bag.txt");
		file_b.createNewFile();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

      this.cHwewonDeungrok.saveHwewon(oHwewon);
   }
}