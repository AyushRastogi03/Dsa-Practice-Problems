package Topic1_MathematicsExercise;

import java.util.Scanner;

public class AbsoluteValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		while(T>0) {
			int I = sc.nextInt();
			Solution s = new Solution();
			
			System.out.println(s.absolute(I));
			T--;
		}
	}
}
	class Solution {
	    public int absolute(int I) {
	        // code here
	        if(I<0){
	            return 0 - I ;
	        }
	        else{
	            return I ;
	        }
	    }

		
	}

