/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carproject;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.math.BigInteger;
/**
 *
 * @author Durga
 */
public class rev2 
{
     static BigInteger  m;
    private BigInteger  h; 
    private BigInteger p; 
    private BigInteger o;
    private BigInteger q;
    private BigInteger d; 
    private BigInteger  gg;
    private BigInteger  g; 
    private BigInteger x; 
    private BigInteger y;
    private BigInteger k;
    static int	bitlength = 5;
static Random	r;

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) 
 {
     r=new Random();
     
 Scanner sc = new Scanner(System.in);
 System.out.println("BLIND SIGN AUTHENTICATION AND VERIFICATION");
 BigInteger m;
 System.out.println("Enter the message 'm' = ");
 m=sc.nextBigInteger();
 
 BigInteger h;
 h=BigInteger.probablePrime(bitlength, r);
 System.out.println("Enter a value for 'h' ="+h);

 BigInteger p;
 p=BigInteger.probablePrime(bitlength, r);
 System.out.println("Enter a value for 'p' ="+p);

 BigInteger o=new BigInteger("1");
 BigInteger q;
 q=BigInteger.probablePrime(bitlength, r);
 System.out.println("Enter a value for 'q' ="+q);

 //KeyGeneration
 //Calculating g
 BigInteger gg=(p.subtract(o)).divide(q);
 BigInteger g=h.pow(gg.intValue()).mod(p);
 System.out.println("The value of g = " +g);
 //Private Key x
 BigInteger x;
 System.out.println("Enter value for 'x' =");
 x=sc.nextBigInteger();
 //Public key y
 BigInteger y=g.pow(x.intValue()).mod(p);
 //Public and private key
 System.out.println("1. KEY GENERATION");
 System.out.println("The public key 'y' is " +y);
 System.out.println("The private key 'x' is " +x);
 //secret key k
 BigInteger k;
 System.out.println("Enter the secret key 'k' = ");
k=sc.nextBigInteger();
 //Blind factor r
 
 
 
 BigInteger bff = g.modPow(k,p);
 BigInteger r = bff.mod(q);
 System.out.println("2. SIGN GENERATION");
 System.out.println("The Blind Factor 'bf' is " +r);
 //Blinded message bm
 BigInteger bmm= x.multiply(r).add(m);
 BigInteger kinv= k.modInverse(q);
 BigInteger bm= kinv.multiply(bmm).mod(q);
 System.out.println("The Blinded Message 'bm' is " +bm);
 //Sign Generation
 //Calculating u
 BigInteger uuu= bm.modInverse(q);
 BigInteger uu= r.multiply(uuu);
 BigInteger u = uu.mod(q);
 System.out.println("Sign Generation 'u' is "+ u +" ");
 //Sign Verification
 BigInteger sv = y.pow(u.intValue());
 BigInteger svvv=sv.mod(p);
 BigInteger sf=svvv.mod(q);
 System.out.println("3. SIGN VERIFICATION");
 System.out.println("Sign Verification 'v' is " +sf);
 boolean response = sf.equals(r);
 if (response)
 {
 System.out.println("Sign is True.");
 }
 else
 {
 System.out.println("Sign is False.");
 }
 }}