/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carproject;
import java.io.File;  
import java.io.IOException;  
import java.util.HashMap;  
import java.util.Map;  
import com.google.zxing.BarcodeFormat;  
import com.google.zxing.EncodeHintType;  
import com.google.zxing.MultiFormatWriter;  
import com.google.zxing.NotFoundException;  
import com.google.zxing.WriterException;  
import com.google.zxing.client.j2se.MatrixToImageWriter;  
import com.google.zxing.common.BitMatrix;  
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
/**
 *
 * @author USER
 */
public class generateqr {  
public static void generateQRcode(String data, String path, String charset, Map map, int h, int w) throws WriterException, IOException  
{  
BitMatrix matrix = new MultiFormatWriter().encode(new String(data.getBytes(charset), charset), BarcodeFormat.QR_CODE, w, h);  
MatrixToImageWriter.writeToFile(matrix, path.substring(path.lastIndexOf('.') + 1), new File(path));  
}    
public static void main(String args[]) throws WriterException, IOException, NotFoundException  
{  
String str= "raman";

String j=str+".png";
String path = "E:\\qrcode\\"+j;   
String charset = "UTF-8";  
Map<EncodeHintType, ErrorCorrectionLevel> hashMap = new HashMap<EncodeHintType, ErrorCorrectionLevel>();   
hashMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);    
generateQRcode(str, path, charset, hashMap, 200, 200);    
System.out.println("QR Code created successfully.");  
}  
} 


/*
authentication => QR code or OTP => OTP easily verifies=> QR code will be generated with 
their name in the local storage this will be based on their name during login  
=> reading the QR code 
 => the QR will be read from the local storage it should be choosen from the local storage.
=> as their QR code verifies with their name then proceed to the login. in this
case to verify he QR code we  should use the if loop .
=> if the user selects the other QR code it should saay an alert message "the  following QR was unable to login "
*/


