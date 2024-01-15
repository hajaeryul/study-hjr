package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_2174_로봇시뮬레이션 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken()); // 가로
		int B = Integer.parseInt(st.nextToken()); // 세로
		int[][] map = new int[B][A];
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 로봇 개수
		int M = Integer.parseInt(st.nextToken()); // 명령 개수
		
		List<char[]> robot = new ArrayList<>();
		char[] dir = {'N', 'E', 'S', 'W'};
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			robot.add(new char[] {st.nextToken().charAt(0), st.nextToken().charAt(0), st.nextToken().charAt(0)});
		}
		
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int rNum = Integer.parseInt(st.nextToken());
			char di = st.nextToken().charAt(0);
			int l = Integer.parseInt(st.nextToken());
			for(int j = 0; j < l; j++) {
				char[] cur = robot.get(rNum);
				switch (di) {
				case 'L':
					
					break;

				}
			}
		}
		
		
	}
}
