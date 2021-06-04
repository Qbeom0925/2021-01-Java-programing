package Textview;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.InvalidParameterSpecException;
import java.util.Scanner;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

import control.CId;
import control.CPassword;
import valueObject.OHwewon;

public class VInitial {
   
   private Scanner scanner;
   private VHwewonDeungrok hwewonDeungrok;
   private VLogin login;
   private VAdmin vadmin;
   private VSugangsincheon vSugangsincheon;
   private VMyiWeb vMyiWeb;
   
   public VInitial(Scanner scanner) {
      this.scanner = scanner;
      this.hwewonDeungrok = new VHwewonDeungrok(scanner);
      this.login = new VLogin(scanner);
      this.vadmin = new VAdmin(scanner);
      this.vMyiWeb = new VMyiWeb(scanner);
   }

   public void show() {
	   while(true) {
      System.out.println("다음 기능을 선택 하세요");
      System.out.println("로그인(1), 회원등록(2), ID찾기(3) ,비밀번호 찾기(4)");
         int input = this.scanner.nextInt();
         if (input == 1) {
            OHwewon oHwewon = this.login.show();
            if(oHwewon != null) {
            	if(oHwewon.getId().equals("admin")){
            		//관리자로 진입
            		System.out.println(oHwewon.getName()+"");
            		vadmin.show(oHwewon);
            		continue;
            	}else {
            	      System.out.println("수강신청 화면(1), MyiWwb(2), 비밀번호 수정(3) ,로그아웃(4)");
            	      int choice = this.scanner.nextInt();
            	      if(choice == 1) {
                  		//학생 수강신청 진입
            	        this.vSugangsincheon = new VSugangsincheon(this.scanner);
                		this.vSugangsincheon.show(oHwewon);
                		continue;
            	      }else if(choice==2) {
            	    	  //MyiWeb
            	    	  this.vMyiWeb.show(oHwewon);
            	    	  continue;
            	      }else if(choice==3) {
            	    	  CPassword.Pwchange(oHwewon);
            	    	  continue;
            	      }else if(choice==4) {
            	    	  continue;
            	      }


            	}
            }
         } 
         else if (input == 2) {
            this.hwewonDeungrok.show();
         } else if (input==3) {
             System.out.println("이름을 입력해주세요.");
        	 String name = this.scanner.next();
        	 System.out.println("전화번호를 입력해주세요.");
        	 String Phone = this.scanner.next();
        	 System.out.println("ID찾기");
        	 CId.Idsearch(name, Phone);
        	 continue;
         }else if (input==4) {
             System.out.println("아이디를 입력해주세요.");
        	 String id = this.scanner.next();
        	 System.out.println("이름을 입력해주세요.");
        	 String name = this.scanner.next();
        	 System.out.println("전화번호를 입력해주세요.");
        	 String phone = this.scanner.next();
        	 System.out.println("비밀번호 찾기");
        	 CPassword.PwSearch(id, name, phone);
        	 continue;
         }
   }
   }

}