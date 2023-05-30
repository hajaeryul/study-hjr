package 백준;


import java.util.Scanner;

public class bj2292 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		
		// 1 1개는 1
		// 2~7 6개는 2
		// 8 ~ 19 12개는 3
		// 20 ~ 37 18개는 4
		// 38 ~ 61 24개는 5
		
		// 범위마다 count 1증가시키기
		// range = range + (count * 6)
		// 범위는 최소값 2
		
		int range = 2; 
		int count = 1; //최단 루트
		
		if(N == 1) {
			System.out.println(1);
		}else {
			while(range <= N) { // N이 범위(최소값)에 못들면 종료
				range = range + (count * 6); // 최단 루트가 하나 커질 때마다 범위는 6 * 최단루트로 증가
				count++;
			}
			System.out.println(count);
		}
	}

}
