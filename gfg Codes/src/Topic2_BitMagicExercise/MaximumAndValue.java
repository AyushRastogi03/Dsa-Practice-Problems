package Topic2_BitMagicExercise;

import java.util.Scanner;

public class MaximumAndValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		 
		 int s = sc.nextInt() ;
		 
		 while(s--> 0 ) {
			 
			 int N = sc.nextInt() ;
			 int[] arr = new int[N] ;
			 for(int i=0;i<N;i++) {
				 arr[i] = sc.nextInt() ;
			 }
			 Max sw = new Max() ;
			 
			 System.out.println(sw.Maxi(arr,N));
		 }

	}

}

class Max {
     
//	public static int Maxi(int[] arr , int n) {
//		int i=0,k=0,ini=0;
//		while(i<n) {
//			  
//			for(int j=i+1;j<n;j++) {
//			 k = arr[i]&arr[j]; 
//			//System.out.println("k - " +k);
//			
//			
//			if(k>ini) {
//				ini = k;
//				//System.out.println("ini - " + ini);
//			}}
//			i++ ;
//			
//		}
//		return ini;
		
		   
		 public static int checkBit(int pattern, int arr[], int n) {
		        int count = 0;
		        System.out.println("pattern" + pattern);
		        for (int i = 0; i < n; i++){
		            if ((pattern & arr[i]) == pattern){
		                count++;
		            }
		        }
		        return count;
		    }
		    
		    // Function for finding maximum and value pair
		    public static int Maxi (int arr[], int n) {
		        int res = 0, count;
		        // iterate over total of 30bits from msb to lsb
		        for (int bit = 15; bit >= 0; bit--) {
		            // find the count of element having set  msb
		            count = checkBit(res | (1 << bit), arr, n);
		            // if count >= 2 set particular bit in result
		            System.out.println("res" + res + "  " + "count" + count + " bit" +bit );
		            if( count >= 2 ){
		                res |= (1 << bit);
		            }
		        }
		        return res;
	}
}
