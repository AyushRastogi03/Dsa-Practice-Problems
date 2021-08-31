package Topic3_Recursion;

import java.util.Scanner;

public class GenerateSubsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		String t = "";
		
		int index =0;
		
	    Subsets(s,t,index);

	}
	
	public static void Subsets(String s,String t,int i) { 
		
		if(i == s.length()) {
			if(s.equals(t)) {  // To remove extra spacce at end 
				System.out.print(t);
				return;
			}
			System.out.print(t+" ");
			return ;
		}
		
		Subsets(s,t,i+1);                              // it will make a tree like structure for t- first "" then "A" then it will expand
		
		Subsets(s,t+s.charAt(i),i+1);
		
		
	}

}
