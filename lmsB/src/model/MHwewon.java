package model;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
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
		try {
			this.set(oHwewon);
		} catch (InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | NoSuchPaddingException
				| InvalidParameterSpecException | UnsupportedEncodingException | BadPaddingException
				| IllegalBlockSizeException | InvalidAlgorithmParameterException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		String input=id +' '+ password +' '+ name +' '+ address +' '+ hwakgwa +' '+ PhoneNum;
		try {
			bw.write(input);
			bw.newLine();			
			bw.flush();
			bw.close();

			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void set(OHwewon oHwewon) throws InvalidKeyException, NoSuchAlgorithmException, InvalidKeySpecException, NoSuchPaddingException, InvalidParameterSpecException, UnsupportedEncodingException, BadPaddingException, IllegalBlockSizeException, InvalidAlgorithmParameterException {
		this.id=oHwewon.getId();
		this.password=oHwewon.DgetPassword();
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
