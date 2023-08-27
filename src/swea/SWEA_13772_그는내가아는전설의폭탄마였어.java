package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_13772_그는내가아는전설의폭탄마였어 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		for(int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken()); // 배열의 크기
			int P = Integer.parseInt(st.nextToken()); // 폭탄 파워
			int[][] map = new int[N][N];
			int [][] delta = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}, // 상하좌우 
					{-1, -1}, {1, 1}, {1, -1}, {-1, 1}}; 
			for(int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j = 0; j < N; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
			}// 입력끝
			int sum;
			int max = 0;
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					for(int k = 0; k < 2; k++) {
						sum = map[i][j];
						for(int d = k * 4; d < k * 4 + 4; d++) {
							for(int p = 1; p <= P; p++) {
								int c = i + delta[d][0] * p;
								int r = j + delta[d][1] * p;
								if(c < 0 || c >= N || r < 0 || r >= N) continue;
								sum += map[c][r];
							}
						}
						max = Math.max(max, sum);
					}
				}
			}
			System.out.println("#" + tc + " " + max);
		}
	}
}
