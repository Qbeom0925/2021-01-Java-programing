package control;

import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.InvalidParameterSpecException;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

import dataAccessObject.DId;
import dataAccessObject.DPassword;
import valueObject.OHwewon;
import valueObject.OPassword;

public class CPassword {
	private static String key = "SCKey";
	private String password;
	
	//로그인할 때 사용 -복호화
	public static String CLoginpw(String password) {
		String encrypted = null;
		try {
			encrypted = OPassword.decryptAES256(password, key);
		} catch (InvalidKeyException | NoSuchPaddingException | NoSuchAlgorithmException | InvalidKeySpecException
				| InvalidAlgorithmParameterException | BadPaddingException | IllegalBlockSizeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //복호화
		return encrypted;
	}
	
	//회원가입할 때 사용  -암호화
	public static String CDpw(String password){
		String encrypted = null;
		try {
			encrypted = OPassword.encryptAES256(password, key);
		} catch (InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | NoSuchPaddingException
				| InvalidParameterSpecException | UnsupportedEncodingException | BadPaddingException
				| IllegalBlockSizeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return encrypted;
	}

	public static void PwSearch(String id, String name, String phone){
		if(DPassword.DIdsearch(id ,name, phone)==false) {
			System.out.println("존재하지 않는 회원정보입니다.");
		}
	}

	public static void Pwchange(OHwewon oHwewon) {
		DPassword.DPwchange(oHwewon);
		System.out.println("비밀번호 성공 완료.");
	}
}
