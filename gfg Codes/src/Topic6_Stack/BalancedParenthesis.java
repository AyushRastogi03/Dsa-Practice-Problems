package Topic6_Stack;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in) ;
		
		String s = sc.next() ;
		
		boolean b = isBalanced(s) ;
		
		System.out.println("IsBalanced - " + b);
  
	} 
	
	public static boolean isBalanced(String s) {
		
		Stack<Character> st = new Stack<>() ;
		
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c=='('||c=='{'||c=='[') {
				st.push(c) ;
			}
			else {
				if(st.isEmpty()==true) {
					return false ;
				}
				else if(matching(st.peek(),s.charAt(i))==false) {
					return false ;
				}
				else {
					st.pop();
				}
			}
		}
		
		return (st.isEmpty()==true);
	}
	
	public static boolean matching(char a,char b) {
		
	        return (( a=='(' && b==')' )||
	        		( a=='[' && b==']' )||( a=='{' && b=='}' ));
	        
	}

}
