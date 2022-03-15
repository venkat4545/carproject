/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carproject;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class linearpkc {
    

public static void main(String[] args)
{
System.out.println("18MIS0185 MOHIT");
System.out.println("**********************");
Scanner sc = new Scanner(System.in);
System.out.println("Enter Message:");
int m = sc.nextInt();
System.out.println("Linear PKC");
int a = 5, b = 6, P = 13;
System.out.println("a=" + a + ",b=" + b + ",P=" + P);
int M = a * b - P;
System.out.println("M=" + M);
int E = M + a;
System.out.println("E=" + E);
int D = M + b;
System.out.println("D=" + D);
int N = (E * D - P) / M;
System.out.println("N=" + N);
int Q = euclid(P, N);
System.out.println("Q=" + Q);
int ct = (m * E) % N;
System.out.println("Encrypted Message:" + ct);
int dt = (ct * Q * D) % N;
System.out.println("Decrypted message:" + dt);
}
static int euclid(int P, int N) {
int m1, m2, q, r, t1 = 0, t2 = 1, T;
m1 = N;
m2 = P;
while (m2 > 0) {
q = m1 / m2;
r = m1 % m2;
T = t1 + q * t2;
m1 = m2;
m2 = r;
t1 = t2;
t2 = T;
if (m1 == 1 && m2 == 0) {
if (t1 > 0) {
return t1;
} else {
return t1 + t2;
}
}
}
System.out.println("**********************");
return 0;
}

}
