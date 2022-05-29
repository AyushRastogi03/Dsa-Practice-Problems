package Topic5_String;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class ReverseStringbyWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine() ;
		
		// 1 . Implementing Stack 
		
		ImpleStack(s);
		
		// 2 . reverse String -- using index 
//	       
//		    static void reverse(char str[],int low, int high){
//		    while(low<=high){
//		        //swap
//		        char temp=str[low];
//		        str[low]=str[high];
//		        str[high]=temp;
//		        //
//		        low++;
//		        high--;
//		    }
//		    }
//
//		    static void reverseWords(char str[],int n){
//		    int start=0;
//		    for(int end=0;end<n;end++){
//		        if(str[end]==' '){
//		            reverse(str,start,end-1);
//		            start=end+1;
//		        }
//		    }
//		    reverse(str,start,n-1);
//		    reverse(str,0,n-1);
//		    }
//		  
//		    public static void main(String args[]) 
//		    {   String s = "Welcome to Gfg";int n=s.length();
//		        char[] str = s.toCharArray();
//		        System.out.println("After reversing words in the string:");
//		        reverseWords(str,n);
//		        System.out.println(str);  
//		    } 
//		} 

	}
	
	
	public static void ImpleStack(String s) {
		
	Stack<String> st = new Stack<>()  ;
	String temp ="" ;
	for(int i=0;i<s.length();i++) {
		
		if(s.charAt(i)==' ') {
			st.add(temp); 
			 temp = ""; 
		}
		else {
			temp = temp + s.charAt(i);
		}
	}
	
	st.push(temp);
	

	  while(!st.isEmpty())
	  {
	    // Get the words in
	    // reverse order
	    temp = st.peek();
	    System.out.print(temp + " ");
	    st.pop();
	  }
	   
	  System.out.println();
     
	
}
}
