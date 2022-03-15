/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carproject;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
/**
 *
 * @author USER
 */
public class EncryptionEBC {
    
/**
 *
 * @author likit
 */
    private final static String ALGO="AES/CBC/PKCSSPadding";
    public static void main(String[] args)throws NoSuchAlgorithmException,NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException, UnsupportedEncodingException{
        KeyGenerator key=KeyGenerator.getInstance("AES");
        key.init(128);
        SecretKey secretKey=key.generateKey();
        
        byte[] bs=new byte[16];
SecureRandom random=new SecureRandom();
random.nextBytes(bs);
IvParameterSpec ivParameterSpec= new IvParameterSpec(bs);

Cipher cipher= Cipher.getInstance(ALGO);
cipher.init(Cipher.ENCRYPT_MODE, secretKey, ivParameterSpec);

byte[] outputEncryption=cipher.doFinal("hello".getBytes());

String output=new String(outputEncryption,"UTF-8");
System.out.println(output);


cipher.init(Cipher.DECRYPT_MODE, secretKey, ivParameterSpec);
byte[] outputDecrypted=cipher.doFinal(output.getBytes());
System.out.println(new String(outputEncryption,"UTF-8"));
        
    }
    
}

