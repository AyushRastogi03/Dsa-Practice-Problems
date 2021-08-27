package Topic2_BitMagicExercise;

import java.util.Scanner;

public class LongestConsecutiveOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc  = new Scanner(System.in);
        
        int s = sc.nextInt() ;
        
        while(s-->0) {
        	int t = sc.nextInt() ;
        	
        	Longest l = new Longest() ;
        	
        	System.out.println(l.Consecutive(t));
        }
	}

}

class Longest {
	public static int Consecutive(int t) {
		
		int Count=0,p=0 ;
		int m;
		while(t>0){
			m = t&1 ;
			
			if(m==1) {
				Count++ ;
				if(Count>p) {
					p=Count ;
				}
			}
			else {
				Count=0;
			}
					
			t =t >>1 ;
		}
		
		return p;
		
	}
}
