package Topic4_ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class MaxIntegerOccured {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
     
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] Lar =  new int[n];
		
		int[] Rar = new int[n];
		
		for(int i=0;i<n;i++) {
			Lar[i] = sc.nextInt();
		}
		int max =0;
		for(int i=0;i<n;i++) {
			Rar[i] = sc.nextInt();
			if(max<Rar[i]) {
				max = Rar[i];
			}
		}
		
		int t = MaxInteger(Lar,Rar,n,max);
		
		System.out.println("Max Integer Occured - " + t);
		
		
		
	}
	
	public static int MaxInteger(int[] Lar, int[] Rar , int n, int max) {
		int a[] = new int[max+1] ;
        Arrays.fill(a,0);
		int maxx=0,l=0;
		for(int i=0;i<n;i++) {
		for(int k=Lar[i];k<=Rar[i];k++) {
			a[k]++;
		//	if(maxx<a[k]) {
			//	maxx = a[k];
				//l=k;
			//}
		}}
		
       int t=Integer.MIN_VALUE;
        
        for(int i=0;i<max+1;i++){
            t=Math.max(t,a[i]);
        }
        
        for(int i=0;i<max+1;i++){
            if(a[i]==t) return i;
        }
        return -1;


		
		
	}

}
