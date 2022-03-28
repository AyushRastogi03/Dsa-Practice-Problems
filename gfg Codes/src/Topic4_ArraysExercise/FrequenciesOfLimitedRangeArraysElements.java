package Topic4_ArraysExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FrequenciesOfLimitedRangeArraysElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			arr.add(sc.nextInt());
		}
		System.out.println(arr);	
		
	    int[] ray = new int[n];
	    //Arrays.fill(ray,0); // filling all arrays elements as 0
	 
	    for(int i=0;i<ray.length;i++) {
	    	System.out.println(ray[i]);
	    }
		for(int a : arr) {
			   ray[a-1]++;
		}
		
		for(int i=0;i<n;i++)
		  System.out.print(ray[i]+" ");
	}

}
