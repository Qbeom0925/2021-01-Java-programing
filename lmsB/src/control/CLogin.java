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

import dataAccessObject.DHwewonDeungrok;
import valueObject.OHwewon;
import valueObject.OLogin;

public class CLogin {

	private DHwewonDeungrok dHwewonDeungrok;
	public CLogin() {
		this.dHwewonDeungrok = new DHwewonDeungrok();
	}

	public OHwewon validate(OLogin oLogin){
		OHwewon oHwewon = this.dHwewonDeungrok.read(oLogin.getId());
		if(oHwewon != null) {
			if(oLogin.getPassword().equals(oHwewon.getPassword())) {
				return oHwewon;
			}
		}
		return null;
	}
	
	
}
