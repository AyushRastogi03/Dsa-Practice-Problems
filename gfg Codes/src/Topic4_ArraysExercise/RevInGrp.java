package Topic4_ArraysExercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RevInGrp {

	public static void main(String[] args) {  // reverse subarray in group 
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     
     int n = sc.nextInt();
     int k = sc.nextInt();
     ArrayList<Integer> ar = new ArrayList<Integer>();
     
    for(int i=0;i<n;i++) {
    	ar.add(sc.nextInt());
    }
     
     ReverseInGrop(ar,n,k);
     
     for(int i:ar) {
    	 System.out.print(i+" ");
     }
     
	}
	
	public static void ReverseInGrop(ArrayList<Integer> arr, int n, int k){
		
		 // code here
	       int[] arry = arr.stream().mapToInt(i -> i).toArray();
	       arr.clear();
	       ArrayList<Integer> temp=new ArrayList<Integer>();
	       int c=0;
	       for(int i=0;i<arry.length;i++)
	       {
	           if(c++<k)
	           {
	               temp.add(arry[i]);
	           }
	           
	           if(c==k || i==arry.length-1)
	           {
	               Collections.reverse(temp);
	               arr.addAll(temp);
	               temp.clear();
	               c=0;
	           }
	       }
	}

}
