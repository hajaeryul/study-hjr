package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_17135_캐슬디펜스 {
	static int N, M, D;
	static int[][] map, tmp;
	static int[] archer;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken()); // 행
		M = Integer.parseInt(st.nextToken()); // 열
		D = Integer.parseInt(st.nextToken()); // 사거리
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < M; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}// 입력 완
		
		comb(0, 0);
	}
	
	// 궁수 세 명의 자리 뽑기
	static void comb(int cnt, int idx) {
		if(cnt == 3) {
			sol();
			return;
		}
		
		for(int i = idx; i < M; i++) {
			archer[cnt] = i;
			comb(cnt + 1, i + 1);
		}
	}
	
	static void sol() {
		// 사거리 내에 1(몬스터)들을 발견!!
		// 가까운 왼쪽 적부터 공격!! 딴놈이 잡은 적이면 안댐. (잡은 적 카운트)
		// 몬스터들 한 칸씩 밑으로!!
	}
}
