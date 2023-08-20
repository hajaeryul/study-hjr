package 백준;


import java.util.Scanner;

public class BOJ_2480 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		
		if(A == B && B == C) {
			System.out.println(10000 + (A * 1000));
		}else if(A == B){
			System.out.println(1000 + (A * 100));
		}else if(B == C) {
			System.out.println(1000 + (B * 100));
		}else if(C == A ) {
			System.out.println(1000 + (C * 100));
		}else {
			int big;
			if(A > B) {
				if(C > A) {
					big = C;
				}else {
					big = A;
				}
			}else {
				if(C > B) {
					big = C;
				}else {
					big = B;
				}
			}
			System.out.println(big * 100);
		}

	}

}
