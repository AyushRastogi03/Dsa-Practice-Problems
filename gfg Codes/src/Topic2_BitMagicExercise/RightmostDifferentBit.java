package Topic2_BitMagicExercise;

import java.util.Scanner;

public class RightmostDifferentBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		int m, n;
		while (t-- > 0) {
			Sol s = new Sol();
			m = sc.nextInt();
			n = sc.nextInt();
			System.out.println(s.differentBit(m, n));
		}

	}

}

class Sol {

	public static int differentBit(int m, int n) {

		int l, k, i = 0;

		while (n > 0 || m > 0) {
			i++;
			l = (m & 1);
			k = (n & 1);

			if (l != k) {
				return i;
			}
			n = n >> 1;
			m = m >> 1;
		}
		return 0;

		// better solution --------------------------------------------

//		 if(m==n){
//             System.out.println(-1);
//             continue;
//         }
//         int diff = m^n;
//         int num = (diff & (-diff));
//         int pos = (int)(Math.log(num)/Math.log(2))+1;
	}
}