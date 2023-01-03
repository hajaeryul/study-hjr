package 백준.기본수학상;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj2775 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 각 호의 거주민 수를 저장해야함... 2차원배열
		// 1호 ~ 14호 , 0층 ~ 14층
//		int apt[][] = new int[14][15];  0호가 없어서 (j-1)호 오류가난다..
		int apt[][] = new int[15][15];
		
		// 0층 i호는 i명
		for(int i = 0; i < 15; i++) {
			apt[0][i] = i;
		}
		
		// i층 1호는 1명
		for(int i = 1; i < 15; i++) {
			apt[i][1] = 1;
		}
		
		// 1층 2호는 (1층 1호) + (0층 2호)랑 같다 
		for(int i = 1; i < 15; i++) { // 1층부터 14층까지
			for(int j = 2; j < 15; j++) { // 2호부터 14호까지
				apt[i][j] = apt[i][j - 1] + apt[i - 1][j];
			}
		}
		
		int testcase = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < testcase; i++) {
			int k = Integer.parseInt(br.readLine()); // 몇 층
			int n = Integer.parseInt(br.readLine()); // 몇 호
			
			System.out.println(apt[k][n]);
		}

	}

}
