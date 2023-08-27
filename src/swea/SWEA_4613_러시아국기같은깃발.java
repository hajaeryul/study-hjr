package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_4613_러시아국기같은깃발 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		for(int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken()); // 몇 개의 줄
			int M = Integer.parseInt(st.nextToken()); // 몇 개의 문자
			char[][] flag = new char[N][M];
			for(int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				String str = st.nextToken();
				for(int j = 0; j < M; j++) {
					flag[i][j] = str.charAt(j);
				}
			} // 입력끝
			int min = Integer.MAX_VALUE;
			// 경계를 두 개(for문 2개) 임의로 지정.. 다 돌려보고 최솟값
			// t1 미만은 흰, t1이상 t2미만은 파랑, t2이상 N미만은 빨
			for(int t1 = 1; t1 < N - 1; t1++) {
				for(int t2 = t1 + 1; t2 < N; t2++) {
					int cnt = 0;
					for(int j = 0;  j < M; j++) {
						for(int i = 0; i < t1; i++) {
							if(flag[i][j] != 'W') cnt++;
						}
						for(int i = t1; i < t2; i++) {
							if(flag[i][j] != 'B') cnt++;
						}
						for(int i = t2; i < N; i++) {
							if(flag[i][j] != 'R') cnt++;
						}
					}
					min = Math.min(min, cnt);
				}
			}
			System.out.println("#" + tc + " " + min);
		}
	}
}
