package Topic4_ArraysExercise;

import java.util.ArrayList;
import java.util.Scanner;

public class LarAndSecLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt() ;
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		
		ar = larSec(arr,n);
		
		System.out.println("lar - " + ar.get(0) + " Sec - " + ar.get(1));
		
	}
	
	
	public static ArrayList<Integer> larSec(int[] arr , int n){
		
		ArrayList<Integer> m = new ArrayList<Integer>();
		
		int max= arr[0];
		int sec = -10;
		for(int i=1;i<n;i++) {
			if(max<arr[i]) {
				sec = max ;
				max = arr[i];
			}
			else if(max!=arr[i]) {
				
				if(sec==-10 || arr[i]>sec) {
					sec  = arr[i];
				}
			}
		}
		
		
		m.add(max);
		m.add(sec);
		
		return m ;
		
	}

}
