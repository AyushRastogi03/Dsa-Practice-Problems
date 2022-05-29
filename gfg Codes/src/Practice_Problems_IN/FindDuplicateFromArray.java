package Practice_Problems_IN;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FindDuplicateFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt() ;
		
		int arr[] = new int[n] ;
		
		for(int i=0;i<n;i++) {
		   
			arr[i] = sc.nextInt() ;
		}
		
		
	   int[] dupArr = Duplicate(arr) ;
	   
	   for(int i=0;i<dupArr.length;i++) {
		   System.out.println(dupArr[i]);
	   }
	} 
	
	public static int[] Duplicate(int[] arr) {
		
		Map<Integer,Integer> m = new HashMap<>() ;
		
		for(int i=0;i<arr.length;i++) {
			
			if(!m.containsKey(arr[i])) {
				m.put(arr[i],1);
			}
			else {
				m.put(arr[i],m.get(arr[i])+1);
			}			
		}			
		Set<Integer> s = new HashSet<>();
		
		for(Map.Entry<Integer,Integer> t : m.entrySet()) {
			if(t.getValue()>1) {
				s.add(t.getKey());
				
			}
		} 	
		  int[] t = new int[s.size()];		 
		
		  int p=0;
		  for(Integer i : s) {
			  t[p++] = i ;
		  }
		
		return t ;
	}
   
}
