package Topic6_Stack;

import java.util.Stack;

public class ReverseStringByWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		String s = "I.Like.Programming.very.Much" ;
		System.out.println(s);
		String rev = Reverse(s) ;
		
		System.out.println("Reverse - " + rev); 
		
		
	}
	
	public static String Reverse(String s) { 
		
		String rev = "" ;
		
		Stack<String> st = new Stack<>() ;
		
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)=='.') {
				 
				st.push(rev) ;
				rev = "" ;
			}
			else {
				rev = rev + s.charAt(i);
			}
		}

		st.push(rev);
		
		String temp,r="" ;
		while(!st.isEmpty()) {
			temp = st.peek() ;
			
			if(st.size()>1)
			r = r + temp +"." ;
			else {
				r = r + temp ;
			}
			st.pop() ;
		}
	
		return r ;
	}

}
