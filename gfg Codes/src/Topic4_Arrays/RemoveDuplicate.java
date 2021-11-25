package Topic4_Arrays;

import java.util.Scanner;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int a  = sc.nextInt() ;
		
		int[] arr = new int[a];
		for(int i=0;i<a;i++) {
			
			arr[i] = sc.nextInt();
		}
		
	Remove(arr,a);
	
//	for(int i=0;i<f.length;i++) {
//		System.out.println(f[i]);
//	}
	 
	 System.out.println("hello");

	}
	
	public static int[] Remove(int arr[], int a) {
		
		int[] temp = new int[a] ;
		int res =1 ;
		temp[0] = arr[0];
		for(int i=1;i<a;i++) {
			if(temp[res-1]!=arr[i]) {
				
				temp[res] = arr[i];
				res++;
			}
		}
		
		int[] ae = new int[res];
		for(int i=0;i<res;i++) {
			
			ae[i] = temp[i];
		}
		System.out.println("hello1");
		return ae ;
	}

}
