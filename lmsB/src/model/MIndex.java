package model;

import java.util.Scanner;

public class MIndex {
	
	   private String id;
	   private String name;
	   private String fileName;

	   
	  

	public MIndex() {
	      // TODO Auto-generated constructor stub
	   }
	
	
		public boolean read(Scanner scanner) {
			if(scanner.hasNext()) {
				this.id=scanner.next();
				this.name=scanner.next();
				this.fileName=scanner.next();
	
				return true;
			}
		return false;
		}
		
		public String getId() {return id;}
		
		public void setId(String id) {this.id = id;}
		
		public String getName() {return name;}
		
		public void setName(String name) {this.name = name;}
		
		public String getFileName() {return fileName;}
		   
		public void setFileName(String fileName) {this.fileName = fileName;}
}
