package 백준.입출력과사칙연산;

import java.util.Scanner;

public class bj2588 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int A = in.nextInt();
		int B = in.nextInt();
		
		System.out.println(A * (B % 10));
		System.out.println(A * ((B / 10) % 10));
		System.out.println(A * (B / 100));
		System.out.println(A * B);

	}

}
