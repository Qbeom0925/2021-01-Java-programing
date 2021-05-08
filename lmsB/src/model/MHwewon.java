package model;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import valueObject.OHwewon;

public class MHwewon {

	private String id;
	private String password;
	private String name;
	private String address;
	private String hwakgwa;
	private String PhoneNum;
	private String input;
	
	public MHwewon() {
		// TODO Auto-generated constructor stub
	}

	public boolean read(Scanner scanner) {
		if(scanner.hasNext()) {
			this.id = scanner.next();
			this.password = scanner.next();
			this.name = scanner.next();
			this.address = scanner.next();
			this.hwakgwa = scanner.next();
			this.PhoneNum = scanner.next();
			return true;
		}
		return false;
	}

	public void save(BufferedWriter bw, OHwewon oHwewon) {
		this.set(oHwewon);
		try {
			bw.write(id);
			bw.write("\n");
			bw.write(password);
			bw.write("\n");
			bw.write(name);
			bw.write("\n");
			bw.write(address);
			bw.write("\n");
			bw.write(hwakgwa);
			bw.write("\n");
			bw.write(PhoneNum);
			bw.write("\n");
			bw.newLine();
			bw.flush();
			bw.close();

			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void set(OHwewon oHwewon) {
		this.id=oHwewon.getId();
		this.password=oHwewon.getPassword();
		this.name=oHwewon.getName();
		this.address=oHwewon.getAddress();
		this.hwakgwa=oHwewon.getHwakgwa();
		this.PhoneNum=oHwewon.getPhoneNum();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getHwakgwa() {
		return hwakgwa;
	}

	public void setHwakgwa(String hwakgwa) {
		this.hwakgwa = hwakgwa;
	}

	public String getPhoneNum() {
		return PhoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		PhoneNum = phoneNum;
	}



}
