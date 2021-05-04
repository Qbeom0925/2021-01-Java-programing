package valueObject;

public class OLogin {

   private String id;
   private String password;
   private String name;
   private String address;
   private String hwakgwa;
   private String PhoneNum;
   
   public OLogin() {
      // TODO Auto-generated constructor stub
   }
   public String getId() {return id;}
   public void setId(String id) {this.id= id;}
   
   public String getPassword() {return password;}
   public void setPassword(String password) {this.password= password;}
   
   public String getName() {return name;}
   public void setName(String name) {this.name=name;}
   
   public String getAddress() {return address;}
   public void setAddress(String address) {this.address=address;}
   
   public String getHwakgwa() {return hwakgwa;}
   public void setHwakgwa(String hwakgwa) {this.hwakgwa=hwakgwa;}
   
   public String getPhoneNum() {return PhoneNum;}
   public void setPhoneNum(String Phonenum) {this.PhoneNum=Phonenum;}
}