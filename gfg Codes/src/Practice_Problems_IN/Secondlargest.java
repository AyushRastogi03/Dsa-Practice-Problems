package Practice_Problems_IN;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Secondlargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner sc = new Scanner(System.in);
		
		List<Integer> li = new ArrayList<>();
		
		
		for(int i=0;i<5;i++) {
			li.add(sc.nextInt());
			
		}
		 
		
		// second largest 
		
		int lar = li.get(0), sec = 0 ;
		for( int i=1;i<5;i++) {
			 
			
			if(li.get(i)>lar) {
				
				sec = lar ;
				
				lar = li.get(i) ;
			}
			else if(sec<li.get(i)) {
				sec = li.get(i);
			}
			
					
		} 
		
		
		System.out.println(lar + " " + sec);
		
		
	}

}
