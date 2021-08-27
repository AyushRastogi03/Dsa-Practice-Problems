package Topic1_MathematicsExercise;

import java.util.Scanner;

public class ModularMultiplicativeInverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int m = sc.nextInt();
        
        Solutions sol = new Solutions();
        
        
       int j =  sol.ModularMultiplicativeInverse(a,m);
        System.out.println(j);
	}
	
	

}

    class Solutions{
	
	public int ModularMultiplicativeInverse(int a,int m) {
		
		for(int i=0;i<m;i++) {
			if((a*i)%m ==1) {
				return i;
			}
		}
		return 0;
	}
}
