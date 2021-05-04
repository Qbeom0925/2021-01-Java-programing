package view;

import java.util.Scanner;

import control.CHwewonDeungrok;
import control.CLogin;
import valueObject.OHwewon;
import valueObject.OLogin;

public class VLogin {
	
	
	private Scanner scanner;
	private CLogin cLogin;
	   
	public VLogin(Scanner scanner) {
		this.scanner = scanner;
		this.cLogin = new CLogin();
   }

	   public void show() {
	      System.out.println("아이디와 비밀번호를 입력 하세요.:");
	      OLogin oLogin = new OLogin();
	      
	      System.out.print("아이디 :");
	      String id = scanner.next();
	      oLogin.setId(id);
	      
	      System.out.print("비밀번호 :");
	      String password = scanner.next();
	      oLogin.setPassword(password);
	      
	      OHwewon oHwewon = this.cLogin.validate(oLogin);
	      if (oHwewon != null) {
	    	  System.out.print(oHwewon.getName()+"님 안녕하세요");
	      }
	      else {
	    	  System.out.print("아이디와 비밀번호가 올바르지 않습니다.");
	      }
	      
}
}
