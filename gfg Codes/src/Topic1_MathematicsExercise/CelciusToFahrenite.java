package Topic1_MathematicsExercise;

import java.util.Scanner;

public class CelciusToFahrenite {

	public static void main(String[] args) {
 		// TODO Auto-generated method stub
          Scanner sc = new Scanner(System.in);
          
          int T = sc.nextInt();
          while(T>0) {
        	  int C = sc.nextInt();
        	  
        	  Solution1 s  = new Solution1();
        	  
        	  System.out.println(s.cToF(C));
        	  
        	  
        	  T--;
          }
        		  
	}

}
class Solution1
{
    public double cToF(int C)
    {
        //Your code here
        
        int f = (C*9/5)+32 ;
        return f;
    }
}
