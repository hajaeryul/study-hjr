package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2468_안전영역 {
	static int N, max, sum, k, cnt;
	static int[][] chz;
	static boolean[][] chk;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
	
		N = Integer.parseInt(br.readLine());
		chz = new int[N][N];
		max = 1;
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < N; j++) {
				chz[i][j] = Integer.parseInt(st.nextToken());
			}
		}// 입력 완료
		
		for(k = 1; k <= 100; k++) {
			cnt = 0;
			chk = new boolean[N][N];
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					if(chz[i][j] > k && !chk[i][j]) {
						cnt++;
						dfs(i, j);
					}
				}
			}
			max = max > cnt ? max : cnt;
		}
		System.out.println(max);
		
	}

	static void dfs(int x, int y) {
		chk[x][y] = true;
		
		int[] dx = {-1, 1, 0, 0};
		int[] dy = {0, 0, -1, 1};
		
		for(int d = 0; d < 4; d++) {
			int a = x + dx[d];
			int b = y + dy[d];
			if(a >= 0 && a < N && b >= 0 && b < N && !chk[a][b] && chz[a][b] > k) {
				dfs(a, b);
			}
		}
	}
}