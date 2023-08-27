package swea;

import java.util.Scanner;

public class SWEA_1926_간단한369게임 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i = 1; i <= N; i++) {
			int cnt = 0;
			for(int j = 0; j < Integer.toString(i).toCharArray().length; j++) {
				if(Integer.toString(i).toCharArray()[j] == '3' ||
					Integer.toString(i).toCharArray()[j] == '6' ||
					Integer.toString(i).toCharArray()[j] == '9') {
					cnt++;
				}
			}
			if(cnt == 0) System.out.print(i + " ");
			else {
				for(int j = 0; j < cnt; j++) {
					System.out.print("-");
				}
				System.out.print(" ");
			}
		}		
	}
}
