package Textview;

import java.util.Scanner;

public class VLMain {
   
   private Scanner scanner;
   private VInitial initial;
   
   public VLMain(Scanner scanner) {
      this.scanner = scanner;
      this.initial = new VInitial(scanner);
    }
   public void run() {
      System.out.println("LMain::run()");
      this.initial.show();
   }

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      VLMain main = new VLMain(scanner);
      main.run();
      
      scanner.close();
   }
}