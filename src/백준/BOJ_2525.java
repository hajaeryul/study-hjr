package 백준;


import java.util.Scanner;

public class BOJ_2525 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		
		int min = (A * 60) + B;
		
		min += C;
		
		int H = (min / 60) % 24;
		int M = min % 60;
		
		System.out.println(H + " " + M);
	}

}
