package valueObject;

import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.InvalidParameterSpecException;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

import control.CPassword;
import model.MHwewon;

public class OHwewon {

   private String id;
   private String password;
   private String name;
   private String address;
   private String hwakgwa;
   private String PhoneNum;
   
   public OHwewon() {
      // TODO Auto-generated constructor stub
   }
   public void setAddress(MHwewon mHwewon) {
	    this.id=mHwewon.getId();
		this.password=mHwewon.getPassword();
		this.name=mHwewon.getName();
		this.address=mHwewon.getAddress();
		this.hwakgwa=mHwewon.getHwakgwa();
		this.PhoneNum=mHwewon.getPhoneNum();
	}
   
   public String getId() {return id;}
   public void setId(String id) {this.id= id;}
   
   public String DgetPassword() {
	   return password;}

   
   public String getPassword(){
	this.password=CPassword.CLoginpw(this.password);
	   return password;
   }
   
   public void setPassword(String password){
	   String pw=CPassword.CDpw(password);
	   this.password=pw;
   }
   
   public String getName() {return name;}
   public void setName(String name) {this.name=name;}
   
   public String getAddress() {return address;}
   public void setAddress(String address) {this.address=address;}
   
   public String getHwakgwa() {return hwakgwa;}
   public void setHwakgwa(String hwakgwa) {this.hwakgwa=hwakgwa;}
   
   public String getPhoneNum() {return PhoneNum;}
   public void setPhoneNum(String Phonenum) {this.PhoneNum=Phonenum;}
}