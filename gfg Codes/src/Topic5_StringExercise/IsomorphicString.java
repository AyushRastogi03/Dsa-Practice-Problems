package Topic5_StringExercise;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class IsomorphicString {
	
	/*
	 * 
	 * Input:
str1 = aab
str2 = xxy
Output: 1
Explanation: There are two different
charactersin aab and xxy, i.e a and b
with frequency 2and 1 respectively.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next() ;
		String t = sc.next() ;
		
		
		LinkedHashMap<Character,Integer> m = new LinkedHashMap<>();
		
		for(int i=0;i<s.length();i++) {
			
			if(!m.containsKey(s.charAt(i))) {
				m.put(s.charAt(i),1) ;
			}
			else {
				m.put(s.charAt(i),m.get(s.charAt(i))+1);
			}
		} 
		
		LinkedHashMap<Character,Integer> p = new LinkedHashMap<>();
		
       for(int i=0;i<t.length();i++) {
			
			if(!p.containsKey(t.charAt(i))) {
				p.put(t.charAt(i),1) ;
			}
			else {
				p.put(t.charAt(i),p.get(t.charAt(i))+1);
			}
		}
       
       
        Object[] arr1 = m.values().toArray() ;
        Object[] arr2 = p.values().toArray() ;
        
        int flag = 1 ;
        for(int i=0;i<arr1.length;i++) {
        	if(arr1[i]!=arr2[i]) {
        		System.out.println("Not isomorphic");
        		flag = 0 ;
        	}
        }
        
        if(flag == 1) {
        	System.out.println("Isomorphic");
        }
      

	}

}
