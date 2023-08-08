package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bj7795_먹을것인가먹힐것인가 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		for (int t = 1; t <= T; t++) { // 테스트케이스
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			int[] Aarr = new int[N];
			int[] Barr = new int[M];
			
			// A배열 B배열 선언
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < N; i++) Aarr[i] = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < M; i++) Barr[i] = Integer.parseInt(st.nextToken());
			
			Arrays.sort(Aarr);
			Arrays.sort(Barr);
			
			// 이진 탐색
			int res = 0;
			for(int i = 0; i < N; i++) {
				int cnt = 0;
				int start = 0;
				int end = M-1;
				while(start <= end) {
					int mid = (start + end) / 2;
					if(Aarr[i] > Barr[mid]) {
						cnt = mid + 1;
						start = mid + 1;
					} else {
						end = mid - 1;
					}
				}
				res += cnt;
			}
			System.out.println(res);
			
		} //테스트케이스
	}
}
