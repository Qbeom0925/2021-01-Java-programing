package view;

import java.util.Scanner;

import control.CHwewonDeungrok;
import valueObject.OHwewon;

public class VHwewonDeungrok {
   
   private Scanner scanner;
   private CHwewonDeungrok cHwewonDeungrok;
   
   public VHwewonDeungrok(Scanner scanner) {
      this.scanner = scanner;
      this.cHwewonDeungrok = new CHwewonDeungrok();
   }

   public void show() {
      System.out.println("회원정보를 입력하세요:");
      OHwewon oHwewon = new OHwewon();
      
      System.out.print("아이디");
      int id = scanner.nextInt();
      oHwewon.setId(id);
      
      System.out.print("비밀번호");
      int password = scanner.nextInt();
      oHwewon.setPassword(password);
      
      System.out.print("이름");
      String name = scanner.next();
      oHwewon.setName(name);
      
      System.out.print("주소");
      String address = scanner.next();
      oHwewon.setAddress(address);
      
      System.out.print("학과");
      int hwakgwa = scanner.nextInt();
      oHwewon.setHwakgwa(hwakgwa);
      // 사용자 정보 입력 받아
      // oHwewon에 저장
      this.cHwewonDeungrok.saveHwewon(oHwewon);
   }
}