package Topic4_Arrays;

import java.util.Scanner;

public class MaxConsecutive1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		int[] arr = new int[a];
		
		for(int i=0;i<a;i++) {
			arr[i] = sc.nextInt() ;
		}
		
		int count=0,t=-10;
		for(int i=0;i<a;i++) {
			if(arr[i]==0) {
				if(t<count) {
					t = count;
				}
				count=0;
			}
			else
			  count++;
		}
		
		System.out.println(t);
	}

}
