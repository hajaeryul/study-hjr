package 백준;


import java.util.Scanner;

public class bj10950 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		
		for(int i=0; i<num; i++) {
			int A = in.nextInt();
			int B = in.nextInt();
			
			System.out.println(A+B);
		}

	}

}
