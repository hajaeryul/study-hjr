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
		
		for(int i = 0; i < testcase; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int H = Integer.parseInt(st.nextToken()); // 세로
			int W = Integer.parseInt(st.nextToken()); // 가로
			int N = Integer.parseInt(st.nextToken()); // N번째 손님
			
			// (N % H) * 100 하면 층 수
			// (N % H)가 0이면 H * 100이 층 수
			
			// (N / H) + 1 하면 엘리베이터부터 거리
			// (N % H)가 0이면 (N / H)가 거리
			
			if((N % H) == 0) {
				System.out.println((H * 100) + (N / H));
			}else {
				System.out.println(((N % H) * 100) + ((N / H) + 1));
			}
		}
		
	}

}
