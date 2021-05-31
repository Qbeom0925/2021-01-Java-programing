package Textview;

import java.util.Scanner;
import java.util.Vector;

import control.CLecture;
import valueObject.OHwewon;
import valueObject.OLecture;

public class VMyiWeb {

	private Scanner scanner;
	private CLecture cLecture;
	
	public VMyiWeb(Scanner scanner) {
	      this.scanner = scanner;
	      this.cLecture = new CLecture();
	}

	public void show(OHwewon oHwewon) {
	      System.out.println("개인정보 조회(1), 평균학점 조회(2), (3) ,필수전공 조회(4), 필수교양 조회(5), 필수인데 미수강인 과목(6), 이전메뉴(7)");
	      int choice = this.scanner.nextInt();
	      if(choice==1) {
	    	  System.out.println("개인정보 조회입니다.");
	    	  System.out.print("아이디: "+oHwewon.getId() 
	    	  + "\n이름: "+oHwewon.getName()
	    	  +"\n주소: "+oHwewon.getAddress()
	    	  +"\n학과:"+oHwewon.getHwakgwa()
	    	  +"\n핸드폰 번호: "+ oHwewon.getPhoneNum());
	      }else if(choice==2) {
	    	  System.out.println("평균학점 조회입니다..");

	    	  float avggrade =cLecture.getpast(oHwewon);
	    	  System.out.println("평균학점: "+avggrade);

	    	  
	      }else if(choice==3) {
	    	  
	    	  
	      }else if(choice==4) {
	    	  
	      }else if(choice==5) {
	    	  
	      }else if(choice==6) {
	    	  
	      }else if(choice==7) {
	    	  return;
	      }else {
	    	  System.out.println("잘못 입력하셨습니다.");
	      }
	      
		
	}



	
	
}
