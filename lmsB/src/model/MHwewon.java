package model;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import valueObject.OHwewon;

public class MHwewon {

	private int id;
	private int password;
	private String name;
	private String address;
	private int hwakgwa;
	private String input;
	
	public MHwewon() {
		// TODO Auto-generated constructor stub
	}
	
	private void set(OHwewon oHwewon) {
		this.id=oHwewon.getId();
		this.password=oHwewon.getPassword();
		this.name=oHwewon.getName();
		this.address=oHwewon.getAddress();
		this.hwakgwa=oHwewon.getHwakgwa();		
	}
	
	public void save(BufferedWriter bw, OHwewon oHwewon) {
		this.set(oHwewon);
		try {
			this.input=(Integer.toString(id)+'/'+password+'/'+name+'/'+address+'/'+address+'/'+hwakgwa);
			bw.write(input);
			bw.newLine();
			bw.flush();
			bw.close();

			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
