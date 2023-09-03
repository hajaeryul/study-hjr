package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_9663_NQueen {
	public static int N, cnt;
	public static int[] arr;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new int[N+1]; // arr[index] = 해당 index 행에 여왕이 위치한 열
		cnt = 0;
		nq(0);
		System.out.println(cnt);
	}
	
	public static void nq(int idx) {
		if (idx == N) { // 요까지 왔으면 N행까지 무사히 배치완료
            cnt++;
            return;
        }

        for (int j = 1; j <= N; j++) {
            arr[idx + 1] = j; // 다음 행 하나씩 넣어보자
            if (promising(idx + 1)) {// 알맞은 자리 못찾으면 아래 돌지않아
                nq(idx + 1);
            }
		}
	}
	
	public static boolean promising(int idx) {
		for (int i = 1; i < idx; i++) {
			// i행 여왕 위치한 열 == idx행 여왕 위치한 열 || 행의 차이 열의 차이가 같으면 대각선
			if (arr[i] == arr[idx] || Math.abs(arr[i] - arr[idx]) == Math.abs(i - idx)) {
				return false; // 같은 열에 있거나 대각선 상에 있는 경우
			}
		}
		return true;
	}
}