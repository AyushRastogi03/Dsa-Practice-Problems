package Topic4_Arrays;

import java.util.Scanner;

public class LargestandSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int a  =sc.nextInt() ;
		
		int[] arr = new int[a];
		
		for(int i=0;i<a;i++) {
			arr[i]=sc.nextInt() ;
			
		}
		
		int l = Largest(arr,a);
		
		int sl = SecondLargest(arr,a);
		
		System.out.println("Largest : " + l + "\n" + "Second Largest : " + sl);
	}
	
	public static int Largest(int[] arr , int a)
	{
		int t=-1;
		
		for(int i=0;i<a;i++) {
			if(arr[i]>t) {
				t= arr[i] ;
			}
		}
		
		return t ;
	}
	
	public static int SecondLargest(int[] arr , int a) {
		
		int p=-10,t=0 ;
		
		for(int i=0;i<a;i++) {
			if(arr[i]>t) {
				 p = t ;
				 
				 t = arr[i] ;
				
			}
			
			else if(arr[i]!=t) {
				if(p==-1 || arr[i]>p) {
					p  = arr[i];
				}
			}
			
		}
		
		return p ;
	}
	
}

