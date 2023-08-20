package 백준;


import java.util.Scanner;

public class BOJ_2739 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int mul = in.nextInt();
		
		for(int i = 1; i<10; i++) {
			System.out.println(mul+ " * " + i + " = " + mul * i);
		}

	}

}
