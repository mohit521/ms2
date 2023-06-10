/*package whatever //do not write package name here */

// Java code of above approach
// Importing required packages
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class Lsg {
	public static void main(String[] args)
	{

		try {
			KeyGenerator keygenerator=KeyGenerator.getInstance("DES");
			SecretKey myDesKey = keygenerator.generateKey();
			Cipher desCipher = Cipher.getInstance("DES");
			byte[] text= "I HATE U".getBytes("UTF8");
            desCipher.init(Cipher.ENCRYPT_MODE, myDesKey);	
			byte[] textEncrypted = desCipher.doFinal(text);
			String s = new String(textEncrypted);
			System.out.println(s);

			
		}
		catch (Exception e) {
			System.out.println("Exception");
		}
	}
}
