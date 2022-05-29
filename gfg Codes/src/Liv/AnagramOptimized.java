package Liv;

import java.util.Scanner;
//integral , triangle   // ignore case 
public class AnagramOptimized {   // we can also do it using hashmap but this is more optimized as we have constant auxilary space and O(n) time complexity

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next() ;
		String s2 = sc.next() ;
		
		
		boolean isAnagram = isAnagram(s,s2) ;
		
		System.out.println("ISAnaGram - "+isAnagram);
		
		sc.close();
	}
	
	
	public static boolean isAnagram(String s, String s2) {
		
		int[] arr = new int[256];
		
		if(s.length()!=s2.length())
			return false ;
		
		for(int i=0;i<s.length();i++) {
			arr[s.charAt(i)]++ ;
			arr[s2.charAt(i)]-- ;
		}
		
		for(int i=0;i<256;i++) {
			if(arr[i]!=0) {
				return false ;
			}
		}
		
		
		return true ;
	}

}
