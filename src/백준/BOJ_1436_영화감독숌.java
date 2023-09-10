package 백준;

import java.util.Scanner;

public class BOJ_1436_영화감독숌 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int theEnd = 666;
		int cnt = 1;
		
		while(cnt != N) {
			theEnd++;
			if(String.valueOf(theEnd).contains("666")) cnt++;
		}
		
		System.out.println(theEnd);
	}
}
