package Topic4_ArraysExercise;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Given a sorted array of positive integers. Your task
 *  is to rearrange  the array elements alternatively i.e 
 *  first element should be max value, second should be min 
 *  value, third should be second max, fourth should be second
 *   min and so on.

Example 1:
Input:
N = 6
arr[] = {1,2,3,4,5,6}
Output: 6 1 5 2 4 3
Explanation: Max element = 6, min = 1, 
second max = 5, second min = 2, and 
so on... Modified array is : 6 1 5 2 4 3.
 * 
 */

public class RearrangeArrayAlternately {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i =0;i<n;i++) {
			arr[i]  =sc.nextInt() ;
		}
		
		// solution 1 
		CallingAr(arr,n);
		
		
		
		ArrayList<Integer> li = new ArrayList<>();
		for(int i=0;i<n;i++) {
			li.add(arr[i]);
		}
		
		System.out.println(li);
		
     // solution 2   -- better solution 
//		int c =0;
//		while(i<j) {
//			ar[c] = arr[j];
//			c++;
//			j--
//			if(i<j) {
//				ar[c] = arr[i];
//		        c++ ;
//		        i++ ; 
//			}
//		}
	}
	
	
	public static void CallingAr(int[] arr, int n) {
		
		int[] ar = new int[n];
		int c=0;
		for(int i=0;i<n;i++) {
			ar[c] = arr[n-1-i];
			
			System.out.println(ar[c]);
			
			 if(c==n-1)
				 break ;
			// if(i<n/2) {
				 c++ ;
				 ar[c]  = arr[i];
				 System.out.println(ar[c]);
				 if(c==n-1)
					 break ;
				   c++ ;
			// }
			 
			
		}
		
		for(int i=0;i<n;i++) {
			arr[i] = ar[i];
		}
	}

}
