package Textview;

import java.io.IOException;
import java.util.Scanner;

import valueObject.OHwewon;

public class VInitial {
   
   private Scanner scanner;
   private VHwewonDeungrok hwewonDeungrok;
   private VLogin login;

   private VSugangsincheon vSugangsincheon;
   
   public VInitial(Scanner scanner) {
      this.scanner = scanner;
      this.hwewonDeungrok = new VHwewonDeungrok(scanner);
      this.login = new VLogin(scanner);
   }

   public void show() {
      System.out.println("다음 기능을 선택 하세요");
      System.out.println("로그인(1), 회원등록(2)");

      
         int input = this.scanner.nextInt();
         if (input == 1) {
            OHwewon oHwewon = this.login.show();
            if(oHwewon != null) {
            	this.vSugangsincheon = new VSugangsincheon(this.scanner);
            	this.vSugangsincheon.show(oHwewon);
            }
         } else if (input == 2) {
            this.hwewonDeungrok.show();
         } else {
            System.out.println("잘못 입력하셨습니다.");
         }
      
      
   }

}