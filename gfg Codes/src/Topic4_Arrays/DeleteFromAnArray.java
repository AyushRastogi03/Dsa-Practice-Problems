package Topic4_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DeleteFromAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		int[] n = new int[a];
		
		for(int i=0;i<a;i++) {
			n[i] = sc.nextInt() ;
		}
		
		int pos = sc.nextInt() ;
		
		if(pos > a) {
			System.out.println("0");
		}
		n[pos] = 0 ;
		for(int i=pos;i<a-1;i++) {
			n[i] = n[i+1];
		}
		
		for(int i=0;i<n.length;i++) {
			System.out.print(n[i]+ " ");
		}

//		List<int[]> arr=  Arrays.asList(n);
//		
//		System.out.println();
	}

}
