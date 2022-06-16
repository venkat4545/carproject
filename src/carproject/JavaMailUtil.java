/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carproject;

/**
 *
 * @author USER
 */
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
public class JavaMailUtil {
    
    static Random random = new Random();
    static int otp = random.nextInt(999999);
    
    
    public static void sendMail(String recepient) throws MessagingException{
        System.out.println("preparing to send email....");
        Properties properties = new Properties();
        
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");    
        
        String myAccountEmail = "noreplycarproject@gmail.com";
        String password = "Carproject9866@";
        
        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(myAccountEmail,password);
            }
        });
 
         Message message = prepareMessage(session, myAccountEmail, recepient);
         
         Transport.send(message);
         JOptionPane.showMessageDialog(null,"OTP has sended successfully...");
         System.out.println("Message sent successfully");
    }

    private static Message prepareMessage(Session session, String myAccountEmail,String recepient) {
         
        try{
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(myAccountEmail));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
            
            message.setSubject("OTP For Car Project :");
            message.setText("Hey There, \n \n \nYour OTP is : "+otp);
            return message;
        }catch (Exception ex) {
            Logger.getLogger(JavaMailUtil.class.getName()).log(Level.SEVERE,null, ex);
            System.out.println(ex);
        }
        return null;
        
    }
    
    

}
