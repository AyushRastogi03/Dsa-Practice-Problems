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
		
   int[] d = 	Remove(arr,a);
   
   for(int i=0;i<d.length;i++) {
	   System.out.print(d[i] + " ");
   }
	
   System.out.println();
	// Second method 
	
	int res=1 ;
	
	for(int i=1;i<a;i++) {
		if(arr[i]!=arr[res-1]) {
			
			arr[res] = arr[i];
			res++;
		}
				
	}
	System.out.println(res);


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
		
		return ae ;
	}

}
