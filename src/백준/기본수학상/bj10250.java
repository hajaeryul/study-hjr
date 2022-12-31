package 백준.기본수학상;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj10250 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		
		int testcase = Integer.parseInt(br.readLine());
		int countH = 0; // 세로 카운트
		int countW = 0; //가로 카운트
		
		for(int i = 0; i < testcase; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int H = Integer.parseInt(st.nextToken()); // 세로
			int W = Integer.parseInt(st.nextToken()); // 가로
			int N = Integer.parseInt(st.nextToken()); // N번째 손님
			
			for(int j = 0; j < N; j++) {
				if(countW >= countH) {
					countW += 1;
					countH = 1;
				}else {
					countH++;
				}
			}
		}
		
		

	}

}
