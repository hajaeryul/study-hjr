package 백준;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj2839 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		// 4, 7 제외하고는 무조건 3과 5의 합 >> -1
		// 5의 배수이면 /5 개
		// 5로 나눈 나머지 1이면 /5 + 1개
		// 5로 나눈 나머지 2이면 /5 + 2개
		// 5로 나눈 나머지 3이면 /5 + 1개
		// 5로 나눈 나머지 4이면 /5 + 2개
		
		if(N == 4 || N == 7) {
			System.out.println(-1);
		}else if(N % 5 == 0){
			System.out.println(N / 5);
		}else if(N % 5 == 1 || N % 5 == 3) {
			System.out.println((N / 5) + 1);
		}else if(N % 5 == 2 || N % 5 == 4) {
			System.out.println((N / 5) + 2);
		}

	}

}
