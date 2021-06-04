package Textview;

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