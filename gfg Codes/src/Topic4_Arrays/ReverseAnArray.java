package Topic4_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;



public class ReverseAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt() ;
		
		int[] a = new int[n];
		
		for(int i=0;i<n;i++) {
		 
			a[i] = sc.nextInt() ;
			
		}
		
		int high=n-1,low=0;
		int temp ;
		while(low<high) {
		temp = a[low] ;
		a[low] = a[high];
		a[high] = temp ;
		
		low++ ;
		high-- ;
		
		}
		
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}
		
		//List<Integer> list =  Arrays.stream(ints).boxed().collect(Collectors.toList());
		
	} 

}
