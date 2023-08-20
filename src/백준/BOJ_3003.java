package 백준;


import java.util.Scanner;

public class BOJ_3003 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int k = 1;
		int q = 1;
		int r = 2;
		int b = 2;
		int kn = 2;
		int p = 8;
		
		k = k - in.nextInt();
		q = q - in.nextInt();
		r = r - in.nextInt();
		b = b - in.nextInt();
		kn = kn - in.nextInt();
		p = p - in.nextInt();
		
		System.out.println(k + " " + q + " " + r + " " + b + " "
				+ kn + " " + p + " ");
	}

}
