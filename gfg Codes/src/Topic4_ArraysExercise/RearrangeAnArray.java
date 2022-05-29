package Topic4_ArraysExercise;

import java.util.ArrayList;
import java.util.Scanner;

public class RearrangeAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt() ;
		
		long[] arr = new long[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt() ;
		}
		
		Rearrange(arr, n);
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] + " ");
		}

	}

	 public static void Rearrange(long[] arr, int n) {
//		ArrayList<Integer> li = new ArrayList<>();
//		
//		for(int i=0;i<n;i++) {
//			int t = (int) arr[i];
//			li.add(t);
//		}
//		
//		for(int i=0;i<n;i++) {
//			arr[i] = li.get(li.get(i));
//		}
//		 
		// another Solution - better 
		
		 
        for (int i = 0; i < n; i++){
            long x = arr[i];
            long y = arr[(int)x];
            arr[i] = x + (y % n)*n;
    }
        // Second Step: Divide all values by n
        for (int i = 0; i < n; i++)
            arr[i] /= n;
    
		 
		
		 
	 }
}
