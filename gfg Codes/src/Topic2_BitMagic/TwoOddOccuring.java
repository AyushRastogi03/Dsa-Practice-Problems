package Topic2_BitMagic;

import java.util.Scanner;

public class TwoOddOccuring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             Scanner sc = new Scanner(System.in);
             
             int a = sc.nextInt();
             
             int[] arr = new int[a];
             
             for(int i=0;i<a;i++) {
            	 arr[i] = sc.nextInt();
            	 
             }
             
             int xor=0 ;
             for(int i=0;i<arr.length;i++) {
            	 xor = xor^arr[i];
             }
             System.out.println("xor" + xor);
             int x =xor & ~(xor-1);
             int res1=0,res2=0;
             System.out.println("x =" + x);
             for(int i=0;i<a;i++) {
            	 if((arr[i]&x)!=0) {
            		 res1 = res1 ^ arr[i];
            	 }
            	 else {
            		 res2 = res2 ^ arr[i];
            	 }
             }
             
             System.out.println("Res1 - " + res1 + " " + "Res2 - " + res2);
             
	}

}
